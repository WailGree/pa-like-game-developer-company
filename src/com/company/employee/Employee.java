package com.company.employee;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Employee {
    private String name;
    private UUID uuid = UUID.randomUUID();


    public Employee(String name) {
        this.name = name;
    }

    public abstract BigDecimal calculateCost();


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", uuid=" + uuid +
                '}';
    }
}
