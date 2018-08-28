package ru.labib.train.model;

public class Ticket {
    private Passenger passenger;
    private Train train;

    public Ticket(){}


    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Ticket(Passenger passenger, Train train) {
        this.passenger = passenger;
        this.train = train;



    }
}
