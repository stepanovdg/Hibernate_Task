package com.epam.hibernatetask.delete;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/26/12
 * Time: 8:14 AM
 */
public class InformationRow {
    String name;
    String lastName;
    String address;
    String companyName;
    String city;
    String country;
    String countOfEmployees;
    String position;

    public InformationRow() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }


    public void setCompanyName(String name) {
        this.companyName = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountOfEmployees() {
        return countOfEmployees;
    }

    public void setCountOfEmployees(String countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
