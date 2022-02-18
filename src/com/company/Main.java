package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person[] family = {new Person("Albina", 20, 'f'),
                new Person("Marat", 50, 'm'),
                new Person("Sara", 47, 'f'),
                new Person("Albert", 26, 'm')};


        Person[] travels = {new Person("Nargiza", 18, 'f'),
                new Person("Aidar", 12, 'm'),
                new Person("Dilbara", 20, 'f'),
                new Person("Ulan", 23, 'm'),
                new Person("Erzhan", 24, 'm')};


        Person[] students = {new Person("Sezim", 12, 'f'),
                new Person("Dinara", 23, 'f'),
                new Person("Umar", 23, 'm')};

        Apartment apartment = new Apartment("New Street 24", family);
        int count = 0;
        for (Person a : family) {
            System.out.println(a);
            count++;
        }
        System.out.println("In Apartment live "+count+" persons");
        System.out.println(apartment.getAddressOfApartment());
        apartment.comService();
        System.out.println("_____________________________________");

        Hotel hotel = new Hotel("World Street 33", travels);
        int a = 0;
        for (Person b : travels) {
            System.out.println(b);
            a++;
        }
        System.out.println("In Hotel live "+a+" persons");
        System.out.println(hotel.getAddressOfHotel());
        hotel.rentForYear();
        System.out.println("_____________________________________");

        Hostel hostel = new Hostel("Old Street 10", students);
        int b = 0;
        for (Person c : students) {
            System.out.println(c);
            b++;
        }
        System.out.println("In Hostel live "+b+" persons");
        System.out.println(hostel.getAddressOfHostel());
        hostel.rentForYear();
    }
}
