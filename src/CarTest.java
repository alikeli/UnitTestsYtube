import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("Skoda", "12345", 2019, "Иван");
    }

    @Test
    void getManufacturer() {
        assertEquals("Skoda", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("12345", car.getNumber());

    }

    @Test
    void setNumber() {
        car.setNumber("123455");
        assertEquals("123455", car.getNumber());

    }

    @Test
    void getYear() {
        assertEquals(2019, car.getYear());

    }

    @Test
    void getOwner() {

        assertEquals("Иван", car.getOwner());

    }

    @Test
    void setOwner() {
        car.setOwner("Петр");
        assertEquals("Петр", car.getOwner());

    }

    @Test
    void getOwners() {
        assertArrayEquals(new String[]{"Иван"}, car.getOwners().toArray());
    }

    @Test
    void getListOwner() {
        car.setOwner("Петр");
        assertArrayEquals(new String[]{"Иван", "Петр"}, car.getOwners().toArray());
    }
    @Test
    public void testPrivateMethod() {
        try {
            Method method = Car.class.getDeclaredMethod("testMethod", String.class);
            method.setAccessible(true);
            assertEquals(method.invoke(car, "testMethod").toString(),"testMethod");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}