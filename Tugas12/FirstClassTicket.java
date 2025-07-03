class FirstClassTicket extends Ticket {

    public FirstClassTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
        this.facilities = "Luxury Meals, Private Suite, Priority Boarding";
        this.baggageLimit = 50;
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.5;
    }
}