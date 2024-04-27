import java.util.*;

public class vovels {
    
    public static void main(String[] args) {
        try (Scanner v = new Scanner(System.in)) {
            System.out.println("Take input :");
            String ch = v.next();
            switch (ch) {
                case "a":
                    System.out.println(ch +" "+ "is vowel");
                    
                    break;
                
                case "e":
                    System.out.println(ch +" "+ "is vowel");
                    
                    break;
                    
                case "i":
                    System.out.println(ch +" "+ "is vowel");
                    
                    break;

                case "o":
                    System.out.println(ch +" "+ "is vowel");
                    
                    break;

                case "u":
                    System.out.println(ch +" "+ "is vowel");
                    
                    break;
            
                default:
                    System.out.println(ch +" "+ "is consonant");
                    break;
            }
        }
    }
}
