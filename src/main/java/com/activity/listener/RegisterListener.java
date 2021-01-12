package com.activity.listener;

public interface RegisterListener {
    /**
     * 用户注册监听
     * @param customerId 用户id
     * @param inviterId 邀请者id
     * @return true
     */
    boolean register(long customerId, long inviterId);
}
