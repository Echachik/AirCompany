package com.company;

import com.company.airbus.AirBus321_100;
import com.company.airbus.Airobus318_100;
import com.company.boieng.Boeing737_400;
import com.company.boieng.Boeing737_800;
import com.company.exceptions.NegativeParameterException;
import com.company.plain.Plain;
import com.company.util.ReadingJSON;
import com.company.util.ReadinigDB;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NegativeParameterException {


        List<Plain> plains = new ArrayList<>();
        plains.add(new Boeing737_400());
        plains.add(new Boeing737_800());
        plains.add(new AirBus321_100());
        plains.add(new Airobus318_100());

        AirCompany runAir = new AirCompany("RunAir", plains);

        //test sorting method

        System.out.println("Test sorting by range of flight aircraft-RunAir");
        runAir.sortByRangeOfFlight();
        System.out.println("=============================================");

        //test find all passengers capacity method

        System.out.println("Test find all passengers capacity method aircraft-RunAir");
        int allPassengersCapacity = runAir.findAllPassengersCapacity();
        System.out.println("capacity of passengers equals " + allPassengersCapacity);
        System.out.println("=============================================");


        //test find  the total weight

        System.out.println("Test find  the total weight");
        double totalWeight = runAir.findTotalWeight();
        System.out.println("the total weight equals " + totalWeight);
        System.out.println("=============================================");


        //test find by parameters method

        System.out.println("Test find plains by parameters people capacity and speed aircraft - RunAir");
        List<Plain> byParameter = runAir.findByParameter(165, 170, 805, 810);
        System.out.println(byParameter);
        System.out.println("=============================================");

        // test reading from json
        System.out.println("Test reading from json file:aeroflot.json aircraft-Aeroflot");

        ReadingJSON readingJSON = new ReadingJSON();

        AirCompany aeroflot = readingJSON.read();

        System.out.println(aeroflot);
        System.out.println("=============================================");
        //test reading from DB Mysql
        System.out.println("Test reading from db mysql aircraft-belavia");
        ReadinigDB readinigDB = new ReadinigDB();
        AirCompany belavia = readinigDB.read();

        System.out.println(belavia);
        System.out.println("=============================================");
    }

}
