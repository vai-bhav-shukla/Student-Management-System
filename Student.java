import java.util.Scanner;
public class Student {
    String n1="";
    String n2="";
    String n3="";
    double m1,m2,m3;
    String grade1="";
    String grade2="";
    String grade3="";
    double highest;

        public Student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        n1=sc.nextLine();
        System.out.println("Enter the marks of the student: ");
        m1=sc.nextDouble();
        sc.nextLine();
        if(m1>100 || m1<0){
            System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
           m1=0;
        }
        System.out.println("Enter the name of the student: ");
        n2=sc.nextLine();
        System.out.println("Enter the marks of the student: ");
        m2=sc.nextDouble();
        sc.nextLine();
        if(m2>100 || m2<0){
            System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
            m2=0;
        }
        System.out.println("Enter the name of the student: ");
        n3=sc.nextLine();
        System.out.println("Enter the marks of the student: ");
        m3=sc.nextDouble();
        sc.nextLine();
        if(m3>100 || m3<0){
            System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
            m3=0;
        }
         sc.close();
    }
    public void display(){
        System.out.println();
        System.out.println("Student 1: ");
        System.out.println("Name: "+n1);
        System.out.println("Marks: "+m1);
        System.out.println("Grade: "+grade1);
        System.out.println();
        System.out.println("Student 2: ");
        System.out.println("Name: "+n2);
        System.out.println("Marks: "+m2);
        System.out.println("Grade: "+grade2);
        System.out.println();
        System.out.println("Student 3: ");
        System.out.println("Name: "+n3);
        System.out.println("Marks: "+m3);
        System.out.println("Grade: "+grade3);
        System.out.println();
        System.out.println("The highest marks is: "+highest);

    }
    public void grade(){
        if(m1>=90)
            grade1="A";
            else if(m1>=80)
            grade1="B";
        else if(m1>=70)
            grade1="C";
        else if(m1>=60)
            grade1="D";
        else
            grade1="F";
        if(m2>=90)            
            grade2="A";
        else if(m2>=80)          
            grade2="B";
        else if(m2>=70)
            grade2="C";
        else if(m2>=60)
            grade2="D";
        else
            grade2="F";
        if(m3>=90)
            grade3="A";
        else if(m3>=80)
            grade3="B";
        else if(m3>=70)
            grade3="C";
        else if(m3>=60)
            grade3="D";
        else
            grade3="F";

    }
    public double highest(){
        highest=m1>m2?(m1>m3?m1:m3):(m2>m3?m2:m3);
         return highest;
    }

    public static void main(String args[]){
        Student obj=new Student();
        obj.grade();
        obj.highest();
        obj.display();
    
    }
   
}
