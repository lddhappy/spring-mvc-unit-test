package net.lddhappy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Liudongdong on 17/8/18.
 */
@Configuration
@PropertySource(value = "classpath:common.properties", encoding = "utf-8")
public class CommonConfig {
    @Value("${co.appVersion}")
    private String appVersion;

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
