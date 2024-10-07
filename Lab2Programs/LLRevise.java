public class LLRevise {
    
    class Node{
        int data;
        Node next;
        //Constructor
        Node(int data)
        {
        this.data=data;
        this.next=null;
        }
    }

    Node head;
    public static int size = 0;

    void addToBack(int data){

        Node newNode=new Node(data);
        
        if(head==null){
            head=newNode;
            size++;
        }
        else{
        
        Node temp=head;
        
        while(temp.next!=null){
            temp=temp.next;
        }
            
        temp.next=newNode;
        size++;
        }
    }
     
    void addToFront(int data){

        Node newNode =new Node(data);
        Node temp=head;
        
        head=newNode;
        newNode.next=temp;
        size++;
    }

    public int size(){
        return size;
    }

    boolean isListEmpty() {
        return head == null;
    }
    
    void deleteStart() {
        head =head.next;
        size--;
        }

        void removeFromBack() {
            Node temp =head;
            
            while(temp.next.next!=null){
                temp=temp.next;
            }
            
            temp.next=null;
            size--;
            }

            void addToMiddle(int index,int data) {
    
                Node newNode=new Node(data);
                Node temp =head;
            
                for(int i=1;i<index-1;i++){
                    temp =temp.next;
                }

                newNode.next=temp.next;
                temp.next=newNode;
                size++;
            }
            
        void deleteAt(int index) {
            
                if (index==0){
                    deleteStart();
                }         
                else{
                Node newNode=head;
                Node temp=null;
                
                for(int i=0;i< index-1;i++){
                newNode=newNode.next;
                }
                temp=newNode.next;
                newNode.next=temp.next;
                size--;
            }
        }

    void PrintList(){
        Node newNode = head;
        
        while (newNode!=null) {
            System.out.print(newNode.data+" -> ");
            newNode = newNode.next;
        }
        System.out.println(" null ");

     }
           
    public static void main(String[] args) {
        LLRevise ll = new LLRevise();

        System.out.println("isListEmpty : "+ll.isListEmpty());
        ll.addToBack(2);
        ll.addToBack(3);
        ll.PrintList();
    System.out.println("Size: "+size);
       System.out.println(ll.size()); 

       ll.addToFront(1);
       ll.PrintList();
       System.out.println("Size: "+ll.size());
       System.out.println("isListEmpty : "+ll.isListEmpty());
    
       ll.deleteStart();
       ll.PrintList();
       System.out.println("Size: "+ll.size());

       ll.removeFromBack();
       ll.PrintList();
       System.out.println("Size: "+ll.size());

       ll.addToMiddle(0, 1);
       ll.PrintList();
       System.out.println("Size: "+ll.size());

       ll.addToMiddle(1, 3);
       ll.PrintList();
       System.out.println("Size: "+ll.size());

        ll.deleteAt(2);
        ll.PrintList();
       System.out.println("Size: "+ll.size());

    }
}
