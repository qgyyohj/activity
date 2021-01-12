package com.activity.listener.impl;

import com.activity.listener.ActivityListener;
import com.activity.listener.RegisterListener;
import com.activity.listener.TransListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class ActivityListenerImpl implements ActivityListener {

    private List<RegisterListener> registerListeners;

    private List<TransListener> transListeners;

    @Autowired
    public void setRegisterListeners(List<RegisterListener> registerListeners) {
        this.registerListeners = registerListeners;
    }

    @Autowired
    public void setTransListeners(List<TransListener> transListeners) {
        this.transListeners = transListeners;
    }

    @Override
    public boolean register(long customerId, long inviterId) {
        registerListeners.forEach(listener -> listener.register(customerId, inviterId));
        return true;
    }

    @Override
    public boolean trans(long id, BigDecimal amount) {
        transListeners.forEach(listener -> listener.trans(id, amount));
        return true;
    }
}
