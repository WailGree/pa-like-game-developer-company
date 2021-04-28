package com.company;

import com.company.employee.*;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        example(6, 6);
    }

    private static void example(int developerAmount, int graphicDesignerAmount) {
        // Object creation
        GameDeveloperCompany gameDeveloperCompany = new GameDeveloperCompany();
        Group group1 = new Group("Group 1");
        Group group2 = new Group("Group 2");
        GroupLead groupLead1 = new GroupLead("groupLead1");
        GroupLead groupLead2 = new GroupLead("groupLead2");
        ArrayList<Developer> developers = createDevelopers(developerAmount);
        ArrayList<GraphicDesigner> graphicDesigners = createGraphicDesigners(graphicDesignerAmount);

        // Placement of Employees
        group1.setGroupLead(groupLead1);
        group2.setGroupLead(groupLead2);
        gameDeveloperCompany.addGroup(group1);
        gameDeveloperCompany.addGroup(group2);
        splitAmongstGroups(developers, graphicDesigners, group1, group2);

        // Display of result
        System.out.println(group1);
        System.out.println(group2);
        System.out.println(gameDeveloperCompany.calculateMonthlyCost());
    }

    private static void splitAmongstGroups(ArrayList<Developer> developers, ArrayList<GraphicDesigner> graphicDesigners, Group group1, Group group2) {
        int index;
        int devSize = developers.size();
        int graphSize = graphicDesigners.size();
        if (devSize <= graphSize)
            index = graphicDesigners.size();
        else
            index = developers.size();
        for (int i = 0; i < index; i++) {
            if ((i + 1) % 2 == 0) {
                if (devSize <= index)
                    group1.addEmployee(developers.get(i));
                if (graphSize <= index)
                    group1.addEmployee(graphicDesigners.get(i));
            } else {
                if (devSize <= index)
                    group2.addEmployee(developers.get(i));
                if (graphSize <= index)
                    group2.addEmployee(graphicDesigners.get(i));
            }
        }
    }


    private static ArrayList<Developer> createDevelopers(int amount) {
        ArrayList<Developer> developers = new ArrayList<>();
        for (int i = 1; i <= amount; i++) {

            Experience experience = decideExperience();
            developers.add(new Developer("developer" + i, experience));
        }
        return developers;
    }

    private static Experience decideExperience() {
        int randomNum = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        switch (randomNum) {
            case 2:
                return Experience.MIDDLE;
            case 3:
                return Experience.SENIOR;
            default:
                return Experience.JUNIOR;
        }
    }

    private static ArrayList<GraphicDesigner> createGraphicDesigners(int amount) {
        ArrayList<GraphicDesigner> graphicDesigners = new ArrayList<>();
        for (int i = 1; i <= amount; i++) {
            graphicDesigners.add(new GraphicDesigner("graphicDesigner" + i));
        }
        return graphicDesigners;
    }
}
