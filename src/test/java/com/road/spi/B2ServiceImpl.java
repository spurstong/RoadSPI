package com.road.spi;

import org.springframework.stereotype.Component;

@Component
public class B2ServiceImpl implements BService {
    @Override
    public void info() {
        System.out.println("B2 service");
    }
}
