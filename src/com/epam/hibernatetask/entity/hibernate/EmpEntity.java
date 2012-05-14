package com.epam.hibernatetask.entity.hibernate;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/26/12
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmpEntity {
    private String empName;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    private int empId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    private String empLastName;

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpEntity empEntity = (EmpEntity) o;

        if (empId != empEntity.empId) return false;
        if (empLastName != null ? !empLastName.equals(empEntity.empLastName) : empEntity.empLastName != null)
            return false;
        if (empName != null ? !empName.equals(empEntity.empName) : empEntity.empName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empName != null ? empName.hashCode() : 0;
        result = 31 * result + empId;
        result = 31 * result + (empLastName != null ? empLastName.hashCode() : 0);
        return result;
    }

    private AdrEntity adrByAdrFk;

    public AdrEntity getAdrByAdrFk() {
        return adrByAdrFk;
    }

    public void setAdrByAdrFk(AdrEntity adrByAdrFk) {
        this.adrByAdrFk = adrByAdrFk;
    }

    private Collection<PosEntity> posesByEmpId;

    public Collection<PosEntity> getPosesByEmpId() {
        return posesByEmpId;
    }

    public void setPosesByEmpId(Collection<PosEntity> posesByEmpId) {
        this.posesByEmpId = posesByEmpId;
    }
}
