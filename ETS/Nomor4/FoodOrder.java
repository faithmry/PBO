import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrder {
    private ArrayList<String> menuItems;
    private double totalPrice;
    private boolean isPaid;

    public FoodOrder() {
        this.menuItems = new ArrayList<>();
        this.totalPrice = 0.0;
        this.isPaid = false;
    }

    public void addItem(String item, double price) {
        this.menuItems.add(item);
        this.totalPrice += price;
    }

    public void removeItem(String item, double price) {
        if (this.menuItems.contains(item)) {
            this.menuItems.remove(item);
            this.totalPrice -= price;
        } else {
            System.out.println("Item not found in the order.");
        }
    }

    public void pay() {
        this.isPaid = true;
    }

    public String getOrderDetails() {
        return "Menu Items: " + this.menuItems.toString() + "\nTotal Price: " + this.totalPrice + "\nPaid: "
                + this.isPaid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodOrder order = new FoodOrder();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Pay");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter item name: ");
                String item = scanner.nextLine();
                System.out.print("Enter item price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                order.addItem(item, price);
                System.out.println("Item added.");
            } else if (choice == 2) {
                System.out.print("Enter item name: ");
                String item = scanner.nextLine();
                System.out.print("Enter item price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                order.removeItem(item, price);
                System.out.println("Item removed.");
            } else if (choice == 3) {
                order.pay();
                System.out.println("Order paid.");
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }

            System.out.println(order.getOrderDetails());
        }

        scanner.close();
    }
}