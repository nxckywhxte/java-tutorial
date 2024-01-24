package ru.nxckywhxte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
  @Test
  public void testHelloWorld() {
    assertEquals("Hello world!", Main.getHelloWorld());
  }
}
