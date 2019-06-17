package com.company.util;


import com.company.AirCompany;
import com.company.airbus.AirBus321_100;
import com.company.airbus.Airobus318_100;
import com.company.boieng.Boeing737_400;
import com.company.boieng.Boeing737_800;
import com.company.boieng.Boeing737_900ER;
import com.company.plain.Plain;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReadinigDB implements ReadingUtil {


    @Override
    public AirCompany read() {

        List<Plain> plains = new ArrayList<>();
        AirCompany airCompany = null;
        Statement statement = null;
        String nameOfCompany = null;
        Connection connection = getConnetion();


        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT name From aircraft");
            while (resultSet.next()) {
                nameOfCompany = resultSet.getString("name");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT *  FROM airplain");
            while (resultSet.next()) {
                String model = resultSet.getString("model");
                if (model.equals("737-400")) {
                    plains.add(new Boeing737_400(resultSet.getInt("people_capasity"), resultSet.getDouble("weight"), resultSet.getInt("speed"), resultSet.getInt("rangeOfFlight"), model));
                }
                if (model.equals("737-800")) {
                    plains.add(new Boeing737_800(resultSet.getInt("people_capasity"), resultSet.getDouble("weight"), resultSet.getInt("speed"), resultSet.getInt("rangeOfFlight"), model));

                }
                if (model.equals("737-900ER")) {
                    plains.add(new Boeing737_900ER(resultSet.getInt("people_capasity"), resultSet.getDouble("weight"), resultSet.getInt("speed"), resultSet.getInt("rangeOfFlight"), model));
                }

                if (model.equals("A321-100")) {
                    plains.add(new AirBus321_100(resultSet.getInt("people_capasity"), resultSet.getDouble("weight"), resultSet.getInt("speed"), resultSet.getInt("rangeOfFlight"), model));
                }
                if (model.equals("A318-100")) {
                    plains.add(new Airobus318_100(resultSet.getInt("people_capasity"), resultSet.getDouble("weight"), resultSet.getInt("speed"), resultSet.getInt("rangeOfFlight"), model));
                }


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        airCompany = new AirCompany(nameOfCompany, plains);

        return airCompany;

    }


    public static Connection getConnetion() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/aircompany";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, "root", "root");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


}
