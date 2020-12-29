package com.activity.listener.impl;

import com.activity.listener.RegisterListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ActivityA implements RegisterListener {

    private final Logger logger = LoggerFactory.getLogger("activity-a");

    @Override
    public boolean handle(long customerId) {
        logger.info("活动a处理注册");
        return false;
    }
}
