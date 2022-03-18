package org.csu.sparrowbrand;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.csu.sparrowbrand.persistence")
public class SparrowbrandApplication {
    public static void main(String[] args) {
        SpringApplication.run(SparrowbrandApplication.class, args);
    }
}
