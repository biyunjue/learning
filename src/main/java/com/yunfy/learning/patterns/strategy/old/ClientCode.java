package com.yunfy.learning.patterns.strategy.old;

import com.yunfy.learning.patterns.strategy.State;

import java.math.BigDecimal;

/**
 * @author yunfy
 * @create 2019-03-25 19:09
 **/
public class ClientCode {

    public static void main(String[] args) {
        ShippingInfo shippingInfo = new ShippingInfo();
        BigDecimal shippingAmount = shippingInfo.CalculateShippingAmount(State.Dongguan);
        System.out.println(shippingAmount);
    }

}
