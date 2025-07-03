import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();

        for (Resep resep : DatabaseResep.getDaftarResep()) {
            chatbot.tambahResep(resep);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Chatty the Chef!\n");
        System.out.println("Ketik nama makanan yang ingin kamu coba buat!\nChatty siap membantu kalian!");
        System.out.println("Ketik 'exit' untuk keluar.");

        while (true) {
            System.out.print("\nAnda: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih sudah menggunakan Chatty the Chef!");
                break;
            }

            String namaMakanan = chatbot.ekstrakNamaMakanan(input);
            if (namaMakanan != null) {
                Resep hasil = chatbot.cariResep(namaMakanan);
                System.out.println(chatbot.tampilkanResep(hasil));
            } else {
                System.out.println("Maaf, saya belum mengenali makanan tersebut.");
            }
        }

        scanner.close();
    }
}
