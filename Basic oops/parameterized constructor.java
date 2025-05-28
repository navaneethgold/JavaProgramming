class classroom{
    char name;
    int age;
    public void printfinfo(int age,char name){
        this.age=age;
        this.name=name;
        System.out.println("the name of this student is "+this.name);
        System.out.println("the age of this student is "+this.age);
    } 
}


public class HelloWorld{

     public static void main(String []args){
         classroom[] s1=new classroom[3];
         
         for(int i=0;i<3;i++){
             s1[i]=new classroom();
             s1[i].printfinfo(i+65,(char)(i+65));
         }
     }
}