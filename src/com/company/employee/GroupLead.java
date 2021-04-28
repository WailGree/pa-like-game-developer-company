package com.company.employee;

import java.math.BigDecimal;

public class GroupLead extends Employee {
    public static final BigDecimal BASIC_SALARY = BigDecimal.valueOf(1800);
    public static final BigDecimal PER_EMPLOYEE_SALARY = BigDecimal.valueOf(200);
    private CountEmployee group;

    public GroupLead(String name) {
        super(name);
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public BigDecimal calculateCost() {
        BigDecimal cost = BASIC_SALARY;
        BigDecimal value = PER_EMPLOYEE_SALARY.multiply(BigDecimal.valueOf(group.CountEmployees()));
        cost = cost.add(value);
        return cost;
    }
}
