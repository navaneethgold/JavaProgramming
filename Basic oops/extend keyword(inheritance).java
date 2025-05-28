class human{
    int age;
    String name;
    human(){
        System.out.println("he is a human ");
    }
    
}
class student extends human{
    student(){
        System.out.println("the human is a student");
    }
    void printfinfo(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(this.name+" "+this.age);
    }
}
public class hello{
public static void main(String args[]){
    student s1=new student();
    s1.printfinfo("navaneeth",17);
    
}
}