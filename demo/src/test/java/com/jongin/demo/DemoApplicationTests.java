package com.jongin.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

class DemoApplicationTests {

    @Test
    void sum() {
        // given
        int a = 2;
        int b = 4;

        // when
        int c = a + b;

        // then
        assertThat(c).isEqualTo(6);
    }

    @Test
    void multiply() {
        // given
        int a = 2;
        int b = 4;

        // when
        int c = a * b;

        // then
        assertThat(c).isEqualTo(8);
    }
}
