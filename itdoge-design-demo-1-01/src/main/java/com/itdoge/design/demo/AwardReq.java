package com.itdoge.design.demo;

import lombok.Data;

import java.util.Map;

@Data
public class AwardReq {
    // 用户唯一ID
    private String uId;
    // 奖品类型; 1.优惠券 2.实物商品 3.第三方兑换卡
    private Integer awardType;
    // 奖品编号；sku、couponNUmber、cardId
    private String awardNumber;
    // 业务ID，防重复
    private String bizId;
    // 扩展信息
    private Map<String, String> extMap;
}
