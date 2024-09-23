package PRACTICA_DOMICILIARIA_02.EJERCICIO_3;

public class Triangulo {
    // ATRIBUTOS
    // Representado por tres puntos de la clase Punto
    private Punto p1, p2, p3; 
    
    // METODOS CONSTRUCTORES
    public Triangulo(){
    }
    public Triangulo(Punto p1, Punto p2, Punto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    // METODOS SETTERS
    public void setP1(Punto p1){
        this.p1 = p1;
    }
    public void setP2(Punto p2){
        this.p2 = p2;
    }
    public void setP3(Punto p3){
        this.p3 = p3;
    }
    
    // METODOS GETTERS
    public Punto getP1(){
        return p1;
    }
    public Punto getP2(){
        return p2;
    }
    public Punto getP3(){
        return p3;
    }

    // METODO PARA CALCULAR LA LONGITUD DE LOS LADOS DEL TRIANGULO
    // Nota: se esta utilizando el metodo distancia de la clase Punto
    public double[] calcularLongitudLados(){
        // COLOCAMOS LOS 3 LADOS EN UN ARRAY PARA RETORNARLOS JUNTOS
        double a,b,c;
        a = p1.calcularDistancia(p2);
        b = p2.calcularDistancia(p3);
        c = p3.calcularDistancia(p1);
        return new double[]{a, b, c};
    }

    // METODO PARA VERIFICAR LA EXISTENCIA DEL TRIANGULO
    public boolean Existencia() {
        // SE DEFINEN LOS LADOS DEL TRIANGULO Y LUEGO SE REALIZA LA DESIGUALDAD TRIANGULAR
        double lado1, lado2, lado3;
        lado1 = calcularLongitudLados()[0];
        lado2 = calcularLongitudLados()[1];
        lado3 = calcularLongitudLados()[2];
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
            return true;
        }
        return false;
    }

    public String toString(){
        double[] lados = calcularLongitudLados();
        return "EL TRIANGULO ESTA FORMADO POR ESTOS PUNTOS: "+p1+" , "+p2+" , "+p3+
        "\nLAS MEDIDAS DE SUS LADOS SON: "+lados[0]+" , "+lados[1]+" , "+lados[2];
    }
}