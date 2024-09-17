

package FigurasGeometricas;


// Clase para representar un triángulo
class Triangulo extends Figura {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    // Implementación del método abstracto para calcular el área del triángulo
    public double area() {
        return base * altura / 2;
    }
}
