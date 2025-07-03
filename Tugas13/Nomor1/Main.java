public class Main {
    public static void main(String[] args) {
        MakhlukHidup manusia = new Manusia();
        MakhlukHidup hewan = new Hewan();
        MakhlukHidup tumbuhan = new Tumbuhan();

        manusia.bernapas();
        manusia.bergerak();
        manusia.tumbuh();

        hewan.bernapas();
        hewan.bergerak();
        hewan.tumbuh();

        tumbuhan.bernapas();
        tumbuhan.bergerak();
        tumbuhan.tumbuh();
    }
}