package com.itdoge.design.demo.impl;

import com.itdoge.design.demo.CacheService;
import com.itdoge.design.demo.factory.JDKProxy;
import com.itdoge.design.demo.factory.impl.EGMCacheAdapter;
import com.itdoge.design.demo.factory.impl.IIRCacheAdapter;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CacheServiceImplTest extends TestCase {

    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "测试1");
        String val01 = proxy_EGM.get("user_name_01");
        log.info("测试结果：{}", val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_EGM.set("user_name_02", "测试2");
        String val02 = proxy_IIR.get("user_name_02");
        log.info("测试结果：{}", val02);
    }
}