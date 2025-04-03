import java.util.*;

class Passenger {
    String name;
    int priority; 
    public Passenger(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Priority: " + priority;
    }
}

class PassengerPriorityComparator implements Comparator<Passenger> {
    @Override
    public int compare(Passenger p1, Passenger p2) {
        return Integer.compare(p1.priority, p2.priority);  }
}

public class FlightTicketBooking {
    public static void main(String[] args) {
        
        Queue<Passenger> bookingQueue = new LinkedList<>();
        bookingQueue.add(new Passenger("Alice", 3));
        bookingQueue.add(new Passenger("Bob", 2));
        bookingQueue.add(new Passenger("Charlie", 1));

        System.out.println("Processing bookings in FIFO order:");
        while (!bookingQueue.isEmpty()) {
            System.out.println("Booking confirmed for: " + bookingQueue.poll());
        }

    
        PriorityQueue<Passenger> priorityBooking = new PriorityQueue<>(new PassengerPriorityComparator());
        priorityBooking.add(new Passenger("David", 3));
        priorityBooking.add(new Passenger("Emma", 1)); 
        priorityBooking.add(new Passenger("Frank", 2)); 

        System.out.println("\nProcessing bookings by priority:");
        while (!priorityBooking.isEmpty()) {
            System.out.println("Priority booking confirmed for: " + priorityBooking.poll());
        }
    }
}

