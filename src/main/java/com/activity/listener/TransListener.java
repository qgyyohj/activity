package com.activity.listener;

import java.math.BigDecimal;

public interface TransListener extends BaseListener{
    boolean handle(long id, BigDecimal amount);
}
