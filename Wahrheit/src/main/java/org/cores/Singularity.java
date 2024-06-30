package org.cores;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author: chen jin ,the follower of the truth.
 * Describe: this is where the springboot application start, which I call it "Singularity"
 * Date: 2024/06/30 22:15
 */



@SpringBootApplication
@ComponentScan(basePackages = "org.cores")
public class Singularity {

    public static void main(String[] args) {

        SpringApplication.run(Singularity.class);

    }
}
