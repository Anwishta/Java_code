import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        System.out.println("Enetr the year to be checked: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%400==0){
            System.out.println("Year is a leap year!");}
            else if(a%100==0){
                System.out.println("year is not a leap year!");
            }else
                System.out.println("Year is a leap year!");
                sc.close();
            }
        }
    

