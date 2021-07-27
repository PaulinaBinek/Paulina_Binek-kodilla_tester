package com.kodilla.abstracts.homework;

public class Person{
 private String name;
 private int age;
 private String job;

 public Person(String name, int age, String job) {
  this.name = name;
  this.age = age;
  this.job = job;
 }



 public static void main(String[] args) {
  Job Tester = new Tester();
  Job Doctor = new Doctor();
  Job Lawyer = new Lawyer();
  Person person1 = new Person("Janusz's", 40, "Doctor");
  Person person2 = new Person("Paulina's", 28, "Tester");
  Person person3 = new Person("George's", 32, "Lawyer");
  System.out.println(person1.name + " job responsibilities are " + Doctor.getResponsibilities());
  System.out.println(person2.name + " job responsibilities are " + Tester.getResponsibilities());
  System.out.println(person3.name + " job responsibilities are " + Lawyer.getResponsibilities());


 }


}