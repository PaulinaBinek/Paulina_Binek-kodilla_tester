package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldNotReturnNull() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        double value = bean.display(2);
        Assertions.assertNotNull(value);
    }

    @Test
    public void shouldAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.add(2, 2);
        Assertions.assertEquals(4, value);
    }

    @Test
    public void shouldSubtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.subtract(2, 2);
        Assertions.assertEquals(0, value);
    }

    @Test
    public void shouldMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.multiply(2, 2);
        Assertions.assertEquals(4, value);
    }

    @Test
    public void shouldDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.divide(2, 2);
        Assertions.assertEquals(1, value);
    }
}