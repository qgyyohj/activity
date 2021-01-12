package com.activity.component;

import com.activity.listener.RegisterListener;
import com.activity.listener.TransListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Order(1)
public class ActivityB implements RegisterListener, TransListener {

    private final Logger logger = LoggerFactory.getLogger("activity-b");

    @Override
    public boolean register(long customerId, long inviterId) {
        logger.info("活动b处理注册, id:{}", customerId);
        return false;
    }

    @Override
    public boolean trans(long id, BigDecimal amount) {
        logger.info("活动b处理交易, id:{}, amount:{}", id, amount);
        return false;
    }
}
