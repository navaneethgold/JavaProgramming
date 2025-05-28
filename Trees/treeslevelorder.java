import java.util.*;
public class treeslevelorder{
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
    public void levelorder(node root){
        Queue<node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    
                }
            }
            else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                q.add(curr.left);}
                if(curr.right!=null){
                q.add(curr.right);}
                
            }
        }
    }
    }
    public static void main(String args[]){
        bt b1=new bt();
        int nodes[]={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        node curr=b1.buildtree(nodes);
        //System.out.println(curr.data);
        b1.levelorder(curr);
    }
}