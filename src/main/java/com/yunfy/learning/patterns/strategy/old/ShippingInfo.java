package com.yunfy.learning.patterns.strategy.old;

import com.yunfy.learning.patterns.strategy.State;

import java.math.BigDecimal;


/**
 * @author yunfy
 * @create 2019-03-25 19:00
 **/
public class ShippingInfo {

    public BigDecimal CalculateShippingAmount(State shipToState) {
        switch (shipToState) {
            case Guangzhou:
                return getGuangzhouShippingAmount();
            case Dongguan:
                return getDongguanShippingAmount();
            case Shenzhen:
                return getShenzhenShippingAmount();
            default:
                return BigDecimal.valueOf(0);
        }
    }

    private BigDecimal getGuangzhouShippingAmount() {
        return BigDecimal.valueOf(15);
    }

    private BigDecimal getDongguanShippingAmount() {
        return BigDecimal.valueOf(10);
    }

    private BigDecimal getShenzhenShippingAmount() {
        return BigDecimal.valueOf(20);
    }
}
