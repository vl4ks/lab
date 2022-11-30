package org.example.lab2.buildings;

import java.util.ArrayList;

public class Flat {
    private int numberOfRooms;
    private int total_square;

    public Flat(int numberOfRooms, int total_square) {
        this.numberOfRooms = numberOfRooms;
        this.total_square = total_square;
    }

    public Flat(int total_square) {
        this.numberOfRooms = 2;
        this.total_square = total_square;
    }

    public Flat() {
        this.numberOfRooms = 2;
        this.total_square = 50;
    }

    public int getNumberOfRooms(){
        return this.numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }

    public int getTotal_square(){
        return this.total_square;
    }

    public void setTotal_square(int total_square){
        this.total_square = total_square;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "numberOfRooms=" + numberOfRooms +
                ", total_square=" + total_square +
                '}';
    }
}