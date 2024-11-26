package com.example.myparkinglotapp.data;

public interface ParkingLotRepository {
    int assignParkingLot(String plate);

    void unallocateParkingLot(int lotId);
}
