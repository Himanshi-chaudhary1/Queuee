package Queuee;
public class QueueUsingLL {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val = val;
        }
    }
    public static class queueLL{
        node head = null;
        node tail = null;
        int size = 0;
        public void add(int x){
            node temp = new node(x);
            if(size==0){
               head = tail = temp ;
            }
            else{
              tail.next = temp;
              tail = temp;
            }
            size++;
        }
        public int peek() {
            if (size ==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        public int remove() {
            if (size ==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        public void display(){
            if(size ==0){
                System.out.println("Queue is empty");
                return;
            }
            node temp = head;
            while(temp!= null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueLL q1 = new queueLL();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.display();
        System.out.println(q1.peek());
        q1.remove();
        q1.display();
    }
}
