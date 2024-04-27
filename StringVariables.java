public class StringVariables {
    
    static String Name = "Arjit"; //static variable

    String Friend = "Saurabh"; //instance variable

    public static void main(String[]args){

       String Friend2 = "Manas"; //local variable
        System.out.println(Friend2);

        StringVariables NewObjectFriend = new StringVariables();
        
        System.out.println(NewObjectFriend.Friend);
        System.out.println(Name);

    }


}
