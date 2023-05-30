package com.itdoge.design.demo.test;

import com.itdoge.design.demo.CacheService;
import com.itdoge.design.demo.cuisine.impl.CacheServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ApiTest {

    @Test
    public void test_CacheService() {
        CacheService cacheService = new CacheServiceImpl();
        cacheService.set("user_name_01", "测试A", 1);
        String val01 = cacheService.get("user_name_01", 1);
        log.info("测试结果:{}", val01);
    }
}

