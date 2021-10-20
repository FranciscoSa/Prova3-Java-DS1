public class Circulo {
    double raio = 0;
    static double  pi = 3.141;

    public Circulo (double raio){
        this.raio = raio;
    }

    public double getArea(){
        return Circulo.pi * (raio * raio);
    }

    public double getCircunferencia(){
        return 2 * Circulo.pi * raio;
    }

    static void setPi(double pi){
        Circulo.pi = pi;
    }
}
