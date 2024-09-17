



package FigurasGeometricas;

// Clase principal para ejecutar el programa de consola
public class Jerarquia {
    public static void main(String args[]) { 
    Figura f[] = new Figura[3];
f[0] = new Circulo(10);  
f[1] = new Cuadrado(10); 
f[2] = new Triangulo(10,5);  
for (int i = 0; i < 1; i++){
System.out.println("Área del Circulo: " + f[0].area());
System.out.println("Área del Cuadrado: " + f[1].area());
System.out.println("Área del Triangulo: " + f[2].area());   
    
    }
    
    

  
   }

    

    
}
