package com.prograd.MicroServicesDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("firstmicroserviceapp")
public class NumConfiguration {


    private Float min;
    private Float max;

    public NumConfiguration() {
    }
    public NumConfiguration(Float min,Float max) {
        this.min = min;
        this.max=max;
    }

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public Float getMax() {
        return max;
    }

    public void setMax(Float max) {
        this.max = max;
    }
}
