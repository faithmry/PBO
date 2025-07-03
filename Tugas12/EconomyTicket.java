class EconomyTicket extends Ticket {

    public EconomyTicket(String passengerName, double baseFare) {
        super(passengerName, baseFare);
        this.facilities = "Snacks";
        this.baggageLimit = 20;
    }

    @Override
    public double calculateFare() {
        return baseFare * 0.9;
    }
}