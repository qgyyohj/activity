package com.activity.listener;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Calendar;

@Component
public interface ActivityListener {

    boolean onEventA(long customerId);

    boolean onEventB(long customerId, BigDecimal amount);

    boolean onEventC(long customerId, BigDecimal amount, Calendar calendar);
}
