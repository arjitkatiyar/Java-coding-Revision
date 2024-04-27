import java.util.Scanner;

public class PowerOf {

    public static double CalculatePower(int x, int n){
        int power=1;
        for (int i=1; i<=n; i++){
            power = power*x;
        } 
            System.out.println(power);
            return power;
        //OR
//        return Math.pow(x,n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

       CalculatePower(x,n);
       sc.close();
//        System.out.println(CalculatePower(x,n));
    }
}
