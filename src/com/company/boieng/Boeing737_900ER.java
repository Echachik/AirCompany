package com.company.boieng;

public class Boeing737_900ER extends Boeing {

    /**
     *Boeing 737-900ER
     *Максимальное число мест - 215
     *Максимальная взлётная масса, кг	- 74389
     *Крейсерская скорость, км/ч -  852
     *Дальность полёта, км  - 5925
     */
    private String model = "737-900ER";

    public Boeing737_900ER() {
        super(215, 74389, 852, 5925);
    }

    @Override
    public String toString() {
        return "Boeing737_900ER{" +
                "speed=" + speed +
                ", rangeOfFlight=" + rangeOfFlight +
                '}';
    }

    public Boeing737_900ER(int people_capasity, double weight, int speed, int rangeOfFlight, String model) {
        super(people_capasity, weight, speed, rangeOfFlight);
        this.model = model;
    }
}
