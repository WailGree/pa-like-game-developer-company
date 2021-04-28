package com.company.employee;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Group implements CountEmployee {
    private String name;
    private GroupLead groupLead;
    private Set<Employee> employees = new HashSet<>();

    public Group(String name) {
        this.name = name;
    }

    @Override
    public int CountEmployees() {
        return employees.size();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void delEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void setGroupLead(GroupLead groupLead) {
        this.groupLead = groupLead;
        groupLead.setGroup(this);
    }

    public BigDecimal calculateMonthlyCost() {
        BigDecimal cost = BigDecimal.valueOf(0);
        if (groupLead != null) {
            cost = cost.add(groupLead.calculateCost());
        }
        for (Employee employee : employees) {
            cost = cost.add(employee.calculateCost());
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", groupLead=" + groupLead +
                ", employees=" + employees +
                '}';
    }
}
