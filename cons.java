public class cons {
    public static void main(String[] args) {
        //constructor = A special method to intialize objects
        //      You pass arguments to a constructor
        //      and set up intial values

        Student student1 = new Student("Spiderman",30,5.5);
        Student student2 = new Student("Hulk", 31, 4.6);

        Student student3 = new Student("ishu", 21, 10);


        System.out.println(student1.name);
         System.out.println(student1.age);
          System.out.println(student1.gpa);
          System.out.println(student1.isEnrolled);
           System.out.println(student2.name);
            System.out.println(student2.age);
             System.out.println(student2.gpa);
             System.out.println(student2.isEnrolled);
             System.out.println(student3.name);
         System.out.println(student3.age);
          System.out.println(student3.gpa);
          System.out.println(student3.isEnrolled);


          student1.study();
          student2.study();
          student3.study();
    }
}


class Student{

    String name ;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    void study (){
        System.out.println(this.name + " is studying");
    }
}