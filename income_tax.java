import java.util.Scanner;

public class income_tax {
    public static void main(String[] args) {
        System.out.println("Enter your income:");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float tax=0;
        if(a<250000f){
            tax = tax+0;
        }
        else if(a>=250000 && a<=500000){
            tax = tax + .05f *(a-250000) ;
  }
        else if(a>=500000 && a<=1000000){
            tax = tax + .05f *250000 + .1f*(a-500000) ;
    }
    else{
            tax = tax + .05f *250000 + .1f*500000 + .3f*(a-1000000) ;
}
System.out.printf("The total tax on income %f is %f", a, tax);
sc.close();
    }}