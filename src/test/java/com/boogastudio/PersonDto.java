package com.boogastudio;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class PersonDto {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String[][] aliases;
    private Date dateMarried;
    private Boolean married;
    private LocalDate dateOfWedding;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public String[][] getAliases() {
        return aliases;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public void setAliases(String[][] aliases) {
        this.aliases = aliases;
    }

    public Date getDateMarried() {
        return dateMarried;
    }

    public void setDateMarried(Date dateMarried) {
        this.dateMarried = dateMarried;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public LocalDate getDateOfWedding() {
        return dateOfWedding;
    }

    public void setDateOfWedding(LocalDate dateOfWedding) {
        this.dateOfWedding = dateOfWedding;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", aliases=" + Arrays.toString(aliases) +
                ", dateMarried=" + dateMarried +
                ", married=" + married +
                ", dateOfWedding=" + dateOfWedding +
                '}';
    }
}
