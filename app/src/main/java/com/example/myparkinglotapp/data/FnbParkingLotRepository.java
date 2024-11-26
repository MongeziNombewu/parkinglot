package com.example.myparkinglotapp.data;

import java.util.ArrayList;
import java.util.List;

public class FnbParkingLotRepository implements ParkingLotRepository {
    private static final int MAX_LOTS = 20;
    private List<Lot> lots = new ArrayList();

    @Override
    public int assignParkingLot(String plate) {
        // check if lot is full
        if (lots.size() == MAX_LOTS) {
            // check if exception will be appropriate
            return Integer.MIN_VALUE;
        }

        for (int i = 0; i < MAX_LOTS; i++) {
            Lot lot = lots.get(i);

            // check if lot is assigned
            if (lot == null) {
                Lot newLot = new Lot(i);
                newLot.setCar(new Car(plate));
                return i;
            }

            // check if lot is empty
            if (!lot.isAllocated()) {
                lot.setCar(new Car(plate));
                return i;
            }
        }

        return Integer.MIN_VALUE;
    }

    @Override
    public void unallocateParkingLot(int lotId) {
        Lot lot = lots.get(lotId);
        lot.setCar(null);
    }
}
