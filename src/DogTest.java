import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    static Dog dog;

    @BeforeAll
    static void prepare() {
         dog = new Dog("Fido", 2);
    }
//    @BeforeEach
//    public void setUp() {
//       dog = new Dog("Fido", 2);
//    }

    @org.junit.jupiter.api.Test
    void shouldGetName() {

        assertEquals("Fido", dog.getName());

    }

    @org.junit.jupiter.api.Test
    void shouldNotSetName() {

        dog.setName("Fido2");

        assertEquals("Fido", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void shouldSetNameIfEmpty() {
        Dog dog1 = new Dog("", 2);

        dog1.setName("Fido2");

        assertEquals("Fido2", dog1.getName());
    }


    @org.junit.jupiter.api.Test
    void shouldGetAge() {

        assertEquals(2, dog.getAge());
    }

    @org.junit.jupiter.api.Test
    void shouldSetAge() {
    }
}