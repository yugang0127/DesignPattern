package com.jaden.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee {
    private Map<String, IEmployee> targets = new HashMap<String, IEmployee>();
    public Leader() {
        targets.put("登录", new EmployeeA());
        targets.put("订单", new EmployeeB());
    }

    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
