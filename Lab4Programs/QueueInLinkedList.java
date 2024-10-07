class QueueInLinkedList{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node rear = null, front = null;
    
    public int deQueue(){
        if (front == null){
            System.out.println("Queue is Empty");
        }
        int temp = front.data;
        front = front.next;
        return temp;
    }

    public void enQueue(int data){
        Node newNode = new Node(data);
        if (front == null){
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int peak(){
        return rear.data;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public static void main(String[] args) {
        QueueInLinkedList q1 = new QueueInLinkedList();

        q1.enQueue(1);
        q1.enQueue(2);
        q1.enQueue(3);
        q1.enQueue(4);

        System.out.println("Front Element is "+q1.peak());

        q1.deQueue();
        q1.deQueue();
        q1.deQueue();
        q1.deQueue();

        if (q1.isEmpty()){
            System.out.println("Queue is Empty");
        }else {
            System.out.println("Queue is not Empty");
        }
    }
}