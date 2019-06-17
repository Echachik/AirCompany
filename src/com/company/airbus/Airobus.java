package com.company.airbus;

import com.company.plain.Plain;
import com.company.plain.Plain_Type;

public class Airobus extends Plain {

    public Airobus(int people_capasity, double weight, int speed, int rangeOfFlight) {
        super(Plain_Type.AIRBUS, people_capasity, weight, speed, rangeOfFlight);
    }

}
