import java.util.Scanner;

public class FlightReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter passenger name: ");
        String passengerName = scanner.nextLine();

        System.out.print("Enter base fare: ");
        double baseFare = scanner.nextDouble();

        System.out.print("Enter ticket type (1 for Economy, 2 for Business, 3 for First Class): ");
        int ticketType = scanner.nextInt();

        Ticket ticket;
        switch (ticketType) {
            case 1:
                ticket = new EconomyTicket(passengerName, baseFare);
                break;
            case 2:
                ticket = new BusinessTicket(passengerName, baseFare);
                break;
            case 3:
                ticket = new FirstClassTicket(passengerName, baseFare);
                break;
            default:
                System.out.println("Invalid ticket type. Defaulting to Economy.");
                ticket = new EconomyTicket(passengerName, baseFare);
        }

        System.out.println("\n=== Ticket Details ===");
        ticket.printTicketDetails();

        scanner.close();
    }
}