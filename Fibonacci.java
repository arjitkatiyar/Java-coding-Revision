import java.util.*;

public class Fibonacci {
    
    public static void main(String[] args) {
       Scanner fb = new Scanner(System.in);
            System.out.print("Take a input : ");
            int takeinput = fb.nextInt();
            int a = 0;
            int b = 1;
            int c = 0;

            for(int i=1; i<=takeinput; i++){
                System.out.println(c);
                a = b;
                b = c;
                c = a+b; 
            }
            fb.close();
    }
}
