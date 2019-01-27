package com.swetha;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Unit test for simple FirstClass.
 */
public class FirstClassTest {
    @Test
    public void shouldAnswerWithTrue() {
        FirstClass hello = new FirstClass();
        assertThat(hello.hello(),  is("Hello World!"));
    }
}
