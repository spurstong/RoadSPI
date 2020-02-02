package com.road.spi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A2ServiceImpl implements AService {
    @Autowired
    private BService bService;
    @Override
    public void info() {
        System.out.println("A2 ServiceImpl:");
        bService.info();
    }
}
