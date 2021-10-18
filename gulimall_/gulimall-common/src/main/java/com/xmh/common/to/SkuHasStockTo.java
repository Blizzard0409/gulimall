package com.xmh.common.to;

import lombok.Data;

@Data
public class SkuHasStockTo {
    private Long skuId;
    private boolean hasStock;

    public boolean getHasStock(){
        return this.hasStock;
    }
}
