package Exception;

public class Demo01Ariphmetic {
     class Main {
         public static void main() {
 }
         public static void main(String[] args) {
 int a = 4;
 try {
  System.out.println(a/0);
 } catch (ArithmeticException e) {
     System.out.println("Произошла недопустимая арифметическая операция");
   }
  }
 }
}
