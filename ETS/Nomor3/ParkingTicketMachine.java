import java.util.Scanner;

public class ParkingTicketMachine {
    private double balance;
    private double ticketPrice;
    private double ticketTime;

    public ParkingTicketMachine(int ticketPrice) {
        this.ticketPrice = ticketPrice;
        this.balance = 0;
        this.ticketTime = 0;
    }

    public void insertMoney(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void issueTicket() {
        if (balance >= ticketPrice) {
            this.ticketTime = balance / ticketPrice;
            this.balance -= this.ticketTime * ticketPrice;
        } else {
            System.out.println("Insufficient balance to issue a ticket.");
        }
    }

    public double getTimePurchased() {
        return this.ticketTime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the ticket price per hour: ");
        int ticketPrice = scanner.nextInt();

        ParkingTicketMachine machine = new ParkingTicketMachine(ticketPrice);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Insert Money");
            System.out.println("2. Issue Ticket");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to insert: ");
                int amount = scanner.nextInt();
                machine.insertMoney(amount);
                System.out.println("Current balance: " + machine.balance);
            } else if (choice == 2) {
                machine.issueTicket();
                System.out.println("Time Purchased: " + machine.getTimePurchased() + " hours");
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}