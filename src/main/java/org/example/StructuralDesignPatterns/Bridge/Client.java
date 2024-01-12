package org.example.StructuralDesignPatterns.Bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Client {
    @Test
    public void whenBridgePatternInvoked_thenConfigSuccess() {
        Shape square = new Square(new Red());

        assertEquals(square.draw(), "Square drawn. Color is Red");
    }
}
