package com.activity;

import com.activity.listener.ActivityListener;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ActivityApplicationTests {

    ActivityListener listener;

    @Autowired
    public void setListener(ActivityListener listener) {
        this.listener = listener;
    }

    @Test
    void contextLoads() {
    }

    @Test
    public void testMultiHandler() {
        listener.register(1L, 2L);
    }

    @Test
    public void testTransListener() {
        listener.trans(2L, BigDecimal.ONE);
    }

}
