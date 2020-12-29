package com.activity.listener;

import java.math.BigDecimal;
import java.util.Calendar;

public interface ActivityListener {

    boolean onEventA(long customerId);

    boolean onEventB(long customerId, BigDecimal amount);

    boolean onEventC(long customerId, BigDecimal amount, Calendar calendar);
}
