package com.study.springboot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// 단정함수(Assert)를 통해 메소드 4개가 정상적으로 동작하는지 테스트하시오
class CalcTest {
    private final Calc calc = new Calc();
    @Test
    void add() {
        assertEquals(4, calc.add(1, 2));
    }

    @Test
    void sub() {
        assertEquals(1, calc.sub(3,2));
    }

    @Test
    void mul() {
        assertEquals(6, calc.mul(3,2));
    }

    @Test
    void div() {
        assertEquals(2, calc.div(4,2));
    }
}