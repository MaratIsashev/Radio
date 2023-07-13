package ru.netology.radio;

public class Radio {
    private int radioStationNum;
    private int radioVolum;
    private int radioStationMaxAmount;

    public Radio() {
        radioStationMaxAmount = 9;
    }

    public Radio(int stationsAmount) {
        radioStationMaxAmount = stationsAmount - 1;
    }

    public void next() {
        if (radioStationNum != radioStationMaxAmount) {
            radioStationNum = radioStationNum + 1;
        } else {
            radioStationNum = 0;
        }
    }

    public void prev() {
        if (radioStationNum != 0) {
            radioStationNum = radioStationNum - 1;
        } else {
            radioStationNum = radioStationMaxAmount;
        }
    }

    public void volUp() {
        if (radioVolum < 10) {
            radioVolum = radioVolum + 1;
        }
    }

    public void volDown() {
        if (radioVolum > 0) {
            radioVolum = radioVolum - 1;
        }
    }

    public int getRadioStationNum() {
        return radioStationNum;
    }

    public void setRadioStationNum(int radioStationNum) {
        if (radioStationNum < 0) {
            return;
        }
        if (radioStationNum > (radioStationMaxAmount)) {
            return;
        }
        this.radioStationNum = radioStationNum;
    }

    public int getRadioVolum() {
        return radioVolum;
    }

    public void setRadioVolum(int radioVolum) {
        //if (radioVolum < 0) {
        //return;
        //}
        //if (radioVolum > 10) {
        //return;
        //}
        this.radioVolum = radioVolum;
    }
}
