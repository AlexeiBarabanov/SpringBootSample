package ru.inno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.inno.services.RestClient;
import ru.inno.services.RestClientImpl;

@SpringBootApplication()
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public RestClient restClient() {
        return new RestClientImpl();
    }

    @Bean
    public JerseyConfig jerseyConfig() {
        return new JerseyConfig();
    }

}
