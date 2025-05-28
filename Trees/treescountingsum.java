// import java.util.*;
public class treescountingsum{
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class bt{
    static int indx=-1;
    public node buildtree(int nodes[]){
        indx++;
        if(nodes[indx]==-1){
            return null;
        }
        node newnode=new node(nodes[indx]);
        newnode.left=buildtree(nodes);
        newnode.right=buildtree(nodes);
        return newnode;
    }
    public static int x=0;
    public int countingsum(node curr,node root){
        if(curr==null){
            return x;
        }
        if(curr!=null){
            x=x+curr.data;
        }
        countingsum(curr.left,root);
        countingsum(curr.right,root);
        return x;
    }
    }
    public static void main(String args[]){
        bt b1=new bt();
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 5, -1, -1};
        node curr=b1.buildtree(nodes);
        int count=b1.countingsum(curr,curr);
        System.out.println("the sum of nodes is "+count);
    }
}