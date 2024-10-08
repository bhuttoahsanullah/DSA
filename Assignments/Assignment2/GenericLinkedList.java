
public class GenericLinkedList<I> {
    
    public class Node<I>{

        I data;
        Node<I> next;
    
        Node(I data){
            this.data = data;
            this.next = null;
        }
    }

        private Node<I> head;
        private int size;
    
    public GenericLinkedList(){
        this.head = null;
        size = 0;
    }    

    public void addToBack(I data){

        Node<I> newNode = new Node<>(data);
        
        if(head==null){
            head=newNode;
        }
        else{
            Node<I> temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }   
            
            temp.next=newNode;
        }
        size++;
    }
    
    public void printList() {
        
        Node<I> temp= head;
        while (temp != null){
            System.out.print(temp.data + " - > ");
            temp = temp.next;
        }
        System.out.print( "null ");
        System.out.println();
    }
        
    public void addToFront(I data){
        
        Node<I> newNode =new Node<>(data);
        if(isEmpty()){
            head=newNode;
        }else{
        newNode.next=head;
        head=newNode;
        }
        size++;
    }

    public void addMiddle(int index,I data){

        Node<I> newNode = new Node<>(data);
        Node<I> n=head;

        for(int i=1;i<index-1;i++)
        {
            n=n.next;
        }
        newNode.next=n.next;
        n.next=newNode;
        size++;
    }
    
    public void removeFromFront(){

       if(isEmpty()){
        System.out.println("List is Empty");
       }
        else{
            head=head.next;
            size--;
        }

    }

    public void removeFromBack(){
        if(isEmpty()){
            System.out.println("List is Empty");
           }
        else{
        Node<I> n=head;
        while(n.next.next!=null)
            n=n.next;
        n.next=null;
        size--;
        }
    }

    public void removeAt(int index){

        if (index==1)
            removeFromFront();
        
        else{
            Node<I> n=head;
            Node<I> temp;
            for(int i=1;i<index-1;i++)
            {
                n=n.next;
            }
            temp=n.next;
            n.next=temp.next;
            size--;
        }
    }
    
    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }




    public static void main(String[] args) {
        GenericLinkedList<Integer> gll = new GenericLinkedList<>();

        gll.addToBack(5);
        gll.addToBack(19);
        gll.addToFront(10);
        gll.addMiddle(2, 3);
        
        
        gll.printList();
        System.out.println("Size of List : "+ gll.size());
        System.out.println();

        GenericLinkedList<String> gll2 = new GenericLinkedList<>();

        gll2.addToBack("ullah");
        gll2.addToBack("Bhutto");
        gll2.addToFront("Ahsan");
        gll2.addMiddle(3, "The ");
        
        
        gll2.printList();
        System.out.println("Size of List : "+ gll2.size());
        System.out.println();

    }


}
