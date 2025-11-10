package com.codecool.service;

import com.codecool.model.PostedItem;

import java.time.LocalDate;
import java.util.List;

public class PostOffice {
    private final List<PostedItem> postedItems;

    public PostOffice() {
        this.postedItems = new java.util.ArrayList<>();
    }

    public void addPostedItem(PostedItem item) {
        postedItems.add(item);
    }

    public List<PostedItem> getAllPostedItemsOnDate(LocalDate postedDate) {
        return postedItems.stream()
                .filter(item -> item.getPostedDate().equals(postedDate))
                .toList();
    }

    public double getIncomeFromPostedItems(Class<? extends PostedItem> itemType) {
        return postedItems.stream()
                .filter(item -> itemType.isInstance(item))
                .mapToDouble(PostedItem::getPrice)
                .sum();
    }
}
