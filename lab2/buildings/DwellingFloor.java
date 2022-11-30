package org.example.lab2.buildings;

import java.util.ArrayList;

public class DwellingFloor {
    private ArrayList<Flat> arrayOfFlats;

    public DwellingFloor(int numberOfFlats){
        arrayOfFlats = new ArrayList<Flat>();

        for (int i = 0; i < numberOfFlats; i++){
            arrayOfFlats.add(new Flat());
        }
    }

    public DwellingFloor(ArrayList<Flat> arrayOfFlats){
        this.arrayOfFlats = arrayOfFlats;
    }

    public int getTotalNumberOfFlats(){
        return arrayOfFlats.size();
    }

    public int getTotalNumberOfSquares(){
        int sum = 0;

        for (int i = 0; i < arrayOfFlats.size(); i++){
            sum += arrayOfFlats.get(i).getTotal_square();
        }

        return sum;
    }

    public int getTotalNumberOfRooms(){
        int sum = 0;

        for (int i = 0; i < arrayOfFlats.size(); i++){
            sum += arrayOfFlats.get(i).getNumberOfRooms();
        }

        return sum;
    }

    public ArrayList<Flat> getArrayOfFlats(){
        return arrayOfFlats;
    }

    public Flat getFlatByNumber(int number){
        if(number >= arrayOfFlats.size() ||  number < 0){
            System.out.println("The number of the flat is incorrect, try again");
            return null;
        }
        else{
            return arrayOfFlats.get(number);
        }
    }

    public void setFlatByNumber(int number, Flat flat){
        if(number >= arrayOfFlats.size() || number < 0){
            System.out.println("The number of the flat is incorrect, try again");
        }
        else{
            arrayOfFlats.set(number, flat);
        }
    }

    @Override
    public String toString() {
        return "DwellingFloor{" +
                "arrayOfFlats=" + arrayOfFlats +
                '}';
    }

    public void addNewFlat(int number, Flat flat){
        while (number >= arrayOfFlats.size()){
            arrayOfFlats.add(new Flat());
        }

        arrayOfFlats.set(number, flat);
    }

    public Flat deleteFlat(int number){
        if(number >= arrayOfFlats.size() || number < 0){
            System.out.println("The number of the flat is incorrect, try again");
            return null;
        }
        else{
            return arrayOfFlats.remove(number);
        }
    }

    public Flat getBestSpace(){
        Flat currentBestFlat = arrayOfFlats.get(0);

        for (int i = 1; i < arrayOfFlats.size(); i++){
            if (currentBestFlat.getTotal_square() < arrayOfFlats.get(i).getTotal_square()){
                currentBestFlat = arrayOfFlats.get(i);
            }
        }

        return currentBestFlat;
    }
}