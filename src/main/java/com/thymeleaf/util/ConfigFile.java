package com.thymeleaf.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by acer on 2017/12/15.
 */
@Component
@ConfigurationProperties(prefix = "config")
@PropertySource("classpath:config/config.properties")
public class ConfigFile {

    private Long id;

    private String name;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
