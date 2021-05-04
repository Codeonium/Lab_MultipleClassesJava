import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void setUp(){
        bus = new Bus("codeClan", 10);
        person = new Person();
    }

    @Test
    public void hasDestinationName(){
        assertEquals("codeClan", bus.getDestinationName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, bus.getBusCapacity());
    }

    @Test
    public void hasPassengers(){
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerCount());

    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(1,bus.getPassengerCount());
    }

}
