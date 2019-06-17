package com.company.airbus;

/**
 * Airobus A318-100
 * Крейсерская скорость, км/ч -  840
 * Максимальное число мест - 132
 * Дальность полёта, км  -5950
 * Максимальная взлётная масса, кг	- 68000
 */

public class Airobus318_100 extends Airobus {

    private String model = "A318-100";

    public Airobus318_100() {
        super(132, 6800, 840, 5950);
    }

    public Airobus318_100(int people_capasity, double weight, int speed, int rangeOfFlight, String model) {
        super(people_capasity, weight, speed, rangeOfFlight);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Airobus318_100{" +
                "speed=" + speed +
                ", rangeOfFlight=" + rangeOfFlight +
                '}';
    }
}
