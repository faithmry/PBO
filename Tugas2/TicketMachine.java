import java.util.Scanner;

public class TicketMachine {
    private int price;
    private int balance;
    private int total;

    public TicketMachine(int cost) {
        price = cost;
        balance = 0;
        total = 0;
    }

    public int getPrice() {
        return price;
    }

    public int getBalance() {
        return balance;
    }

    public void insertMoney(int amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("You inserted: " + amount + " cents. Current balance: " + balance + " cents.");
        } else {
            System.out.println("Use a positive amount rather than: " + amount);
        }
    }

    public void printTicket() {
        if(balance >= price) {
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Train Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            total += price;
            balance -= price;
            System.out.println("Ticket printed! Remaining balance: " + balance + " cents.");
        } else {
            System.out.println("You must insert at least: " + (price - balance) + " more cents.");
        }
    }

    public int refundBalance() {
        int amountToRefund = balance;
        balance = 0;
        System.out.println("Refunded: " + amountToRefund + " cents.");
        return amountToRefund;
    }

    public void displayOptions() {
        System.out.println("Please choose an option:");
        System.out.println("1 - Insert money");
        System.out.println("2 - Print ticket");
        System.out.println("3 - Check balance");
        System.out.println("4 - Refund balance");
        System.out.println("5 - Exit");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketMachine machine = new TicketMachine(50);  // Set ticket price to 50 cents

        System.out.println("Welcome to the Train Ticket Vending Machine!");
        System.out.println("Ticket price is: " + machine.getPrice() + " cents.");

        boolean exit = false;

        while (!exit) {
            machine.displayOptions();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            System.out.println();  // Add a new line after input

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount of money to insert: ");
                    int amount = scanner.nextInt();
                    System.out.println();  // Add a new line after input
                    machine.insertMoney(amount);
                    break;
                case 2:
                    machine.printTicket();
                    break;
                case 3:
                    System.out.println("Current balance: " + machine.getBalance() + " cents.");
                    break;
                case 4:
                    machine.refundBalance();
                    break;
                case 5:
                    System.out.println("Thank you for using the Train Ticket Vending Machine. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            System.out.println();  // Add a new line after each iteration
        }

        scanner.close();
    }
}
