package com.iason.aca.enrollment.generation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableFeignClients
public class IasonAcaEnrollmentGenerationApplication {

    public static void main(String[] args) {
        SpringApplication.run(IasonAcaEnrollmentGenerationApplication.class, args);
    }

}
