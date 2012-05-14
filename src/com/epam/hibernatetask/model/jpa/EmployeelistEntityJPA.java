package com.epam.hibernatetask.model.jpa;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 5/8/12
 * Time: 11:23 AM
 */

@javax.persistence.Table(name = "EMPLOYEELIST", schema = "USER7")
@Entity
@NamedQueries(
  @NamedQuery(name = "getEmployeesJPA",query = "from  EmployeelistEntity  where rownum() <= :MAX_ROW and rownum() >= :MIN_ROW")
)
public class EmployeelistEntityJPA {
    private int id;
    @Id
    @javax.persistence.Column(name = "ID", nullable = true, insertable = true, updatable = true, length = 22, precision = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String empName;

    @javax.persistence.Column(name = "EMP_NAME", nullable = false, insertable = true, updatable = true, length = 4000, precision = 0)
    @Basic
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    private String empLastName;

    @javax.persistence.Column(name = "EMP_LAST_NAME", nullable = false, insertable = true, updatable = true, length = 4000, precision = 0)
    @Basic
    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    private String adrName;

    @javax.persistence.Column(name = "ADR_NAME", nullable = false, insertable = true, updatable = true, length = 4000, precision = 0)
    @Basic
    public String getAdrName() {
        return adrName;
    }

    public void setAdrName(String adrName) {
        this.adrName = adrName;
    }

    private String compName;

    @javax.persistence.Column(name = "COMP_NAME", nullable = false, insertable = true, updatable = true, length = 4000, precision = 0)
    @Basic
    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    private String cityName;

    @javax.persistence.Column(name = "CITY_NAME", nullable = false, insertable = true, updatable = true, length = 4000, precision = 0)
    @Basic
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    private String countryName;

    @javax.persistence.Column(name = "COUNTRY_NAME", nullable = false, insertable = true, updatable = true, length = 4000, precision = 0)
    @Basic
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    private int contain;

    @javax.persistence.Column(name = "CONTAIN", nullable = true, insertable = true, updatable = true, length = 22, precision = 0)
    @Basic
    public int getContain() {
        return contain;
    }

    public void setContain(int contain) {
        this.contain = contain;
    }

    private String pos;

    @javax.persistence.Column(name = "POS", nullable = true, insertable = true, updatable = true, length = 4000, precision = 0)
    @Basic
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

        EmployeelistEntityJPA that = (EmployeelistEntityJPA) o;

        if (contain != that.contain) return false;
        if (id != that.id) return false;
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
        int result = id;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (empLastName != null ? empLastName.hashCode() : 0);
        result = 31 * result + (adrName != null ? adrName.hashCode() : 0);
        result = 31 * result + (compName != null ? compName.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + contain;
        result = 31 * result + (pos != null ? pos.hashCode() : 0);
        return result;
    }

}
