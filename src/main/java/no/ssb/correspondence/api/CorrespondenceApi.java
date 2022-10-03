package no.ssb.correspondence.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SvarUtBootProxy main application class
 */
@SpringBootApplication
public class CorrespondenceApi {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CorrespondenceApi.class);
        app.run();
    }

}
