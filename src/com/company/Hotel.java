package com.company;

import java.util.Arrays;

public class Hotel implements RentForAble {
    private String addressOfHotel;
    private Person[] travels;

    public Hotel(String addressOfHotel, Person[] travels) {
        this.addressOfHotel = addressOfHotel;
        this.travels = travels;
    }

    public String getAddressOfHotel() {
        return addressOfHotel;
    }

    public void setAddressOfHotel(String addressOfHotel) {
        this.addressOfHotel = addressOfHotel;
    }

    public Person[] getTravels() {
        return travels;
    }

    public void setTravels(Person[] travels) {
        this.travels = travels;
    }

    @Override
    public void rentForYear() {
        System.out.println("The one years rent for Hotel is 3000000 som.");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "addressOfHotel='" + addressOfHotel + '\'' +
                ", travels=" + Arrays.toString(travels) +
                '}';
    }
}