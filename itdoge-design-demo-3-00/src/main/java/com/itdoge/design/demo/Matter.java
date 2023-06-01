package com.itdoge.design.demo;

import java.math.BigDecimal;

/**
 * 物料
 */
public interface Matter {
    /**
     * 场景
     *
     * @return
     */
    String scene();

    /**
     * 品牌
     *
     * @return
     */
    String brand();

    /**
     * 型号
     *
     * @return
     */
    String model();

    /**
     * 平米报价
     *
     * @return
     */
    BigDecimal price();

    /**
     * 描述
     *
     * @return
     */
    String desc();
}
