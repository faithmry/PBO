import java.util.ArrayList;

public class Chatbot {
    private ArrayList<Resep> daftarResep;

    public Chatbot() {
        daftarResep = new ArrayList<>();
    }

    public void tambahResep(Resep resep) {
        daftarResep.add(resep);
    }

    public String ekstrakNamaMakanan(String input) {
        for (Resep resep : daftarResep) {
            if (input.toLowerCase().contains(resep.getNama().toLowerCase())) {
                return resep.getNama();
            }
        }
        return null;
    }

    public Resep cariResep(String nama) {
        for (Resep resep : daftarResep) {
            if (resep.getNama().equalsIgnoreCase(nama)) {
                return resep;
            }
        }
        return null;
    }

    public String tampilkanResep(Resep resep) {
        if (resep == null) {
            return "Maaf, resep belum tersedia!";
        }

        StringBuilder output = new StringBuilder();
        output.append("Resep: ").append(resep.getNama()).append("\n");
        output.append("Bahan:\n");
        for (String bahan : resep.getBahan()) {
            output.append("- ").append(bahan).append("\n");
        }
        output.append("Langkah-langkah:\n");
        for (String langkah : resep.getLangkah()) {
            output.append("- ").append(langkah).append("\n");
        }
        return output.toString();
    }
}
