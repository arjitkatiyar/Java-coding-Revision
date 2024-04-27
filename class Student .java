

class Student {
    int id;
    String  name;
    long phone;

            public static void main(String [] args) //this is the actual signature of main method 
            {
                    Student student1; //declaration of object reference
                    student1 = new Student();
                    student1.id = 1;
                    student1.name = "Anurag";
                    student1.phone = 123456789; //assignment of value 

                    System.out.println(student1.id + " " + student1.name + " " + student1.phone);

                    Student student2 = new Student();

                    student2.id = 2;
                    student2.name =  "Jayshree";
                    student2.phone = 12345;
                    System.out.println(student2.id + " " + student2.name + " " + student2.phone);



            }

}
