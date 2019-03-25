package com.yunfy.learning.patterns.strategy.refactor;

import com.yunfy.learning.patterns.strategy.State;

import java.math.BigDecimal;

/**
 * @author yunfy
 */
public interface IShippingInfo {

    BigDecimal calculateShippingAmount(State state);
}
