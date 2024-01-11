import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {

  public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

    while(true){

      Menu();
      System.out.print("Digite sua Opção: ");
      int opc= sc.nextInt();

      if(opc==0){
         System.out.print("........................");
         break;
         
      }else if(opc ==1){
        System.out.print("Digite a base: ");
        float b= sc.nextFloat();
         System.out.print("Digite a altura: ");
        float h= sc.nextFloat();
        float areaTriagulo= (b*h)/2;
        System.out.printf("Área do triângulo: %.2f\n", areaTriagulo);

      }else if(opc ==2){
         System.out.print("Digite a lado: ");
        float l=sc.nextFloat();
        int expo=2;
        double areaQuadrado= Math.pow (l,expo);
        System.out.printf("Area do quadrado %.2f\n", areaQuadrado);
      
      }else if(opc ==3){
         System.out.print("Digite a D: ");
          float D=sc.nextFloat();
         System.out.print("Digite a d: ");
          float d=sc.nextFloat();
          float areaLozango=(D+d)/2;
          System.out.printf("Area do Lozango %.2f\n", areaLozango);
        
      }else if(opc ==4){
         System.out.print("Digite a base: ");
        float b= sc.nextFloat();
         System.out.print("Digite a base: ");
        float h= sc.nextFloat();
        float arearetangulo= (b*h);
        System.out.printf("Area do retangulo %.2f\n", arearetangulo);
      } 
    }
    
  }
  public static void Menu(){
    System.out.println("------------------------");
    System.out.println("Matematica ");
    System.out.println("------------------------");
    System.out.println("1. Area do Triangulo");
    System.out.println("2. Area do Quadrado");
    System.out.println("3. Area do Lozango");
    System.out.println("4. Area do Retagunlo");
    System.out.println("0. Sair");
  }
}