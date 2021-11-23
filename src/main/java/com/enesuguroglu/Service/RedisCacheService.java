package com.enesuguroglu.Service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(cacheNames = "Cache1")
    public String longRunningMethod() throws InterruptedException{
        Thread.sleep(5000L);
        return "method worked";
    }
}
