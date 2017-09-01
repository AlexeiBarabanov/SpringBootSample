package ru.inno;

import org.glassfish.jersey.server.ResourceConfig;
import ru.inno.endpoints.TrueRandomGenerator;

import javax.annotation.PostConstruct;

public class JerseyConfig extends ResourceConfig {

    @PostConstruct
    private void init() {
        registerClasses(TrueRandomGenerator.class);
    }

}
