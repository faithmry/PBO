package ETS.Nomor1;

class Mammalia {
    public void kalimat1() {
        System.out.println("Berikut adalah salah satu contoh mammalia.");
    }
}

class Sapi extends Mammalia {
    public void kalimat2() {
        System.out.println("Sapi.");
    }
}

class Kaki extends Sapi {
    public void kalimat3() {
        System.out.println("Sapi memiliki empat kaki.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Kaki kaki = new Kaki();
        kaki.kalimat1();
        kaki.kalimat2();
        kaki.kalimat3();
    }
}
