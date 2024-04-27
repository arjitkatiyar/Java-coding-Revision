public class Test {
    int hindi;
    int physics;

    int average() {
        int avg = (hindi + physics) / 2;
        // System.out.println(avg);
        return avg;
    }

    public static void main(String[] args) {

        Test student1 = new Test();
        student1.hindi = 77;
        student1.physics = 83;
        student1.average();

        Test student2 = new Test();
        student2.hindi = 78;
        student2.physics = 78;
        student2.average();

        Test student3 = new Test();
        student3.hindi = 93;
        student3.physics = 67;
        student3.average();

        Test student4 = new Test();
        student4.hindi = 85;
        student4.physics = 96;
        student4.average();

        if (student1.average() > student2.average()) {
            if (student1.average() > student3.average()) 
                if (student1.average() > student4.average()) 
                System.out.println("Average marks of student1 are : " + student1.average() + " : and he is topper");
                else
                System.out.println("Average marks of student4 are : " + student4.average() + " : and he is topper");
            }
        else if (student2.average() > student3.average()) {
            if (student2.average() > student4.average()) 
                if (student2.average() > student1.average()) 
                System.out.println("Average marks of student2 are : " + student2.average() + " : and he is topper");
                else
                System.out.println("Average marks of student1 are : " + student1.average() + " : and he is topper");
            }
        else if (student3.average() > student4.average()) {
            if (student3.average() > student1.average()) 
                if (student3.average() > student2.average()) 
                System.out.println("Average marks of student3 are : " + student3.average() + " : and he is topper");
                else
                System.out.println("Average marks of student2 are : " + student2.average() + " : and he is topper");
            }
        else {
            if (student4.average() > student2.average()) 
                if (student4.average() > student3.average()) 
                System.out.println("Average marks of student4 are : " + student4.average() + " : and he is topper");
                else
                System.out.println("Average marks of student3 are : " + student3.average() + " : and he is topper");
            }
    }
}