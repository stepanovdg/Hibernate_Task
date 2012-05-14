package com.epam.hibernatetask.entity.hibernate;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/26/12
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class PosEntityPK implements Serializable {
    private int empId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    private int officeId;

    public int getOfficeId() {
        return officeId;
    }

    public void setOfficeId(int officeId) {
        this.officeId = officeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PosEntityPK that = (PosEntityPK) o;

        if (empId != that.empId) return false;
        if (officeId != that.officeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + officeId;
        return result;
    }
}
