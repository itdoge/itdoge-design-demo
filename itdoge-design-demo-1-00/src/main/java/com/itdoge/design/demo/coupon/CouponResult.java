package com.itdoge.design.demo.coupon;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CouponResult {
    // 编码
    private String code;
    // 描述
    private String info;
}
