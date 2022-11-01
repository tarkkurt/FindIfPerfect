import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int sumOfFactors = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = sc.nextInt();
        for(int i = 1; i<(number/2)+1; i++ ){
            if(number%i == 0) sumOfFactors += i;
        }
        if(sumOfFactors == number){
            System.out.println(number + " mükemmel sayıdır.");
        }
        else System.out.println(number + " mükemmel sayı değildir.");
    }
}