package com.company.boieng;

/**
 * Boeing 737-400
 * Крейсерская скорость, км/ч -  807
 * Максимальное число мест - 168
 * Дальность полёта, км  -3  815
 * Максимальная взлётная масса, кг	- 62823
 */


public class Boeing737_400 extends Boeing {

    private String model = "737-400";

    public Boeing737_400() {
        super(168, 62823, 807, 3815);
    }


    @Override
    public String toString() {
        return "Boeing737_400{" +
                "speed=" + speed +
                ", rangeOfFlight=" + rangeOfFlight +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boeing737_400(int people_capasity, double weight, int speed, int rangeOfFlight, String model) {
        super(people_capasity, weight, speed, rangeOfFlight);
        this.model = model;
    }
}
