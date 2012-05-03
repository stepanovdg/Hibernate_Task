package com.epam.hibernatetask.model;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/27/12
 * Time: 12:39 PM
 */
public class EmployeelistEntity  implements Serializable{
    private String empName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    private String empLastName;

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    private String adrName;

    public String getAdrName() {
        return adrName;
    }

    public void setAdrName(String adrName) {
        this.adrName = adrName;
    }

    private String compName;

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    private int contain;

    public int getContain() {
        return contain;
    }

    public void setContain(int contain) {
        this.contain = contain;
    }

    private String pos;

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeelistEntity that = (EmployeelistEntity) o;

        if (contain != that.contain) return false;
        if (adrName != null ? !adrName.equals(that.adrName) : that.adrName != null) return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;
        if (compName != null ? !compName.equals(that.compName) : that.compName != null) return false;
        if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;
        if (empLastName != null ? !empLastName.equals(that.empLastName) : that.empLastName != null) return false;
        if (empName != null ? !empName.equals(that.empName) : that.empName != null) return false;
        if (pos != null ? !pos.equals(that.pos) : that.pos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empName != null ? empName.hashCode() : 0;
        result = 31 * result + (empLastName != null ? empLastName.hashCode() : 0);
        result = 31 * result + (adrName != null ? adrName.hashCode() : 0);
        result = 31 * result + (compName != null ? compName.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + contain;
        result = 31 * result + (pos != null ? pos.hashCode() : 0);
        return result;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getEmpName()+"  next  "
                +getEmpLastName()+"  next  "
                +getAdrName()+"  next  "
                +getCompName()+"  next  "
                +getCityName()+"  next  "
                +getCountryName()+"  next  "
                +getContain()+"  next  "
                +getPos();
    }
}
