package com.codecool.model;

public class BigBox extends Box{

    public BigBox(String recipientAddress, java.time.LocalDate postedDate, int weightInGrams) {
        super(recipientAddress, postedDate, weightInGrams);
    }

    @Override
    public double getPrice() {
        return 10.29 + (0.29 * super.weightInGrams);
    }
}
