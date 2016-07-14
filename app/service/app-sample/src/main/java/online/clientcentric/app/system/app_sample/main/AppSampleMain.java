package online.clientcentric.app.system.app_sample.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import static org.springframework.boot.SpringApplication.run;

@EnableDiscoveryClient
@SpringBootApplication
public class AppSampleMain {

    public static void main(String[] args) {
        run(AppSampleMain.class, args);
    }
}