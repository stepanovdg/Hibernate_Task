package com.epam.hibernatetask.entity;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/26/12
 * Time: 2:22 PM
 */
public class OfficeEntity {
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

        OfficeEntity that = (OfficeEntity) o;

        if (officeId != that.officeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return officeId;
    }

    private AdrEntity adrByAdrId;

    public AdrEntity getAdrByAdrId() {
        return adrByAdrId;
    }

    public void setAdrByAdrId(AdrEntity adrByAdrId) {
        this.adrByAdrId = adrByAdrId;
    }

    private CompEntity compByCompId;

    public CompEntity getCompByCompId() {
        return compByCompId;
    }

    public void setCompByCompId(CompEntity compByCompId) {
        this.compByCompId = compByCompId;
    }

    private Collection<PosEntity> posesByOfficeId;

    public Collection<PosEntity> getPosesByOfficeId() {
        return posesByOfficeId;
    }

    public void setPosesByOfficeId(Collection<PosEntity> posesByOfficeId) {
        this.posesByOfficeId = posesByOfficeId;
    }
}
