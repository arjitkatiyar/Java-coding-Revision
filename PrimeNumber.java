import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your no.");
                int a = sc.nextInt();
                int b;
                int c = 0;
                for(b=1; b<=a; b++){
                    if (a%b==0) {
                        c++;
                    }
                }
                if (c == 2) {
                    System.out.println(a +" "+ "is a Prime no.");
                }
                else{
                    System.out.println(a +" "+ "is not a Prime no.");

                }
            }
        }
    }
