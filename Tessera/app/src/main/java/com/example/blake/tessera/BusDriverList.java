package com.example.blake.tessera;

public class BusDriverList {
    private int image;
    private int busDriverId;
    private int busNumber;

    public BusDriverList(int image, int id, int busDriverId, int busNumber) {
        this.image = image;
        this.busDriverId = busDriverId;
        this.busNumber = busNumber;
    }

    public int getImage() {
        return image;
    }

    public int getBusDriverId() {
        return busDriverId;
    }

    public int getBusNumber() {
        return busNumber;
    }
}
