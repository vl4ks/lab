package org.example.lab2;

import org.example.lab2.buildings.Flat;
import org.example.lab2.buildings.DwellingFloor;
import org.example.lab2.buildings.Dwelling;

import java.util.ArrayList;

public class main {
    public static void main(String[] s) {
        Flat flat1 = new Flat();
        Flat flat2 = new Flat(45);
        Flat flat3 = new Flat(3, 80);

        ArrayList<Flat> flats = new ArrayList<Flat>();
        flats.add(flat1);
        flats.add(flat2);
        flats.add(flat3);

        DwellingFloor floor1 = new DwellingFloor(flats);
        DwellingFloor floor2 = new DwellingFloor(5);

        System.out.println("Total number of flats: ");
        System.out.println(floor1.getTotalNumberOfFlats());

        System.out.println("Total number of squares: ");
        System.out.println(floor1.getTotalNumberOfSquares());

        System.out.println("Total number of rooms: ");
        System.out.println(floor1.getTotalNumberOfRooms());

        System.out.println("Get array of flats: ");
        System.out.println(floor1.getArrayOfFlats());

        System.out.println("Get 2nd flat: ");
        System.out.println(floor1.getFlatByNumber(2));

        System.out.println("Set 0 flat: ");
        Flat newFlat0 = new Flat(4, 120);
        floor1.setFlatByNumber(0, newFlat0);
        System.out.println(floor1.getFlatByNumber(0));

        System.out.println("Add new flat: ");
        Flat newFlat = new Flat(1, 25);
        floor1.addNewFlat(5, newFlat);
        System.out.println(floor1.getFlatByNumber(5));

        System.out.println("Delete 5th flat: ");
        System.out.println(floor1.getArrayOfFlats());
        Flat deleted = floor1.deleteFlat(5);
        System.out.println(floor1.getArrayOfFlats());

        System.out.println("Get the best space: ");
        System.out.println(floor1.getBestSpace());


        ArrayList<DwellingFloor> arrayOfFloors = new ArrayList<>();
        arrayOfFloors.add(floor1);
        arrayOfFloors.add(floor2);
        Dwelling dwelling = new Dwelling(arrayOfFloors);

        System.out.println("Total Number Of Floors: ");
        System.out.println(dwelling.getTotalNumberOfFloors());

        System.out.println("Total Number Of Flats: ");
        System.out.println(dwelling.getTotalNumberOfFlats());

        System.out.println("Total Number Of Squares: ");
        System.out.println(dwelling.getTotalNumberOfSquares());

        System.out.println("Total Number Of Rooms: ");
        System.out.println(dwelling.getTotalNumberOfRooms());

        System.out.println("Get the Array Of Floors: ");
        System.out.println(dwelling.getArrayOfFloors());

        System.out.println("Get the Floor By Number: ");
        System.out.println(dwelling.getFloorByNumber(0));

        System.out.println("Set the floor by number: ");
        DwellingFloor newDwellingFloor = new DwellingFloor(6);
        dwelling.setFloorByNumber(1, newDwellingFloor);
        System.out.println(dwelling.getArrayOfFloors());

        System.out.println("Get the flat by number: ");
        System.out.println(dwelling.getFlatByNumber(0, 0));

        System.out.println("Set the flat by number: ");
        Flat newBigFlat = new Flat(5, 210);
        dwelling.setFlatByNumber(1, 1, newBigFlat);
        System.out.println(dwelling.getArrayOfFloors());

        System.out.println("Add new flat: ");
        Flat japBox = new Flat(1, 12);
        dwelling.addNewFlat(1, 3, japBox);
        System.out.println(dwelling.getArrayOfFloors());

        System.out.println("Delete flat by number: ");
        dwelling.deleteFlatByNumber(1, 2);
        System.out.println(dwelling.getArrayOfFloors());

        System.out.println("Get best space: ");
        System.out.println(dwelling.getBestSpace());

        System.out.println("Array of flats sorted by squares:");
        System.out.println(dwelling.getFlatsSortedBySquares());
    }
}