Tema: Mecanismo de Herencia entre Clases.
Objetivo: Resolución de ejercicios mediante la implementación de una jerarquía de
herencia entre superclases y subclases y la aplicación del mecanismo de sustitución.
Actividad: Implemente la siguiente jerarquía de clases:
con aquellos atributos y métodos necesarios para que se pueda ejecutar el siguiente
programa de consola:
public class Jerarquia {
 public static void main(String args[]) {
 Figura f[] = new Figura[3];
 f[0] = new Circulo(10); // Radio=10
 f[1] = new Cuadrado(10); // Lado=10
 f[2] = new Triangulo(10,5); // Base=10, Altura=5;
 for (int i = 0; i < 3; i++)
 System.out.println("Área: " + f[i].area());
 }
}
Al ejecutar el programa, deberá aparecer por pantalla el área de cada una de las figuras
creadas. 
