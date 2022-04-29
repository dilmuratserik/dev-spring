package com.dev.app.devspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ThreadController {
    private AtomicLong count = new AtomicLong();
    @GetMapping("/thread")
    public String increment() {
        System.out.println(Thread.currentThread().getName());
        for (long i = 0; i < 1_000_000_000l;i++){
            count.incrementAndGet();
        }
        System.out.println(count);
        return String.valueOf(count);
    }

}
