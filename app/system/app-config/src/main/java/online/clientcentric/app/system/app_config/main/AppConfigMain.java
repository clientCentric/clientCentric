package online.clientcentric.app.system.app_config.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

import static org.springframework.boot.SpringApplication.run;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class AppConfigMain {

    public static void main(String[] args) {
        run(AppConfigMain.class, args);
    }
}