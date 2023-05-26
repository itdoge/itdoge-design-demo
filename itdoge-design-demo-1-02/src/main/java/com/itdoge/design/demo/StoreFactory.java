package com.itdoge.design.demo;

import com.itdoge.design.demo.store.ICommodity;
import com.itdoge.design.demo.store.impl.CardCommodityService;
import com.itdoge.design.demo.store.impl.CouponCommodityService;
import com.itdoge.design.demo.store.impl.GoodsCommodityService;

public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        switch (commodityType)
        {
            case 1:
                return new CouponCommodityService();
            case 2:
                return new GoodsCommodityService();
            case 3:
                return new CardCommodityService();
            default:
                return null;
        }
    }
}
