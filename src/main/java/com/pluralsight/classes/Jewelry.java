package com.pluralsight.classes;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return karat * 1000;
    }

    @Override
    public String toString() {
        return getName() +
                " karat=" + karat;
    }
}
