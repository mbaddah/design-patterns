package structural.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SingletonTest {

    @Test
    void testSingletonIsNotInstantiated() {
        assertFalse(MySingleton.isIsMySingleInstantiated());
    }

    @Test
    void testSingletonIsInstantiated() {
        MySingleton testMyFirstSingleton = MySingleton.getMySingleton();
        assertTrue(MySingleton.isIsMySingleInstantiated());
    }

    @Test
    void testCannotInstantiateTwoInstancesOfASingleton() {
        MySingleton anotherSingletonInstance = MySingleton.getMySingleton();
        assertTrue(anotherSingletonInstance.isIsMySingleInstantiated());

    }
}