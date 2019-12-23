package com.jaden.pattern.delegate.mvc;


import com.jaden.pattern.delegate.mvc.controllers.MemberController;
import com.jaden.pattern.delegate.mvc.controllers.OrderController;
import com.jaden.pattern.delegate.mvc.controllers.SystemController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DispatchServlet extends HttpServlet {


    private List<Handler> handlerMapping = new ArrayList<Handler>();

    @Override
    public void init() throws ServletException {
        try {
            Class<?> memberControllerClass = MemberController.class;
            handlerMapping.add(new Handler().setController(memberControllerClass)
                    .setMethod(memberControllerClass.getMethod("getMemberById", new Class[]{String.class}))
                    .setUrl("/member/getMemberById.do"));

        } catch (Exception e) {
            e.printStackTrace();;
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            dispatch(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void dispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");

//        if ("getMemberById".equals(uri)) {
//            new MemberController().getMemberById(mid);
//        } else if ("getOrderById".equals(uri)) {
//            new OrderController().getOrderById(mid);
//        } else if ("logout".equals(uri)) {
//            new SystemController().logout();
//        } else {
//            resp.getWriter().write("404 Not Found.");
//        }
        Handler handler = null;
        for (Handler h : handlerMapping) {
            if (uri.equals(h.getUrl())) {
                handler = h;
                break;
            }
        }

        Object object = null;
        try {
            object = handler.getMethod().invoke(handler.getController(), mid);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    class Handler {
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }
}
