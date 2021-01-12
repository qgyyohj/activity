package com.activity.component;

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
    public boolean register(long customerId, long inviterId) {
        logger.info("活动a处理注册");
        return false;
    }
}
