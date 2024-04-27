import java.util.*;

public class SquareArea {
    int a;

    void square(){
        int area = a*a;
        System.out.println(area);
    }
    
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of a : ");
            SquareArea  area1 = new SquareArea();
            area1.a = sc.nextInt();
            area1.square();
        }
    }
}
