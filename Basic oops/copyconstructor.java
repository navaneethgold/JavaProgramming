public class copyconstructor{
    int age;
    String name;
    //int arr[];
    copyconstructor(copyconstructor s2){
        //arr=new int[3];
        this.age=s2.age;
        this.name=s2.name;
        //this.arr=s2.arr;
    }
    copyconstructor(int age,String name){
        this.name=name;
        this.age=age;
    }
    public void printinfo(){
        System.out.println(this.name+" "+this.age);
    }



     public static void main(String []args){
        copyconstructor s1=new copyconstructor(17,"navaneeth");
        //s1.arr[0]=4;
        //s1.arr[1]=5;
        //s1.arr[2]=3;
        copyconstructor s2=new copyconstructor(s1);
        
        s1.printinfo();
        s2.printinfo();
     }
}