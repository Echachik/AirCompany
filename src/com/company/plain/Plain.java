package com.company.plain;

public class Plain {

    protected Plain_Type plain_type = Plain_Type.DEFAULT;
    protected int people_capasity;
    protected double weight;
    protected int speed;
    protected int rangeOfFlight;

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(int rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public Plain(Plain_Type plain_type, int people_capasity, double weight, int speed, int rangeOfFlight) {

        this.plain_type = plain_type;
        this.people_capasity = people_capasity;
        this.weight = weight;
        this.speed = speed;
        this.rangeOfFlight = rangeOfFlight;
    }

    public Plain_Type getPlain_type() {
        return plain_type;
    }

    public void setPlain_type(Plain_Type plain_type) {
        this.plain_type = plain_type;
    }

    public int getPeople_capasity() {
        return people_capasity;
    }

    public void setPeople_capasity(int people_capasity) {
        this.people_capasity = people_capasity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "Plain{" +
                "plain_type=" + plain_type +
                ", speed=" + speed +
                ", rangeOfFlight=" + rangeOfFlight +
                '}';
    }
}
