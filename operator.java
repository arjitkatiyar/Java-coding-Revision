public class operator {

    public static void main(String [] args, int i) {
        
        //Assignment operstor
        int num1 = 29;
        int num2 = 10;
        var num3 = 1;

        //Arithmatic operators
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println(num1 * num2);

        //Logical operator
        if (num1==num2 && num1>num2) { //logical AND
            System.out.println(num1);
        }

        else
            System.out.println(num2);
        
        if (num1==num2 || num1>num2) { //logical OR
                System.out.println(num1);
        }
        else
                System.out.println(num2);

        //shift operator
        System.out.println(num1>>2);

        //Assignment operstor
         num3 += num1;  // num3 = num3 + num1;
        System.out.println(num3);

        //unary operator
        num1 = num1++;

        System.out.println(num1);
       
    }


}
