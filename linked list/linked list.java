import java.util.*;
public class LL{
    node head=null;
    public class node{
        String data;
        node next;
        node(String data){
            this.data=data;
            this.next=null;
            
        }
        
    }
    public void addfirst(String data){ 
        node newnode=new node(data);
        newnode.next=head;
            head=newnode;
            
        }
    public void addlast(String data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node lastnode=head;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
        }
        lastnode.next=newnode;
        
    }
    public void deletefirst(){
        node curr=head;
        head=curr.next;
        
    }
    public void deletelast(){
        node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }
    public void print(){
        node newnode2=head;
        //newnode2=head;
        while(newnode2!=null){
            System.out.print(newnode2.data+" -> ");
            newnode2=newnode2.next;
        }
    }
        
    
    //public class hello{
    public static void main(String args[]){
        LL list=new LL();
        list.addfirst("hi");
        list.addlast(" my father is ");
        list.addlast(" the great ramakrishna ");
        list.addlast(" hello ");
        list.print();
        System.out.println("");
        list.deletefirst();
        list.print();
        System.out.println("");
        list.deletelast();
        list.print();
    }
}