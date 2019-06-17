package com.company.util;


import com.company.AirCompany;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingJSON implements ReadingUtil {
    @Override
    public AirCompany read() {

        AirCompany airCompany = null;
        try {
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(new FileReader("src\\aeroflot.json"));
            airCompany = gson.fromJson(reader, AirCompany.class);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return airCompany;
    }
}
