package org.mvnsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * spring boot application
 */
@SpringBootApplication
public class App implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new RockerMessageConverter());
    }
}
