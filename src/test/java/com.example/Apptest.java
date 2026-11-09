
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGetMessage() {

        String result = App.getMessage();

        assertEquals(
            "Hello! Maven CI/CD Pipeline is Working!",
            result
        );
    }

    @Test
    void testMessageIsNotNull() {

        assertNotNull(App.getMessage());
    }
}
