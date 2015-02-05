package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest {

  @Test
  public void simpleGreeting() {
    Example e = new Example();
    assertEquals(e.greet(), "Hello World!");
  }

  @Test
  public void nameGreeting() {
    Example e = new Example();
    assertEquals(e.greet("Foobar"), "Hello Foobar!");
  }

}
