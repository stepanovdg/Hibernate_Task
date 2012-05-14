package com.epam.hibernatetask.entity.hibernate;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: Stepanov Dmitriy
 * Date: 4/26/12
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class CityEntity {
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (cityId != that.cityId) return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityName != null ? cityName.hashCode() : 0;
        result = 31 * result + cityId;
        return result;
    }

    private Collection<AdrEntity> adrsByCityId;

    public Collection<AdrEntity> getAdrsByCityId() {
        return adrsByCityId;
    }

    public void setAdrsByCityId(Collection<AdrEntity> adrsByCityId) {
        this.adrsByCityId = adrsByCityId;
    }

    private CountryEntity countryByCoutryFk;

    public CountryEntity getCountryByCoutryFk() {
        return countryByCoutryFk;
    }

    public void setCountryByCoutryFk(CountryEntity countryByCoutryFk) {
        this.countryByCoutryFk = countryByCoutryFk;
    }
}
