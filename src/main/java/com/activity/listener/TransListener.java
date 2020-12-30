package com.activity.listener;

import java.math.BigDecimal;

public interface TransListener {
    boolean trans(long id, BigDecimal amount);
}
