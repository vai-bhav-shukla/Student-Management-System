public class Student1 {
   private  String name;
   private  int age;
   public Student1(String name,int age){
    setName(name);
    setAge(age);
   }

    public void setName(String name){
     this.name=name;
   }
    public String getName(){
        return name;
    }
    public int  getAge(){
        return age;
    }
   public void setAge(int age){
    if(age>5 && age<70){
    this.age=age;  
    }
    else {
        System.out.println("Invalid age entered ");
    }
    
    
}
}

