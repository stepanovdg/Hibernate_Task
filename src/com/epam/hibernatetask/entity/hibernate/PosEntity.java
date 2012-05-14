package com.epam.hibernatetask.entity.hibernate;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/26/12
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class PosEntity {
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

        PosEntity posEntity = (PosEntity) o;

        if (empId != posEntity.empId) return false;
        if (officeId != posEntity.officeId) return false;
        if (pos != null ? !pos.equals(posEntity.pos) : posEntity.pos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + officeId;
        result = 31 * result + (pos != null ? pos.hashCode() : 0);
        return result;
    }

    private EmpEntity empByEmpId;

    public EmpEntity getEmpByEmpId() {
        return empByEmpId;
    }

    public void setEmpByEmpId(EmpEntity empByEmpId) {
        this.empByEmpId = empByEmpId;
    }

    private OfficeEntity officeByOfficeId;

    public OfficeEntity getOfficeByOfficeId() {
        return officeByOfficeId;
    }

    public void setOfficeByOfficeId(OfficeEntity officeByOfficeId) {
        this.officeByOfficeId = officeByOfficeId;
    }
}
