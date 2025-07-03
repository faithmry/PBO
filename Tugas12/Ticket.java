class Ticket {
    protected String passengerName;
    protected double baseFare;
    protected String facilities;
    protected double baggageLimit;

    public Ticket(String passengerName, double baseFare) {
        this.passengerName = passengerName;
        this.baseFare = baseFare;
        this.facilities = "Standard";
        this.baggageLimit = 15;
    }

    public double calculateFare() {
        return baseFare;
    }

    public void printTicketDetails() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Base Fare: $" + baseFare);
        System.out.println("Facilities: " + facilities);
        System.out.println("Baggage Limit: " + baggageLimit + "kg");
        System.out.println("Total Fare: $" + calculateFare());
    }
}