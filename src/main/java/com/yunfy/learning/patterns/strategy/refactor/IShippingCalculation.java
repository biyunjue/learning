package com.yunfy.learning.patterns.strategy.refactor;

import com.yunfy.learning.patterns.strategy.State;

import java.math.BigDecimal;

/**
 * @author yunfy
 */
public interface IShippingCalculation {
    /**
     * 获取策略名
     *
     * @return
     */
    State getState();

    /**
     * 策略实现
     *
     * @return
     */
    BigDecimal calculate();
}
