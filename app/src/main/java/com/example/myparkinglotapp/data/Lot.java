package com.example.myparkinglotapp.data;

import androidx.annotation.Nullable;

public class Lot {
    private int id;
    private Car car;

    public Lot(int id) {
        this.id = id;
    }

    public void setCar(@Nullable Car car) {
        this.car = car;
    }

    public boolean isAllocated() {
        return car != null;
    }
}
