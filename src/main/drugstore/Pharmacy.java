package main.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Comparable<Pharmacy> {
    private List<Pharmacy> pharmacy = new ArrayList<>();

    private String name;
    private Double weight;
    private Double price;

    public Pharmacy(String name, Double weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public void addPharmacy(Pharmacy[] pharmacy) {
        for (Pharmacy p : pharmacy) {
            this.pharmacy.add(p);
        }
    }

    @Override
    public String toString() {
        return String.format("Name = %s, Weight = %s, Price = %s", name, weight, price);
    }

    // Здесь я сравнил и по ценам и по весам.
    public int compareTo(Pharmacy o) {
        int comparePriceAndWeight = Double.compare(this.price, o.price);

        if (comparePriceAndWeight != 0) {
            return comparePriceAndWeight;
        }
        return Double.compare(this.weight, o.weight);
    }

    public String getName() {
        return name;
    }
}
