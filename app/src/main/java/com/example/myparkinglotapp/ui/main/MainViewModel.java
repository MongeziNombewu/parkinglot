package com.example.myparkinglotapp.ui.main;

import androidx.lifecycle.ViewModel;
import com.example.myparkinglotapp.data.ParkingLotRepository;

public class MainViewModel extends ViewModel {
    private ParkingLotRepository lotRepository;

    int assignLot(String plate) {
        return lotRepository.assignParkingLot(plate);
    }

    void unallocateLot(int lotId) {
        lotRepository.unallocateParkingLot(lotId);
    }
}