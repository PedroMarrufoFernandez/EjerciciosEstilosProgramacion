package calificaciones;

import java.util.*;
public class Calificaciones {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double nota;
      System.out.println("Ingrese una calificacion entre 0 y 100: ");
      nota = sc.nextDouble();
      System.out.println("La calificación es ");
      if(nota < 0 || nota > 100)
         System.out.println("Ingrese un numero valido");
      else if(nota==100)
           System.out.println("Alumno Honorable");
      else if (nota >= 90)
           System.out.println("Sobresaliente");
      else if (nota >= 80)
           System.out.println("Notable");
      else if (nota >= 70)
           System.out.println("Bueno");
      else if (nota >= 60)
           System.out.println("Suficiente");
      else
           System.out.println("Reprobatorio");
    }
}