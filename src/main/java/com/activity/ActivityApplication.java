package com.activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.PriorityQueue;

@SpringBootApplication
public class ActivityApplication {

    public static void main(String[] args) {

        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> b - a);
        // SpringApplication.run(ActivityApplication.class, args);
    }

}
