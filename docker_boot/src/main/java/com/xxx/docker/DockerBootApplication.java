package com.xxx.docker;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.xxx.docker.mapper")
public class DockerBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerBootApplication.class, args);
    }

}
