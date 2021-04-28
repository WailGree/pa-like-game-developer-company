package com.company.employee;

import java.math.BigDecimal;

public class GroupLead extends Employee {
    public GroupLead(String name) {
        super(name);
    }

    @Override
    public BigDecimal calculateCost() {
        return null;
    }
}
