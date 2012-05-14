package com.epam.hibernatetask.entity.hibernate;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/26/12
 * Time: 2:22 PM
 */
public class AdrEntity {
    private String adrName;

    public String getAdrName() {
        return adrName;
    }

    public void setAdrName(String adrName) {
        this.adrName = adrName;
    }

    private int adrId;

    public int getAdrId() {
        return adrId;
    }

    public void setAdrId(int adrId) {
        this.adrId = adrId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdrEntity adrEntity = (AdrEntity) o;

        if (adrId != adrEntity.adrId) return false;
        if (adrName != null ? !adrName.equals(adrEntity.adrName) : adrEntity.adrName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adrName != null ? adrName.hashCode() : 0;
        result = 31 * result + adrId;
        return result;
    }

    private CityEntity cityByCityFk;

    public CityEntity getCityByCityFk() {
        return cityByCityFk;
    }

    public void setCityByCityFk(CityEntity cityByCityFk) {
        this.cityByCityFk = cityByCityFk;
    }

    private Collection<EmpEntity> empsByAdrId;

    public Collection<EmpEntity> getEmpsByAdrId() {
        return empsByAdrId;
    }

    public void setEmpsByAdrId(Collection<EmpEntity> empsByAdrId) {
        this.empsByAdrId = empsByAdrId;
    }

    private Collection<OfficeEntity> officesByAdrId;

    public Collection<OfficeEntity> getOfficesByAdrId() {
        return officesByAdrId;
    }

    public void setOfficesByAdrId(Collection<OfficeEntity> officesByAdrId) {
        this.officesByAdrId = officesByAdrId;
    }
}
