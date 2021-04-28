package com.company.employee;

import java.math.BigDecimal;

public class Developer extends Employee {
    public static final BigDecimal JUNIOR_SALARY = BigDecimal.valueOf(1500);
    public static final BigDecimal MIDDLE_SALARY = BigDecimal.valueOf(2000);
    public static final BigDecimal SENIOR_SALARY = BigDecimal.valueOf(2500);
    private Experience experience;

    public Developer(String name) {
        super(name);
    }

    public Developer(String name, Experience experience) {
        super(name);
        this.experience = experience;
    }

    @Override
    public BigDecimal calculateCost() {
        if (experience != null) {
            switch (experience) {
                case JUNIOR:
                    return JUNIOR_SALARY;
                case MIDDLE:
                    return MIDDLE_SALARY;
                case SENIOR:
                    return SENIOR_SALARY;
                default:
                    return BigDecimal.valueOf(0);
            }
        }
        return BigDecimal.valueOf(0);
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name=" + name +
                ", experience=" + experience +
                ", uuid=" + uuid +
                '}';
    }
}
