package com.company.boieng;

public class Boeing737_800 extends Boeing {

    /**
     *Boeing 737-800
     *Максимальное число мест - 189
     *Максимальная взлётная масса, кг	- 79015
     *Крейсерская скорость, км/ч -  852
     *Дальность полёта, км  - 5765
     */

    private String model = "737-800";

    public Boeing737_800() {
        super(189, 79015, 852, 5765);
    }


    @Override
    public String toString() {
        return "Boeing737_800{" +
                "speed=" + speed +
                ", rangeOfFlight=" + rangeOfFlight +
                '}';
    }

    public Boeing737_800(int people_capasity, double weight, int speed, int rangeOfFlight, String model) {
        super(people_capasity, weight, speed, rangeOfFlight);
        this.model = model;
    }
}
