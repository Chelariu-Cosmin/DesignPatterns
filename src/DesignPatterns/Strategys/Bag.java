package src.DesignPatterns.Strategys;

import java.time.LocalTime;

/**
 * Created by Chelariu Andrei on 4/1/2023.
 * - SABLOANE COMPORTAMENTALE –
 */
public class Bag {

    private String bagCode;
    private int pretDepozitare;
    private LocalTime timpDepozitare;

    public String getBagCode() {
        return bagCode;
    }

    public void setBagCode(String bagCode) {
        this.bagCode = bagCode;
    }

    public int getPretDepozitare() {
        return pretDepozitare;
    }

    public void setPretDepozitare(int pretDepozitare) {
        this.pretDepozitare = pretDepozitare;
    }

    public LocalTime getTimpDepozitare() {
        return timpDepozitare;
    }

    public void setTimpDepozitare(LocalTime timpDepozitare) {
        this.timpDepozitare = timpDepozitare;
    }

    public Bag(String bagCode, int pretDepozitare, LocalTime timpDepozitare) {
        this.bagCode = bagCode;
        this.pretDepozitare = pretDepozitare;
        this.timpDepozitare = timpDepozitare;
    }

    public Bag() {
    }

    @Override
    public String toString() {
        return "Bag{" +
                "bagCode='" + bagCode + '\'' +
                ", pretDepozitare=" + pretDepozitare +
                ", timpDepozitare=" + timpDepozitare +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bag bag = (Bag) o;

        if (getPretDepozitare() != bag.getPretDepozitare()) return false;
        if (getBagCode() != null ? !getBagCode().equals(bag.getBagCode()) : bag.getBagCode() != null) return false;
        return getTimpDepozitare() != null ? getTimpDepozitare().equals(bag.getTimpDepozitare()) : bag.getTimpDepozitare() == null;
    }

    @Override
    public int hashCode() {
        int result = getBagCode() != null ? getBagCode().hashCode() : 0;
        result = 31 * result + getPretDepozitare();
        result = 31 * result + (getTimpDepozitare() != null ? getTimpDepozitare().hashCode() : 0);
        return result;
    }
}
