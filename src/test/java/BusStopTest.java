import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void setUp() {
        bus = new Bus("codeClan", 10);
        person = new Person();
        busStop = new BusStop("NotThereYet");
    }

    @Test
    public void hasName() {
        assertEquals("NotThereYet", busStop.getBusStopName());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(2, busStop.getQueueLength());
    }



}
