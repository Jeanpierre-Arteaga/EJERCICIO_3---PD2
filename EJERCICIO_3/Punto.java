package PRACTICA_DOMICILIARIA_02.EJERCICIO_3;

public class Punto {
    // ATRIBUTOS
    private double x;
    private double y;

    // METODOS CONSTRUCTORES
    public Punto(){
    }
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    // METODOS SETTERS
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    // METODOS GETTERS
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    // METODO PARA DAR FORMATO DE SALIDA
    public String toString(){
        return "(" + Formato(x) + "," + Formato(y) + ")";
    }

    // METODO PARA CALCULAR LA DISTANCIA HACIA UN PUNTO
    public double calcularDistancia(Punto p){
        double dx, dy;
        dx=p.x - this.x;        
        dy=p.y - this.y;        
        return Aproximar(Math.sqrt(dx*dx + dy*dy));
    }

    //METODO PARA DAR FORMATO A LAS COORDENADAS DE LOS PUNTOS
    // TANTO SI LA COORDENADA ES INT O DOUBLE
    public Object Formato(double x){
        if(x == (long) x){
            return (int) x;
        }
        return Aproximar(x);
    }

    // METODO PARA APROXIMAR LOS DECIMALES DE UN DOUBLE
    public double Aproximar(double x){
        return Double.parseDouble(String.format("%.3f",x));
    }
}