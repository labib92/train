package ru.labib.train.model;

public class Train {
    private int TrainNumber;
    private int setNumber;

    public Train(){}

    public Train(int trainNumber, int setNumber) {
        TrainNumber = trainNumber;
        this.setNumber = setNumber;
    }

    public int getTrainNumber() {
        return TrainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        TrainNumber = trainNumber;
    }

    public int getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(int setNumber) {
        this.setNumber = setNumber;
    }
}
