public class MetodyKalkulatora {
    private final double a;
    private final double b;


    public MetodyKalkulatora(double a, double b) {
        this.a = a;
        this.b = b;
    }
    double dodawanie(){
        return a + b;
    }
    double dodawanie(double ...a) {
        double x = 0;
        for (double v : a) {
            x = x + v;
        }
        return x;}

    double odejmowanie(){
        return a - b;
    }
    double odejmowanie(double ...a) {
        double x = 2*a[0];
        for (double v : a) {
            x = x-v;
        }
        return x;}

    double mnozenie(){
        return a * b;
    }
    double mnozenie(double ...a) {
        double x = 1;
        for (double v : a) {
            x = x*v;
        }
        return x;}


    double dzielenie(){
        return a / b;
    }

    double dzielenie(double ...a) {
        double x = a[0]*a[0];
        for (double v : a) {
            x = x/v;
        }
        return x;}




    @Override
    public String toString() {
        return "MetodyKalkulatora{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}


