public class Main {
    public static void main(String[] args) {
        MetodyKalkulatora m = new MetodyKalkulatora(5,6);

        System.out.println(m.toString());
        System.out.println("a + b = " + m.dodawanie());
        System.out.println("a - b = " + m.odejmowanie());
        System.out.println("a * b = " + m.mnozenie());
        System.out.println("a / b = " + m.dzielenie());
        System.out.println("-------------------");
        System.out.println("Konstruktor z wieloma argumentami");
        System.out.println("10 + 11 + 12 = " + m.dodawanie(10,11,12));
        System.out.println("10 - 6 - 5 = " + m.odejmowanie(10,6,5));
        System.out.println("4 * 5 * 5 = " + m.mnozenie(4,5,5));
        System.out.println("20 / 5 / 2 / 0,5 = " + m.dzielenie(20,5,2,0.5));
    }
}
