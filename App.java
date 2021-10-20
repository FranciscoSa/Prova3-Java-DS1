public class App {
    public static void main (String[] args){
        Quadrado calcQuadrado;
        Circulo calcCirculo;
        
        calcQuadrado = new Quadrado(2.5);
        calcQuadrado.setDiag(1.41);
        System.out.println("---------------------------------------------");
        System.out.printf("Área do quadrado : %.3f cm2 \n", calcQuadrado.getArea());
        System.out.printf("Perimetro do quadrado : %.3f cm \n", calcQuadrado.getPerimetro());
        System.out.printf("Diagonal do quadrado : %.3f cm\n", calcQuadrado.getDiagonal());
        System.out.println("---------------------------------------------");
       
        calcQuadrado.setDiag(Math.sqrt(2));
        System.out.println("---------------------------------------------");
        System.out.printf("Área do quadrado (Math): %.3f cm2 \n", calcQuadrado.getArea());
        System.out.printf("Perimetro do quadrado (Math): %.3f cm \n", calcQuadrado.getPerimetro());
        System.out.printf("Diagonal do quadrado (Math): %.3f cm\n", calcQuadrado.getDiagonal());
        System.out.println("---------------------------------------------");
        
        calcCirculo = new Circulo(2.5);
        calcCirculo.setPi(3.14);
        System.out.println("---------------------------------------------");
        System.out.printf("Área do Circulo : %.3f cm2 \n",calcCirculo.getArea());
        System.out.printf("Circunferencia do Circulo : %.3f cm2\n",calcCirculo.getCircunferencia());
        System.out.println("---------------------------------------------");
    
        calcCirculo.setPi(Math.PI);
        System.out.println("---------------------------------------------");
        System.out.printf("Área do Circulo (Math): %.3f cm2 \n",calcCirculo.getArea());
        System.out.printf("Circunferencia do Circulo (Math): %.3f cm2\n",calcCirculo.getCircunferencia());
        System.out.println("---------------------------------------------");
    }
}
