package com.example.cicd;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.*;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {
    @Test
    public void addTest() throws Exception {
        // given

        // when
        int result = HelloController.add(1, 2);
        // then
        Assertions.assertEquals(3, result);
    }
}