public class Topper {
    int hindi;
    int math;
    int science;

    int average() {

        int avg = (hindi + math + science) / 3;
        // System.out.println(avg);
        return avg;
    }

    public static void main(String[] args) {

        Topper student1 = new Topper();
        student1.hindi = 59;
        student1.math = 77;
        student1.science = 63;
        student1.average();

        Topper student2 = new Topper();
        student2.hindi = 84;
        student2.math = 79;
        student2.science = 93;
        student2.average();

        Topper student3 = new Topper();
        student3.hindi = 88;
        student3.math = 71;
        student3.science = 84;
        student3.average();

        if (student1.average() > student2.average()) {
            if (student1.average() > student3.average())
                System.out.println("Average marks of student1 are : " + student1.average() + " : and he is topper");
            else
                System.out.println("Average marks of student3 are : " + student3.average() + " : and he is topper");

        } else {
            if (student2.average() > student3.average())
                System.out.println("Average marks of student2 are : " + student2.average() + " : and he is topper");
            else
                System.out.println("Average marks of student3 are : " + student3.average() + " : and he is topper");
        }

    }

}
