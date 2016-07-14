package online.clientcentric.app.system.app_discovery.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import static org.springframework.boot.SpringApplication.run;

@EnableEurekaServer
@SpringBootApplication
public class AppDiscoveryMain {

    public static void main(String[] args) {
        run(AppDiscoveryMain.class, args);
    }
}