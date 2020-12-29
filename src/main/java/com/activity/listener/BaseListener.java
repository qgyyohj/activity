package com.activity.listener;

public interface BaseListener {
    default boolean handle(long customerId){
        return true;
    }
}
