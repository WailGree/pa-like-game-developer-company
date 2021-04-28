package com.company;

import com.company.employee.Developer;
import com.company.employee.GraphicDesigner;
import com.company.employee.Group;
import com.company.employee.GroupLead;

public class Main {

    public static void main(String[] args) {
        example();
    }

    private static void example() {
        GameDeveloperCompany gameDeveloperCompany = new GameDeveloperCompany();
        Group group1 = new Group("Group 1");
        Group group2 = new Group("Group 2");
        GroupLead groupLead1 = new GroupLead("groupLead1");
        GroupLead groupLead2 = new GroupLead("groupLead2");
        group1.setGroupLead(groupLead1);
        group2.setGroupLead(groupLead2);
        GraphicDesigner graphicDesigner1 = new GraphicDesigner("graphicDesigner1");
        GraphicDesigner graphicDesigner2 = new GraphicDesigner("graphicDesigner2");
        GraphicDesigner graphicDesigner3 = new GraphicDesigner("graphicDesigner3");
        GraphicDesigner graphicDesigner4 = new GraphicDesigner("graphicDesigner4");
        GraphicDesigner graphicDesigner5 = new GraphicDesigner("graphicDesigner5");
        GraphicDesigner graphicDesigner6 = new GraphicDesigner("graphicDesigner6");
        Developer developer1 = new Developer("developer1");
        Developer developer2 = new Developer("developer2");
        Developer developer3 = new Developer("developer3");
        Developer developer4 = new Developer("developer4");
        Developer developer5 = new Developer("developer5");
        Developer developer6 = new Developer("developer6");
        group1.addEmployee(graphicDesigner1);
        group1.addEmployee(graphicDesigner2);
        group1.addEmployee(graphicDesigner3);
        group2.addEmployee(graphicDesigner4);
        group2.addEmployee(graphicDesigner5);
        group2.addEmployee(graphicDesigner6);
        System.out.println(group1.calculateMonthlyCost());
        System.out.println(group2.calculateMonthlyCost());
        gameDeveloperCompany.addGroup(group1);
        gameDeveloperCompany.addGroup(group2);
        System.out.println(gameDeveloperCompany.calculateMonthlyCost());
    }
}
