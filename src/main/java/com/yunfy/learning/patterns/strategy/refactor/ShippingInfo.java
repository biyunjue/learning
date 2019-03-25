package com.yunfy.learning.patterns.strategy.refactor;

import com.yunfy.learning.patterns.strategy.State;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yunfy
 * @create 2019-03-25 19:18
 **/
public class ShippingInfo implements IShippingInfo {

    private final static Map<State, IShippingCalculation> SHIPPING_CALCULATIONS = new HashMap<>(16);

    static {
        SHIPPING_CALCULATIONS.put(State.Dongguan, new DongguanShippingCalculation());
        SHIPPING_CALCULATIONS.put(State.Guangzhou, new GuangzhouShippingCalculation());
        SHIPPING_CALCULATIONS.put(State.Shenzhen, new ShenzhenShippingCalculation());
    }

    /**
     * 计算运费
     *
     * @param state
     * @return
     */
    @Override
    public BigDecimal calculateShippingAmount(State state) {
        IShippingCalculation iShippingCalculation = SHIPPING_CALCULATIONS.get(state);
        return iShippingCalculation == null ? new GuangzhouShippingCalculation().calculate() : iShippingCalculation.calculate();
    }
}
