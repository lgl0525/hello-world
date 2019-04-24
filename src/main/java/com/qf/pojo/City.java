package com.qf.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class City implements Serializable {
    private BigDecimal cityId;

    private String cityName;

    private String cityUrl;

    private String citySynopsis;

    private static final long serialVersionUID = 1L;

    public BigDecimal getCityId() {
        return cityId;
    }

    public void setCityId(BigDecimal cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getCityUrl() {
        return cityUrl;
    }

    public void setCityUrl(String cityUrl) {
        this.cityUrl = cityUrl == null ? null : cityUrl.trim();
    }

    public String getCitySynopsis() {
        return citySynopsis;
    }

    public void setCitySynopsis(String citySynopsis) {
        this.citySynopsis = citySynopsis == null ? null : citySynopsis.trim();
    }
}