import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double base = sc.nextDouble();
    double exponent = 2;
    double pi = 3.14159;
    double result = pi *(Math.pow(base, exponent));
    System.out.printf("%.4f", result);
    sc.close();
  }

  
}