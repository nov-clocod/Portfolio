package com.pluralsight.classes;

import com.pluralsight.interfaces.Valuable;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        assets = new ArrayList<>();
    }

    public void add(Valuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double netValue = 0;

        for (Valuable asset : assets) {
            netValue += asset.getValue();
        }

        return netValue;
    }

    public Valuable getMostValuable() {
        double value = 0;
        Valuable mostValuable = null;

        for (Valuable asset : assets) {
            if (asset.getValue() > value) {
                value = asset.getValue();
                mostValuable = asset;
            }
        }

        return mostValuable;
    }

    public Valuable getLeastValuable() {
        double value = assets.get(0).getValue();
        Valuable leastValuable = assets.get(0);

        for (Valuable asset : assets) {
            if (asset.getValue() < value) {
                value = asset.getValue();
                leastValuable = asset;
            }
        }

        return leastValuable;
    }
}
