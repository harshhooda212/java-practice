package Intermediate.Arrays;

public class arrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Harsh";
        s1.marks = 10;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Harshu";
        s2.marks = 20;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Harshu Boss";
        s3.marks = 30;

        Student student[] = new  Student[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        // for(int i=0;i<student.length;i++){
        //     System.out.println(student[i].rollno + ":" + student[i].name + " " + student[i].marks);
        // }

        // Enhanced arrays
        for(Student stud:student){
            System.out.println(stud.rollno + ":" + stud.name + " " + stud.marks);
        }

    }
}

class Student {
    int rollno;
    String name;
    int marks;
}