package com.company.airbus;

/**
 * AirBus A321-100
 * Крейсерская скорость, км/ч -  840
 * Максимальное число мест - 220
 * Дальность полёта, км  -6000
 * Максимальная взлётная масса, кг	- 93500
 */

public class AirBus321_100 extends Airobus{

    private String model = "A321-100";


    public AirBus321_100() {
        super(220, 93500, 840, 6000);
    }

    public AirBus321_100(int people_capasity, double weight, int speed, int rangeOfFlight, String model) {
        super(people_capasity, weight, speed, rangeOfFlight);
        this.model = model;
    }

    @Override
    public String toString() {
        return "AirBus321_100{" +
                "speed=" + speed +
                ", rangeOfFlight=" + rangeOfFlight +
                '}';
    }
}
