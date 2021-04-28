package com.company;

import com.company.employee.Group;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class GameDeveloperCompany {
    private Set<Group> groups = new HashSet<>();

    public void addGroup(Group group) {
        groups.add(group);
    }

    public void delGroup(Group group) {
        groups.remove(group);
    }

    public BigDecimal calculateMonthlyCost() {
        BigDecimal cost = BigDecimal.valueOf(0);
        for (Group group : groups) {
            cost = cost.add(group.calculateMonthlyCost());
        }
        return cost;
    }

    @Override
    public String toString() {
        return "GameDeveloperCompany{" +
                "groups=" + groups +
                '}';
    }
}