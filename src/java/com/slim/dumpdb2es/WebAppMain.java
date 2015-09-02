package com.slim.dumpdb2es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by hg on 2015/5/22.
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
@ComponentScan(basePackages = "com.slim")
@ImportResource("classpath:spring/context-root.xml")
public class WebAppMain extends SpringBootServletInitializer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebAppMain.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebAppMain.class);
    }
}