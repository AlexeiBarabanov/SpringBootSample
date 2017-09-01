package ru.inno;

import org.glassfish.jersey.server.ResourceConfig;
import ru.inno.endpoints.RestCalculator;

import javax.annotation.PostConstruct;

public class JerseyConfig extends ResourceConfig {

    @PostConstruct
    private void init() {
        registerClasses(RestCalculator.class);
    }

}
