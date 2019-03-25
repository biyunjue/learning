package com.yunfy.learning.patterns.strategy.refactor;

import com.yunfy.learning.patterns.strategy.State;

import java.math.BigDecimal;

/**
 * @author yunfy
 * @create 2019-03-25 19:14
 **/
public class ShenzhenShippingCalculation implements IShippingCalculation {


    @Override
    public State getState() {
        return State.Shenzhen;
    }

    @Override
    public BigDecimal calculate() {
        return BigDecimal.valueOf(20);
    }
}
