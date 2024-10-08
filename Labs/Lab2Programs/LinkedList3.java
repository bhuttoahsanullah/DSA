public class LinkedList3 {
    Node head;
    int size;
    public LinkedList3(){
        head = new Node(0); 
        size = 0;
       }
    public boolean isEmpty(){
        if (head.data==0){
            return true;
        }
        return false;
    }
    public int size(){
        return size;
    }
    public void add(int data){
        Node newnode=new Node(data);
        if(isEmpty()){
            head=newnode;
            size++;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            size++;
        }
    }
    public void add(int index, int data){
        Node newnode=new Node(data);
         if(index==1){
            newnode.next=head;
            head=newnode;
            size++;
        }
        else{
            newnode.data=data;
            Node temp=head;
            for(int i=1;i<index-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            size++;
        }
    }
    public void removefromIndex(int index){
        if (index==1){
            head=head.next;
        }
        else{
            Node temp=head;
            for(int i=1;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    void remove(int item) {
        if (head == null) {
            return;
        }

        // If the item is at the head
        if (head.data==item) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data==item) {
                // If the node to remove is the last one
                if (temp.next.next == null) {
                    temp.next = null;
                    size--;
                } else {
                    temp.next = temp.next.next;
                    size--;
                }
                return;
            }
            temp=temp.next;}
        }
        LinkedList3 duplicate(){
      LinkedList3 duplicate=new LinkedList3();
      Node temp=head;
      while(temp!=null){
        duplicate.add(temp.data);
        temp=temp.next;
      }
      return duplicate;
        }
    public void print(){
        if(isEmpty()){
            System.out.println("linked list is empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public void AddFront(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
        }
        else{
        newNode.next=head;
        head=newNode;

        }
    }
    LinkedList3 ReversedList(){
        LinkedList3 reversedlist=new LinkedList3();
        Node temp=head;
        while(temp!=null){
            reversedlist.AddFront(temp.data);
            temp=temp.next;
        }
        return reversedlist;

    }
    public static void main(String[] args) {
        LinkedList3 ll=new LinkedList3();
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(8);
        ll.add(3, 10);
        ll.print();
       System.out.println(ll.size());
       ll.removefromIndex(3);
       ll.print();
       System.out.println(ll.size());
       ll.remove(8);
       ll.print();
       System.out.println(ll.size());
       ll.remove(5);
       ll.print();
       System.out.println(ll.size());
       LinkedList3 l=ll.duplicate();
       l.print();
       LinkedList3 reverse=ll.ReversedList();
      reverse.print();
      
      
    }
}