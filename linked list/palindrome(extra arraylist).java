import java.util.*;
public class main{
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean ispalindrome(node head){
        ArrayList<Integer> a=new ArrayList<>();
        node curr=head;
        int i=0;
        boolean ispa=false;
        while(curr!=null){
            a.add(curr.data);
            i++;
            curr=curr.next;
        }
        for(int j=0;j<i;j++){
            if(a.get(j)==a.get(i-j-1)){
                ispa=true;
            }
            else{
                return false;
            }
        }
        return true;
    
    }
    public static boolean ispalindrome2(node head){
        node curr=head;
        node rev=head;
        while(curr)
    }
    public static void main(String args[]){
        int arr[]={1,2,3,2,1};
        node head = new node(arr[0]);
        head.next=new node(arr[1]);
        head.next.next=new node(arr[2]);
        head.next.next.next=new node(arr[3]);
        head.next.next.next.next=new node(arr[4]);
        System.out.println(ispalindrome(head));
        
    }
}