package online.clientcentric.unit.sample.impl;

import online.clientcentric.unit.sample.impl.config.SampleTestConfig;
import online.clientcentric.unit.sample.impl.service.SampleServiceImplTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(Suite.class)
@ContextConfiguration(classes=SampleTestConfig.class, loader=AnnotationConfigContextLoader.class)
@SuiteClasses({
    SampleServiceImplTest.class,
})
public class SampleTestSuit {
}