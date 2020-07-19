package com.springvault;

import com.springvault.configuration.KeyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(KeyConfiguration.class)
public class SpringvaultApplication implements  CommandLineRunner{

    private  final KeyConfiguration keyconfiguration;

    public  SpringvaultApplication(KeyConfiguration keyConfiguration){
        this.keyconfiguration = keyConfiguration;
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringvaultApplication.class, args);
    }

    @Override
    public void run(String[] args) {

        Logger logger = LoggerFactory.getLogger(SpringvaultApplication.class);
        logger.info("Private Key is {}", keyconfiguration.getPrivateKey());
        logger.info("Public Key is {}", keyconfiguration.getPublicKey());
    }

}
