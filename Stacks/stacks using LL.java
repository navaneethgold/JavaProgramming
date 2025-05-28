import java.util.*;
public class stack{
    public static node head=null;
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
        }
        
    }
    public static void push(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static int pop(){
        if(head==null){
            return -1;
        }
        node top=head;
        head=head.next;
        return top.data;
    }
    public static int peek(){
        if(head==null){
            return -1;
        }
        node top=head;
        return top.data;
    }
    public static void main(String args[]){
        stack s1=new stack();
        s1.push(5);
        s1.push(7);
        s1.push(8);
        System.out.println(s1.peek());
        s1.pop();
        System.out.println(s1.peek());
    }
    
}