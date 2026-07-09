import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class StudentManagementSystemV2{

   public static void entry(ArrayList<Student1>details,Scanner sc){
    String name;
    int age=0;
   System.out.println("Enter the number of the student to enter: ");
   int num= sc.nextInt();
   sc.nextLine();
   for (int i=0;i<num;i++){
    boolean t=false;
    System.out.println("Enter the name of the students: ");
    name=sc.nextLine();
    
    
    while(!t){
    try{
    System.out.println("Enter the age of the student");
     age=sc.nextInt();
     sc.nextLine();
     t=true;
     details.add(new Student1(name,age));
    }
    catch(InputMismatchException e){
     System.out.println("-------------------------");
     System.out.println("Invalid Age entered ");
     System.out.println("Enter number instead ");
     System.out.println("-------------------------");
     sc.nextLine();
     }
    
   }
   }
}

 public static void display(ArrayList<Student1>details){
    if(details.isEmpty()){
        System.out.println("First enter the students names ");
        return;
    }
    int i=1;
    for(Student1 a: details){
        System.out.println("Student: "+i);
        System.out.println("Name: "+a.getName());
        System.out.println("Age: "+a.getAge());
        i++;
    }
 }
public static void calculation(ArrayList<Student1>details){
     if(details.isEmpty()){
        System.out.println("First enter the students names ");
        return;
    }
    Double average;
    int sum=0;
    for(Student1 b:details){
     sum+=b.getAge();
    }
    average=sum/(double)details.size();
    System.out.println("The average age of all the students: "+average);
}
public static void search(ArrayList<Student1>details,Scanner sc){
    boolean found=false;
     if(details.isEmpty()){
        System.out.println("First enter the students names ");
        return;
    }
    System.out.println("Enter the name to search: ");
    String s=sc.nextLine();
    for(Student1 c: details){
        if(c.getName().equalsIgnoreCase(s)){
            System.out.println("Student found: ");
            System.out.println("Details of the student: ");
            System.out.println("Name: "+c.getName());
            System.out.println("Age: "+c.getAge());
            found=true;
            break;
        }
    }
       if(!found){
        System.out.println("Name not found: ");
       }
    
 
}
public static void oldest(ArrayList<Student1>details){
     if(details.isEmpty()){
        System.out.println("First enter the students names ");
        return;
    }
    Student1 oldest=details.get(0);
   for(Student1 d: details){
    if(d.getAge()>oldest.getAge()){
        oldest=d;
    }
   }
   System.out.println("Oldest Student name: "+oldest.getName());
   System.out.println("Oldest Student age: "+oldest.getAge());
}

public static void youngest(ArrayList<Student1>details){
     if(details.isEmpty()){
        System.out.println("First enter the students names ");
        return;
    }
    Student1 youngest=details.get(0);
   for(Student1 d: details){
    if(d.getAge()<youngest.getAge()){
       youngest=d;
    }
   }
   System.out.println("Youngest Student name: "+youngest.getName());
   System.out.println("Youngest Student age: "+youngest.getAge());
}
public static void menu(ArrayList<Student1>details,Scanner sc){
    boolean t=false;
    int choice=0;
    while(choice!=7){
    System.out.println("___________<Menu>___________");
    System.out.println("For: \n Student Entry (1): \n Display the names of the Student entered (2): \n Taking the average age of the students (3): \n Searching the name(4): \n Taking the oldest student name(5):  \n Taking the youngest Student name(6): \n Exiting(7): ");
  while(!t){
    try {
    choice=sc.nextInt();
    t=true;
   }
   catch(InputMismatchException e){
    System.out.println("----------------------------------------------");
    System.out.println("Invalid choice entered use numbers instead ");
    System.out.println("---------------------------------------------");
    sc.nextLine();
   }
}
    switch(choice){
         case 1:
         entry(details,sc);
         break;
         case 2:
         display(details);
         break;
         case 3:
         calculation(details);
         break;
         case 4:
         search(details, sc);
         break;
         case 5:
         oldest(details);
         break;
         case 6:
         youngest(details);
         break;
         case 7:
            System.out.println("Exiting.......");
         break;
         default:
         System.out.println("Wrong choice entered re check ");
         break;         
    }
    }
}



public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    ArrayList<Student1>details=new ArrayList<>();
    menu(details, sc);
    
}
}