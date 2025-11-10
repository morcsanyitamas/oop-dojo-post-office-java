package com.codecool.model;

public class SmallBox extends Box{

    public SmallBox(String recipientAddress, java.time.LocalDate postedDate, int weightInGrams) {
        super(recipientAddress, postedDate, weightInGrams);
    }

    @Override
    public double getPrice() {
        return 7.99;
    }
}
