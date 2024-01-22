package dev.annynispi.sbrdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("dev.annynispi.sbrdemo.entity")
public class SbrDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbrDemoApplication.class, args);

    }

}

