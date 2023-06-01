package com.itdoge.design.demo;

import com.itdoge.design.demo.ceilling.LevelOneCeiling;
import com.itdoge.design.demo.ceilling.LevelTwoCeiling;
import com.itdoge.design.demo.coat.DuluxCoat;
import com.itdoge.design.demo.coat.LiBangCoat;
import com.itdoge.design.demo.floor.ShengXiangFloor;
import com.itdoge.design.demo.tile.DongpengTile;
import com.itdoge.design.demo.tile.MarcoPoloTile;

public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongpengTile());        // 地砖，东鹏
    }
}
