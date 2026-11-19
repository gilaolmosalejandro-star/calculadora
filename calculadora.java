import java.util.Scanner;

void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("1.Sumar dos numeros");
    System.out.println("2.Salir");
    System.out.print("Introduce opcion:");
    int opcion=sc.nextInt();
    sc.nextLine();
    System.out.println("La opcion es "+opcion);
    
    sc.close();
}