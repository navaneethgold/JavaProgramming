class classroom{
    char name;
    int age;
    public void printfinfo(){
        System.out.println("the name of this student is "+this.name);
        System.out.println("the age of this student is "+this.age);
    } 
}


public class HelloWorld{

     public static void main(String []args){
         classroom[] s1=new classroom[3];
         
         for(int i=0;i<3;i++){
             s1[i]=new classroom();
             s1[i].age=i+65;
             s1[i].name=(char)s1[i].age;
             s1[i].printfinfo();
         }
        //System.out.println("Hello, World!");
     }
}