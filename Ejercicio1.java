import java.util.*;
public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca una numero: ");
    int num = sc.nextInt();
    System.out.println("El factorial de dicho numero es: " + factorial(num));
    System.out.println("El numero es primo?: " + mostrarConsulta(esPrimo(num)));
  }
  public static String mostrarConsulta(boolean result) {
    if(result) {
      return "Si";
    }
    return "No";
  }
  public static boolean esPrimo(int num) {
    if(num == 1) {
      return false;
    }
    else if(num == 2) {
      return true;
    }
    else {
      for(int i = 3; i < num; i++) {
        if(num % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
  public static int factorial(int num) {
    if(num == 0 || num == 1) {
      return 1;
    }
    else {
      return num * factorial(num - 1);
    }
  }
}
