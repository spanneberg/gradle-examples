package com.example;

public class Example {

  public String greet() {
    return "Hello World!";
  }

  public String greet(String name) {
    return "Hello " + name + "!";
  }

  public static void main(String[] args) {
    String greeting = new Example().greet();
    System.out.println(greeting);
  }

}

