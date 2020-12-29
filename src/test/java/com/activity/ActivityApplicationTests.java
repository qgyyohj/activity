package com.activity;

import com.activity.listener.ActivityListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ActivityApplicationTests {

    @Autowired
    ActivityListener listener;

    @Test
    void contextLoads() {
    }

    @Test
    public void testMultiHandler() {
        listener.onEventA(1L);
    }

    @Test
    public void testTransListener() {
        listener.onEventB(2L, BigDecimal.ONE);
    }

}
