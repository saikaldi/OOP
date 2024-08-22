//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];

        String[] name = new String[5];

        int[] rno = new int[5];
        String[] name1 = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

//        Student kunal;
//        kunal = new Student();


        Student kunal = new Student();


        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);



        kunal.changeName("Nuraika");
        kunal.greetiring();

        Student random = new Student(kunal);

        System.out.println(random.name);

        Student rqndom2 = new Student();
        System.out.println(rqndom2.name);

    }
}

class Student{
    int rno;
    String name;
    float marks;

    void greetiring(){
        System.out.println("Welcome " + this.name);
    }

    void changeName(String new_name){
        name=new_name;
    }



//    Student () {
//        this.rno=13;
//        this.name="saikal";
//        this.marks=30;
//    }

    Student (Student other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }

    Student () {
        this(20, "Sam", 30);
    }

    Student (int rno, String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
}