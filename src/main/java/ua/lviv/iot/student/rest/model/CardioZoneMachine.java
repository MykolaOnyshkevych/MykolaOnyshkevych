package ua.lviv.iot.student.rest.model;

import java.util.Objects;

public class CardioZoneMachine extends AbstractExerciseMachine {
    private double droppedWeightInKilo;

    public CardioZoneMachine(double pricePerHour, double durationInMinutes, String producingCountry, String model,
            double droppedWeightInKilo) {
        super(pricePerHour, durationInMinutes, producingCountry, model);
        this.droppedWeightInKilo = droppedWeightInKilo;
    }

    public double getDroppedWeightInKilo() {
        return droppedWeightInKilo;
    }

    public CardioZoneMachine() {
        this(0.0, 0.0, null, null, 0);
    }

    public void setDroppedWeightInKilo(double droppedWeightInKilo) {
        this.droppedWeightInKilo = droppedWeightInKilo;
    }

    public String getHeaders() {
        return super.getHeaders() + ",droppedWeightInKilo ";
    }

    public String toCSV() {
        return super.toCSV() + "," + "droppedWeightInKilo= " + getDroppedWeightInKilo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        CardioZoneMachine that = (CardioZoneMachine) o;
        return getDroppedWeightInKilo() == that.getDroppedWeightInKilo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDroppedWeightInKilo());
    }

    @Override
    public String toString() {
        return "CardioZoneMachine{" + "droppedWeightInKilo=" + droppedWeightInKilo + '\'' + '}';
    }
}