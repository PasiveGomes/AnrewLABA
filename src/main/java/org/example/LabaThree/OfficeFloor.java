package org.example.LabaThree;

import org.example.LabaTwo.Flat;

public class OfficeFloor {

    private Flat[] flats;

    //конструктор принимающий кол-во квартир на этаже
    public DwellingFloor(int count) {
        flats = new Flat[count];
    }

    //конструктор принимающий массив квартир этажа
    public DwellingFloor(Flat[] flats) {
        this.flats = flats;
    }

    //метод получения кол-ва квартир на этаже
    public int getAmountFlatOnFloor() {
        return flats.length;
    }
    //метод получения общей площади квартир этажа
    public int getSquareFlatOnFloor() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getFlatSquares();
        }
        return sum;
    }
    //метод получения общего количества комнат этажа
    public int getTotalRoom() {
        int sum = 0;
        for (int i = 0; i < flats.length; i++) {
            sum += flats[i].getFlatSquares();
        }
        return sum;
    }
    //метод получения массива квартир этажа
    public Flat[] getArrayFlats() {
        return flats;
    }

    public Flat getFlats(int number) {
        return flats[number];
    }
    /*
    public void changeFlats(int number, Flat flat) {
        int count = 0;
        for (int i = 0; i < flats.length; i++) {
            count += flats[i].getArrayFlats().length;
            if(number <= count) {
                flats[i].getArrayFlats()[number - (count - flats[i].getArrayFlats().length)] = flat;
            }

        }
    }
 */
    public Flat getBestSpace() {
        int max = 0;
        Flat bestFlat = flats[0];


        for (int i = 0; i < flats.length; i++) {
            if (flats[i].getFlatSquares() > max) {
                max = flats[i].getFlatSquares();
                bestFlat = flats[i];
            }
        }
        return bestFlat;
    }
}
