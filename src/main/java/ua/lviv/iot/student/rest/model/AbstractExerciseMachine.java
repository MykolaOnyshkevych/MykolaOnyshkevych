package ua.lviv.iot.student.rest.model;

import java.util.Objects;

import javax.persistence.Entity;
@Entity
public class AbstractExerciseMachine {
    private double pricePerHour;
    private double durationInMinutes;
    private String producingCountry;
    private String model;
    private Integer id;

    public final Integer getId() {
        return id;
    }

    public final void setId(Integer id) {
        this.id = id;
    }

    public AbstractExerciseMachine() {
    }

    public AbstractExerciseMachine(double pricePerHour, double durationInMinutes, String producingCountry,
            String model) {
        this.pricePerHour = pricePerHour;
        this.durationInMinutes = durationInMinutes;
        this.producingCountry = producingCountry;
        this.model = model;
    }

    public final double getPricePerHour() {
        return pricePerHour;
    }

    public final void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public final double getDurationInMinutes() {
        return durationInMinutes;
    }

    public final void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public final String getProducingCountry() {
        return producingCountry;
    }

    public final void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public final String getModel() {
        return model;
    }

    public final void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        AbstractExerciseMachine that = (AbstractExerciseMachine) o;
        return getPricePerHour() == that.getPricePerHour() && getDurationInMinutes() == that.getDurationInMinutes()
                && getProducingCountry().equals(that.getProducingCountry()) && getModel().equals(that.getModel())
                && getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPricePerHour(), getDurationInMinutes(), getProducingCountry(),
                getModel(),getId());
    }

    @Override
    public String toString() {
        return "AbstractExerciseMachine{" + "pricePerHour=" + pricePerHour + ", durationInMinutes=" + durationInMinutes
                + ", producingCountry='" + producingCountry + "model=" + model + "id=" +id +'\'' + '}';
    }

    public String toCSV() {
        return "price = " + getPricePerHour() + " duration = " + getDurationInMinutes() + " country = "
                + getProducingCountry() + " model = " + getModel();
    }

    public String getHeaders() {

        return "pricePerHour,durationInMinutes,producingCountry,String model";
    }
}