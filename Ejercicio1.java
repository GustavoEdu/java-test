import java.util.*;
public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca una numero: ");
    int num = sc.nextInt();
    System.out.println("El factorial de dicho numero es: " + factorial(num));
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
