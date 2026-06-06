public class Start {
    public static void main(String[] args) {
        Coordinate c1 = new Coordinate();
        c1.setLatitude(23.8103);
        c1.setLongitude(90.4125);
        
        Coordinate c2 = new Coordinate();
        c2.setLatitude(22.3569);
        c2.setLongitude(91.7832);

        Schedule s1 = new Schedule();
        s1.setHour(10);
        s1.setMinute(30);
        
        Schedule s2 = new Schedule();
        s2.setHour(11);
        s2.setMinute(45);

        Airport a1 = new Airport();
        a1.setName("Hazrat Shahjalal International Airport");
        a1.setLocation(c1);
        
        Airport a2 = new Airport();
        a2.setName("Shah Amanat International Airport");
        a2.setLocation(c2);

        Flight f = new Flight();
        f.setFlightId("BG-123");
        f.setCapacity(180);
        f.setDepartureFrom(a1);
        f.setDepartureTime(s1);
        f.setFlyingTo(a2);
        f.setArrivalTime(s2);

        System.out.println("Flight ID: " + f.getFlightId());
        System.out.println("Capacity: " + f.getCapacity());
        System.out.println("From: " + f.getDepartureFrom().getName());
        System.out.println("Departure Time: " + f.getDepartureTime().getHour() + ":" + f.getDepartureTime().getMinute());
        System.out.println("To: " + f.getFlyingTo().getName());
        System.out.println("Arrival Time: " + f.getArrivalTime().getHour() + ":" + f.getArrivalTime().getMinute());
    }
}