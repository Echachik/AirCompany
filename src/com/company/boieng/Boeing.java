package com.company.boieng;


import com.company.plain.Plain;
import com.company.plain.Plain_Type;

public class Boeing extends Plain {

    public Boeing(int people_capasity, double weight, int speed, int rangeOfFlight) {
        super(Plain_Type.BOEING, people_capasity, weight, speed, rangeOfFlight);
    }

}
