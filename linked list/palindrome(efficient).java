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
    public static boolean ispalindrome2(node head){
        node curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        int temp=1;
        curr=head;
        boolean ispa=false;
        while(temp!=size/2){
            curr=curr.next;
            temp++;
        }
        
        node curr2=head;
        node curr3=reverselinked(curr.next);
        temp=0;
        while(temp!=size/2){
            if(curr2.data==curr3.data){
                ispa=true;
            }
            else{
                return false;
            }
            temp++;
        }
        //System.out.println(curr.data);
        //System.out.println(curr3.data);
        return true;
    }
    public static void main(String args[]){
        int arr[]={1,2,0,2,1};
        node head = new node(arr[0]);
        head.next=new node(arr[1]);
        head.next.next=new node(arr[2]);
        head.next.next.next=new node(arr[3]);
        head.next.next.next.next=new node(arr[4]);
        //head.next.next.next.next.next=new node(arr[5]);
        System.out.println(ispalindrome2(head));
        
    }
}