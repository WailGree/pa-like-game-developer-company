package com.company.employee;

import java.math.BigDecimal;

public class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public BigDecimal calculateCost() {
        return null;
    }
}
