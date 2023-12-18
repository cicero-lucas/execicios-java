import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Main {
  public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Integer> listPar = new ArrayList<Integer>();
        ArrayList<Integer> listImp = new ArrayList<Integer>();
        for(int i=0; i<num; i++){
        int n=sc.nextInt();
        if(n%2==0){
            listPar.add(n);
        }else{
            listImp.add(n);
        }
        }
        Collections.sort(listPar);
        System.out.println(listPar);
        for(int p:listPar){
        System.out.println(p);
        }
        Collections.reverse(listImp);
        System.out.println(listImp);
        for(int i:listImp){
        System.out.println(i);
        }
    }
}