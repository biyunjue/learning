package com.yunfy.learning.patterns.strategy.refactor;

import com.yunfy.learning.patterns.strategy.State;

import java.math.BigDecimal;

/**
 * @author yunfy
 * @create 2019-03-25 19:14
 **/
public class GuangzhouShippingCalculation implements IShippingCalculation {


    @Override
    public State getState() {
        return State.Guangzhou;
    }

    @Override
    public BigDecimal calculate() {
        return BigDecimal.valueOf(15);
    }
}
