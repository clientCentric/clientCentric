package online.clientcentric.unit.sample.impl.service;

import online.clientcentric.commons.test.categories.IntegrationTests;
import online.clientcentric.unit.sample.impl.config.SampleTestConfig;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SampleTestConfig.class, loader=AnnotationConfigContextLoader.class)
public class SampleServiceImplTest {

    @Autowired
    private SampleServiceImpl impl;


    @Test
    @Category(IntegrationTests.class)
    public void should_initContext() {
    }
}