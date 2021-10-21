/*
* @author Grofor Armas
*/
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("La suma es: "+suma(2,2));
  }
  //comentario con dos asteriscos
  /**
  * @param a  Primer entero de la ecuación
  * @param b Segundo entero de la suma
  *@return   La suma de los enteros: a más b
  */

  public static int suma(int a, int b){
    return a+b;
  }
}