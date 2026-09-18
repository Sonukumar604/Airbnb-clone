package com.AirbnbProject.airBnbApp.strategy;


import com.AirbnbProject.airBnbApp.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
