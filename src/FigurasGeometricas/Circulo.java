

package FigurasGeometricas;


// Clase para representar un círculo
class Circulo extends Figura {
    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }
// Implementación del método abstracto para calcular el área del círculo
    public double area() {
        return  Math.PI * radio * radio;
    }
}
    

