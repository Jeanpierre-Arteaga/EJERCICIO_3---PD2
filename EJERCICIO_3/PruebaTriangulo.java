package PRACTICA_DOMICILIARIA_02.EJERCICIO_3;
import java.util.Scanner;
public class PruebaTriangulo {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        Triangulo[] triangulos = new Triangulo[3];
        Punto[] puntos = new Punto[3];
        double x,y;
        for(int i=0;i<3;i++){
            System.out.printf("Triangulo %d:%n",(i+1));
            for(int j=0;j<3;j++){
                System.out.printf(" Ingrese las coordenadas del punto %d:%n",(j+1));
                System.out.print(" X: "); x = entrada.nextDouble();
                System.out.print(" Y: "); y = entrada.nextDouble();
                puntos [j] = new Punto(x,y);
            }
            triangulos [i] = new Triangulo(puntos[0],puntos[1],puntos[2]);
            if(!triangulos[i].Existencia()){
                System.out.println("El triángulo no existe. Ingrese otros puntos.");
                i--;
            }
        }
        System.out.println("\nMEDIDA DE LOS LADOS DE LOS TRIANGULOS:");
        for(int i=0;i<3;i++){
            System.out.printf("%nTriangulo %d:%n",(i+1));
            System.out.println(triangulos [i]);
        }
        entrada.close();
    }
}