package com.activity.listener.impl;

import com.activity.listener.ActivityListener;
import com.activity.listener.RegisterListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@Component
public class ActivityListenerImpl implements ActivityListener {

    @Autowired
    private List<RegisterListener> registerListeners;

    @Override
    public boolean onEventA(long customerId) {
        registerListeners.forEach(listener -> listener.handle(customerId));
        return true;
    }

    @Override
    public boolean onEventB(long customerId, BigDecimal amount) {
        return false;
    }

    @Override
    public boolean onEventC(long customerId, BigDecimal amount, Calendar calendar) {
        return false;
    }
}
