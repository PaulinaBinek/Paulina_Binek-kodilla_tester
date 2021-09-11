package com.kodilla.spring.basic.spring_dependency_injection.homework;

import com.kodilla.spring.basic.spring_dependency_injection.SkypeMessageService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTestSuite {

    @Test
        public void shouldNotReturnNull() {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
            Display bean = context.getBean(Display.class);
            double value = bean.display(2);
            Assertions.assertNotNull(value);
        }
        @Test
    public void addValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.add(2,2);
        assertEquals(4, value);
        }

    @Test
    public void subtractValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.subtract(2,2);
        assertEquals(0, value);
    }

    @Test
    public void multiplyValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.multiply(2,2);
        assertEquals(4, value);
    }

    @Test
    public void divideValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.divide(4,2);
        assertEquals(2, value);
    }



}