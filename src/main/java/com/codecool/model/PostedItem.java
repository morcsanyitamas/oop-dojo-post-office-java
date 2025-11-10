package com.codecool.model;

import java.time.LocalDate;

public abstract class PostedItem {
    private final LocalDate postedDate;
    private final String recipientAddress;

    public PostedItem(String recipientAddress, LocalDate postedDate) {
        this.recipientAddress = recipientAddress;
        this.postedDate = postedDate;
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }
    public abstract double getPrice();
}
