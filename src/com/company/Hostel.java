package com.company;

import java.util.Arrays;

public class Hostel implements RentForAble {
    private String addressOfHostel;
    private Person[] students;

    public Hostel(String addressOfHostel, Person[] students) {
        this.addressOfHostel = addressOfHostel;
        this.students = students;
    }

    public String getAddressOfHostel() {
        return addressOfHostel;
    }

    public void setAddressOfHostel(String addressOfHostel) {
        this.addressOfHostel = addressOfHostel;
    }

    public Person[] getStudents() {
        return students;
    }

    public void setStudents(Person[] students) {
        this.students = students;
    }

    @Override
    public void rentForYear() {
        System.out.println("The one years rent for hostel is 20000 som.");
    }
    
    // write toString here
}
