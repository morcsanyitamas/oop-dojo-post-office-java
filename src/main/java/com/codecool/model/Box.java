package com.codecool.model;

public abstract class Box extends PostedItem{
    protected final int weightInGrams;

    public Box(String recipientAddress, java.time.LocalDate postedDate, int weightInGrams) {
        super(recipientAddress, postedDate);
        this.weightInGrams = weightInGrams;
    }
}
