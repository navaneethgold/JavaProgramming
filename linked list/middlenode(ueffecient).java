public class Main {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

   public static node middlenode(node head){
        node curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        int temp=1;
        curr=head;
        while(temp!=size/2){
            curr=curr.next;
            temp++;
        }
        
        return curr.next;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 0, 2, 1};
        node head = new node(arr[0]);
        head.next = new node(arr[1]);
        head.next.next = new node(arr[2]);
        head.next.next.next = new node(arr[3]);
        head.next.next.next.next = new node(arr[4]);
        //head.next.next.next.next.next=new node(arr[5]);

        node middleNode = middlenode(head);

        System.out.println("Middle Node Data: " + middleNode.data);
    }
}
