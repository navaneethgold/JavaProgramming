public class bitmanipulation {
    public static int clearbit(int a, int i) {
        return a & ~(1 << i);
    }
    public static int setbit(int a, int i){
        return a|(1<<i);
    }
    public static int updatebit(int a,int i,int newbit){
        //if(newbit==0){
        //    return clearbit(a,i);
        //}
        //if(newbit==1){
        //    return setbit(a,i);
        //}
        int n=clearbit(a,i);
        int bitmask=newbit<<i;
        return n|bitmask;
    }
    public static int getbit(int a,int i){
        if((a&(1<<i))!=0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void oddoreven(int a){
        if(getbit(a,0)==0){
            System.out.println("even");
            
        }
        else{
            System.out.println("odd");
        }
        return;
    }
    public static void ispower2(int a){
        if((a&(a-1))!=0){
            System.out.println("a is not a power of 2");
        }
        else{
            System.out.println("a is a power of 2");
        }
    }

    public static void main(String args[]) {
        System.out.println(updatebit(15, 0,0));
        System.out.println(getbit(13,0));
        oddoreven(13);
        ispower2(16);
    }
}
