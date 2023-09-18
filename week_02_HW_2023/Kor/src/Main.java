// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Kor K1 = new Kor(4.312);
        System.out.println("Kerület: " + Math.round(K1.kerulet() * 100) / 100);
        System.out.println("Terület: " + K1.terulet());
    }
}