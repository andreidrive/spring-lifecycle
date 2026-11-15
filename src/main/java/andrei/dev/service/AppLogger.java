package andrei.dev.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AppLogger {
    public AppLogger() {
        System.out.println("[AppLogger] constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("[AppLogger] @PostConstruct init");
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("[AppLogger] @PreDestroy shutdown");
    }
}
