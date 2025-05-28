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
    public static node reversell(node head){
        node pre=null;
        node temp=head;
        node front;
        while(temp!=null){
            front=temp.next;
            temp.next=pre;
            pre=temp;
            temp=front;
        }
        return pre;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,2,5};
        node head = new node(arr[0]);
        head.next=new node(arr[1]);
        head.next.next=new node(arr[2]);
        head.next.next.next=new node(arr[3]);
        head.next.next.next.next=new node(arr[4]);
        System.out.println(reversell(head).data);   
        
    }
}