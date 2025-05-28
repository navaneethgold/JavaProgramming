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
    public static node reverselinked(node head){
        if(head==null||head.next==null){
            return head;
        }
        node newhead=reverselinked(head.next);
        node front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,2,5};
        node head = new node(arr[0]);
        head.next=new node(arr[1]);
        head.next.next=new node(arr[2]);
        head.next.next.next=new node(arr[3]);
        head.next.next.next.next=new node(arr[4]);
        System.out.println(reverselinked(head).data);
        
    }
}