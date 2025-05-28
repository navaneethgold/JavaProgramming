// import java.util.*;
public class treescountingnodes{
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
    public int countingnodes(node curr){
        if(curr==null){
            return 0;
        }
        int x=countingnodes(curr.left);
        int y=countingnodes(curr.right);
        return x+y+1;
    }
    }
    public static void main(String args[]){
        bt b1=new bt();
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        node curr=b1.buildtree(nodes);
        int count=b1.countingnodes(curr);
        System.out.println("the number of nodes are "+count);
    }
}