package com.jaden.pattern.observer.events;

import com.jaden.pattern.observer.events.mouseevent.Mouse;
import com.jaden.pattern.observer.events.mouseevent.MouseEventCallback;
import com.jaden.pattern.observer.events.mouseevent.MouseEventType;

public class MouseEventTest {
    public static void main(String[] args) {
        try {
            MouseEventCallback callback = new MouseEventCallback();
            Mouse mouse = new Mouse();

            mouse.addListener(MouseEventType.ON_CLICK, callback);
            mouse.addListener(MouseEventType.ON_MOVE, callback);
            mouse.addListener(MouseEventType.ON_WHEEL, callback);
            mouse.addListener(MouseEventType.ON_OVER, callback);
            //调用方法
            mouse.click();
            //失焦事件
            mouse.blur();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
