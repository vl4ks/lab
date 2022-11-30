package org.example.lab2.buildings;

import java.util.ArrayList;

public class Dwelling {
    private ArrayList<DwellingFloor> arrayOfFloors;

    public Dwelling(int numberOfFloors, ArrayList<Integer> numberOfFlatsPerFloor){
        arrayOfFloors = new ArrayList<DwellingFloor>();

        for (int i = 0; i < numberOfFloors; i++){
            arrayOfFloors.add(new DwellingFloor(numberOfFlatsPerFloor.get(i)));
        }
    }

    public Dwelling(ArrayList<DwellingFloor> arrayOfFloors){
        this.arrayOfFloors = arrayOfFloors;
    }

    public int getTotalNumberOfFloors(){
        return arrayOfFloors.size();
    }

    public int getTotalNumberOfFlats(){
        int sum = 0;

        for (int i = 0; i < arrayOfFloors.size(); i++){
            sum += arrayOfFloors.get(i).getTotalNumberOfFlats();
        }

        return sum;
    }

    public int getTotalNumberOfSquares(){
        int sum = 0;

        for (int i = 0; i < arrayOfFloors.size(); i++){
            sum += arrayOfFloors.get(i).getTotalNumberOfSquares();
        }

        return sum;
    }

    public int getTotalNumberOfRooms(){
        int sum = 0;

        for (int i = 0; i < arrayOfFloors.size(); i++){
            sum += arrayOfFloors.get(i).getTotalNumberOfRooms();
        }

        return sum;
    }

    public ArrayList<DwellingFloor> getArrayOfFloors(){
        return arrayOfFloors;
    }

    public DwellingFloor getFloorByNumber(int number){
        if(number >= arrayOfFloors.size() || number < 0){
            System.out.println("The number of the floor is incorrect, try again");
            return null;
        }
        else{
            return arrayOfFloors.get(number);
        }
    }

    public void setFloorByNumber(int number, DwellingFloor floor){
        if(number >= arrayOfFloors.size() || number < 0){
            System.out.println("The number of the floor is incorrect, try again");
        }
        else{
            arrayOfFloors.set(number, floor);
        }
    }

    public Flat getFlatByNumber(int numberOfFloor, int numberOfFlat){
        if(numberOfFloor >= arrayOfFloors.size() || numberOfFloor < 0){
            System.out.println("The number of the floor is incorrect, try again");
            return null;
        }
        else{
            return arrayOfFloors.get(numberOfFloor).getFlatByNumber(numberOfFlat);
        }
    }

    public void setFlatByNumber(int numberOfFloor, int numberOfFlat, Flat flat){
        if(numberOfFloor >= arrayOfFloors.size() || numberOfFloor < 0){
            System.out.println("The number of the floor is incorrect, try again");
        }
        else{
            arrayOfFloors.get(numberOfFloor).setFlatByNumber(numberOfFlat, flat);
        }
    }

    public void addNewFlat(int numberOfFloor, int numberOfFlat, Flat flat){
        if(numberOfFloor >= arrayOfFloors.size() || numberOfFloor < 0){
            System.out.println("The number of the floor is incorrect, try again");
        }
        else{
            arrayOfFloors.get(numberOfFloor).addNewFlat(numberOfFlat, flat);
        }
    }

    public Flat deleteFlatByNumber(int numberOfFloor, int numberOfFlat){
        if(numberOfFloor >= arrayOfFloors.size() || numberOfFloor < 0){
            System.out.println("The number of the floor is incorrect, try again");
            return null;
        }
        else{
            return arrayOfFloors.get(numberOfFloor).deleteFlat(numberOfFlat);
        }
    }

    public Flat getBestSpace(){
        Flat currentBestSpace = arrayOfFloors.get(0).getBestSpace();

        for (int i = 1; i < arrayOfFloors.size(); i++){
            Flat candidateSpace = arrayOfFloors.get(i).getBestSpace();

            if (currentBestSpace.getTotal_square() < candidateSpace.getTotal_square()){
                currentBestSpace = candidateSpace;
            }
        }

        return currentBestSpace;
    }

    public ArrayList<Flat> getFlatsSortedBySquares(){
        ArrayList<Flat> totalArrayOfFlats = arrayOfFloors.get(0).getArrayOfFlats();
        for (int i = 1; i < arrayOfFloors.size(); i++){
            totalArrayOfFlats.addAll(arrayOfFloors.get(i).getArrayOfFlats());
        }

        int n = totalArrayOfFlats.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (totalArrayOfFlats.get(j).getTotal_square() < totalArrayOfFlats.get(j + 1).getTotal_square()) {
                    // swap arr[j+1] and arr[j]
                    Flat temp = totalArrayOfFlats.get(j);
                    totalArrayOfFlats.set(j, totalArrayOfFlats.get(j + 1));
                    totalArrayOfFlats.set(j + 1, temp);
                }

        return totalArrayOfFlats;
    }






}