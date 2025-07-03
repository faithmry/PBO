class BusinessTicket extends Ticket {

    public BusinessTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
        this.facilities = "Full Meal, Lounge Access";
        this.baggageLimit = 30;
    }

    @Override
    public double calculateFare() {
        return baseFare * 1.25;
    }
}