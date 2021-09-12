package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {
    @Test
    public void shouldReturnCorrectAddress() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.success("test");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldReturnIncorrectAddress() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String messageFail = bean.fail("test1");
        Assertions.assertNotNull(messageFail);
    }

    @Test
    public void shouldSendAPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean shouldSend = bean.deliverPackage("Ellesmere Port", 20);
        Assertions.assertEquals(true, shouldSend);
    }

    @Test
    public void shouldNotSendAPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean shouldSend = bean.deliverPackage("London", 35);
        Assertions.assertEquals(false, shouldSend);
    }





}