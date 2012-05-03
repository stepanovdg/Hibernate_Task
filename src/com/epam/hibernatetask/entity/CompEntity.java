package com.epam.hibernatetask.entity;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/26/12
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CompEntity {
    private String compName;

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    private int compId;

    public int getCompId() {
        return compId;
    }

    public void setCompId(int compId) {
        this.compId = compId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompEntity that = (CompEntity) o;

        if (compId != that.compId) return false;
        if (compName != null ? !compName.equals(that.compName) : that.compName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = compName != null ? compName.hashCode() : 0;
        result = 31 * result + compId;
        return result;
    }

    private Collection<OfficeEntity> officesByCompId;

    public Collection<OfficeEntity> getOfficesByCompId() {
        return officesByCompId;
    }

    public void setOfficesByCompId(Collection<OfficeEntity> officesByCompId) {
        this.officesByCompId = officesByCompId;
    }
}
