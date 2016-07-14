package online.clientcentric.unit.sample.impl.config;

import online.clientcentric.unit.sample.face.config.SampleConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
    SampleConfig.class,
})
public class SampleTestConfig {
}