
package FigurasGeometricas;


// Clase para representar un cuadrado
class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
   // Implementación del método abstracto para calcular el área del cuadrado
    public double area() {
        return lado * lado;
    }
}