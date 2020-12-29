package com.activity.listener.impl;

import com.activity.listener.TransListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Order(3)
public class ActivityC implements TransListener {

    private final Logger logger = LoggerFactory.getLogger("activity-c");

    @Override
    public boolean handle(long id, BigDecimal amount) {
        logger.info("活动c处理交易, id:{}, amount:{}", id, amount);
        return false;
    }
}
