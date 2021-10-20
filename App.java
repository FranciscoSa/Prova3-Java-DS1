public class App {
    public static void main (String[] args){
        Quadrado calcQuadrado;
        Circulo calcCirculo;
        
        Quadrado.setDiag(1.41);
        calcQuadrado = new Quadrado(2.5);
        System.out.println("---------------------------------------------");
        System.out.printf("Área do quadrado : %.3f cm2 \n", calcQuadrado.getArea());
        System.out.printf("Perimetro do quadrado : %.3f cm \n", calcQuadrado.getPerimetro());
        System.out.printf("Diagonal do quadrado : %.3f cm\n", calcQuadrado.getDiagonal());
        System.out.println("---------------------------------------------");
       
        Quadrado.setDiag(Math.sqrt(2));
        System.out.println("---------------------------------------------");
        System.out.printf("Área do quadrado (Math): %.3f cm2 \n", calcQuadrado.getArea());
        System.out.printf("Perimetro do quadrado (Math): %.3f cm \n", calcQuadrado.getPerimetro());
        System.out.printf("Diagonal do quadrado (Math): %.3f cm\n", calcQuadrado.getDiagonal());
        System.out.println("---------------------------------------------");
        
        Circulo.setPi(3.14);
        calcCirculo = new Circulo(2.5);
        System.out.println("---------------------------------------------");
        System.out.printf("Área do Circulo : %.3f cm2 \n",calcCirculo.getArea());
        System.out.printf("Circunferencia do Circulo (Math): %.3f cm2\n",calcCirculo.getCircunferencia());
        System.out.println("---------------------------------------------");
    
        Circulo.setPi(Math.PI);
        System.out.println("---------------------------------------------");
        System.out.printf("Área do Circulo (Math): %.3f cm2 \n",calcCirculo.getArea());
        System.out.printf("Circunferencia do Circulo (Math): %.3f cm2\n",calcCirculo.getCircunferencia());
        System.out.println("---------------------------------------------");
    }
}
