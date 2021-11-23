package com.enesuguroglu.Service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    //Simple example method for cache service
    //After succesfull caching we wont see 5 second sleep time during api response
    @Cacheable(cacheNames = "Cache1")
    public String longRunningMethod() throws InterruptedException{
        Thread.sleep(5000L);
        return "method worked";
    }
    //Method to clear cache
    @CacheEvict(cacheNames = "Cache1")
    public void clearCache(){
        System.out.println("cache cleared");
    }
}
