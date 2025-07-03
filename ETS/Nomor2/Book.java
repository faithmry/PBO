public class Book {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private String namaPenerbit;
    private String kategori;

    public Book(String judul, String penulis, int tahunTerbit, String namaPenerbit, String kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.namaPenerbit = namaPenerbit;
        this.kategori = kategori;
    }

    public void printDetails() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Nama Penerbit: " + namaPenerbit);
        System.out.println("Kategori: " + kategori);
    }

    public static void main(String[] args) {
        Book buku1 = new Book("Aku Ingin Tidur Tenang", "Faith Mary", 2024, "PT Faith", "Science");

        buku1.printDetails();
    }
}
