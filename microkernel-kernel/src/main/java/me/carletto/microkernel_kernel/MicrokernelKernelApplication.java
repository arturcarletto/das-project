package me.carletto.microkernel_kernel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"me.carletto"})
@SpringBootApplication
public class MicrokernelKernelApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrokernelKernelApplication.class, args);
    }

}
