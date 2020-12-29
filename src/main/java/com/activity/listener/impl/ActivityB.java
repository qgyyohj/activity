package com.activity.listener.impl;

import com.activity.listener.RegisterListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ActivityB implements RegisterListener {

    private final Logger logger = LoggerFactory.getLogger("activity-b");

    @Override
    public boolean handle(long customerId) {
        logger.info("活动b处理注册");
        return false;
    }
}
