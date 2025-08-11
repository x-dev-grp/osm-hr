package com.osm.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.envers.repository.support.EnversRevisionRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.xdev.communicator", "com.osm.hr","com.xdev","com.xdev.xdevsecurity"})
@ComponentScan(basePackages = {"com.xdev", "com.xdev.xdevsecurity","com.xdev.xdevbase","com.xdev.communicator", "com.osm.hr"})
@EnableJpaRepositories(basePackages = {"com.xdev", "com.xdev.xdevbase", "com.osm.hr"}, repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)

public class hrApplication {

    public static void main(String[] args) {
        SpringApplication.run(hrApplication.class, args);
    }

}
