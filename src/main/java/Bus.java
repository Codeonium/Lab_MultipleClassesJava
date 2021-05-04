import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus (String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestinationName() {
        return destination;
    }

    public void addPassenger(BusStop busStop) {
        Person person = busStop.removePersonFromQueue();
        if (getPassengerCount() < this.capacity) {
            passengers.add(person);
        }
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public int getBusCapacity() {
        return capacity;
    }

    public void removePassenger() {
        if (passengers.size() > 0) {
            passengers.remove(0);
        }
    }
}
