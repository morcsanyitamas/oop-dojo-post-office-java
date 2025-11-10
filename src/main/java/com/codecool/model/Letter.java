package com.codecool.model;

import java.time.LocalDate;

public class Letter extends PostedItem{

    public Letter(String recipientAddress, LocalDate postedDate) {
        super(recipientAddress, postedDate);
    }

    @Override
    public double getPrice() {
        return 1.99;
    }
}
