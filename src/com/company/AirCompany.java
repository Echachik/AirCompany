package com.company;

import com.company.exceptions.NegativeParameterException;
import com.company.plain.Plain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class AirCompany {

    String name;
    List<Plain> plains;

    public AirCompany(String name, List<Plain> plains) {
        this.name = name;
        this.plains = plains;
    }

    public void sortByRangeOfFlight() {
        Comparator<Plain> comparator = new Comparator<Plain>() {
            @Override
            public int compare(Plain o1, Plain o2) {
                return o1.getRangeOfFlight() - o2.getRangeOfFlight();
            }
        };

        Collections.sort(plains, comparator);
        System.out.println(plains);
    }

    //find plains by param: people capacity and speed
    public List<Plain> findByParameter(int minCapacity, int maxCapacity, int minSpeed, int maxSpeed) throws NegativeParameterException {

        List<Plain> listByParam = new ArrayList<>();

        if (maxCapacity < 0 || maxSpeed < 0 || maxCapacity < 0 || minSpeed < 0 || minCapacity < 0)
            throw new NegativeParameterException();

        for (Plain plain : plains) {
            if (plain.getSpeed() >= minSpeed && plain.getSpeed() <= maxSpeed && plain.getPeople_capasity() >= minCapacity && plain.getPeople_capasity() <= maxCapacity) {

                listByParam.add(plain);
            }
        }
        return listByParam;
    }


    //find all passengers capacity

    public int findAllPassengersCapacity() {

        int passengersCapacity = 0;

        for (Plain plain : plains) {

            passengersCapacity += plain.getPeople_capasity();
        }
        return passengersCapacity;
    }

    //Find the total weight

    public double findTotalWeight()
    {
        double totalWight = 0;

        for (Plain plain : plains) {

            totalWight  += plain.getWeight();
        }
        return totalWight;
    }


    @Override
    public String toString() {
        return "AirCompany{" +
                "name='" + name + '\'' +
                ", plains=" + plains +
                '}';
    }
}
