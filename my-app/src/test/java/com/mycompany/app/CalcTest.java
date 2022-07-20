package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CalcTest {
  @Test
  public void add() {
    assertEquals(4, new Calc().add(2, 2));
  }
}
