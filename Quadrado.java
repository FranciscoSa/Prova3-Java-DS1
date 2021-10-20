public class Quadrado {
   double lado = 10;
   static double diag = 0;

   public Quadrado (double lado){
        this.lado = lado;
   }

   public double getArea(){
       return (lado * lado);    
    }

    public double getPerimetro(){
        return (lado * 4);
    }

    public double getDiagonal(){
        return (lado * Quadrado.diag);
    }

    static void setDiag(double diag){
        Quadrado.diag = diag;
    }
}
