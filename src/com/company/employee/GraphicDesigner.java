package com.company.employee;

import java.math.BigDecimal;

public class GraphicDesigner extends Employee {
    public static final BigDecimal SALARY = BigDecimal.valueOf(1200);

    public GraphicDesigner(String name) {
        super(name);
    }

    @Override
    public BigDecimal calculateCost() {
        return SALARY;
    }

    @Override
    public String toString() {
        return "GraphicDesigner{" +
                "name=" + name +
                ", uuid=" + uuid +
                '}';
    }
}
