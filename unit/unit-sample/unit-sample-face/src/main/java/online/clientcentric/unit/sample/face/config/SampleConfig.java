package online.clientcentric.unit.sample.face.config;

import online.clientcentric.unit.sample.impl.SamplePackage;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {
    SamplePackage.class
})
public class SampleConfig {
}