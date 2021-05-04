import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void setUp(){
        bus = new Bus("codeClan", 10);
        person = new Person();
        busStop = new BusStop("NotThereYet");
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
        busStop.addPersonToQueue(person);
        bus.addPassenger(busStop);
        assertEquals(1, bus.getPassengerCount());

    }

    @Test
    public void canRemovePassenger(){
        busStop.addPersonToQueue(person);
        bus.addPassenger(busStop);
        busStop.addPersonToQueue(person);
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(1,bus.getPassengerCount());
    }

}
