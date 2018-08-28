package ru.labib.train.model;

import java.util.Date;

public class Passenger {
    private String name;
    private String familyName;
    private Date dateOfBirth;

    public Passenger(){}

    public Passenger(String name, String familyName, Date dateOfBirth) {
        this.name = name;
        this.familyName = familyName;
        this.dateOfBirth = dateOfBirth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
