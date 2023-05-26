package com.itdoge.design.demo.store.impl;

import com.alibaba.fastjson.JSON;
import com.itdoge.design.demo.coupon.CouponResult;
import com.itdoge.design.demo.coupon.CouponService;
import com.itdoge.design.demo.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 优惠券发放服务类
 */
@Slf4j
public class CouponCommodityService implements ICommodity {
    private CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        log.info("请求参数[优惠券] => uId:{} commodityId:{} bizId:{} extMap:{}", uId, commodityId, bizId, extMap);
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        log.info("测试结果[优惠券]：{}}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) {
            throw new RuntimeException(couponResult.getInfo());
        }

    }
}
