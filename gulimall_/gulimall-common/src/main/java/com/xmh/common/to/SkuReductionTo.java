package com.xmh.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author dinner
 * @description
 * @create 2021/8/18
 */
@Data
public class SkuReductionTo {
    private Long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;
}