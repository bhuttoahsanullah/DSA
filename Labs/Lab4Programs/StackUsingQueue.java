class StackUsingQueue extends QueueInLinkedList{
    
    QueueInLinkedList q1,q2;
    
    StackUsingQueue(){
        q1 = new QueueInLinkedList();
        q2 = new QueueInLinkedList();
    }
    
    public void push(int data){
        if (!q1.isEmpty()){
            q1.enQueue(data);
        }else {
            q2.enQueue(data);
        }
    }
    
    public boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();
    }
    
    public int pop(){
        if (isEmpty()){
            System.out.println("Q is Empty");
            return -1;
        }
        int top = -1;
        if (!q1.isEmpty()){
            while (!q1.isEmpty()){
                top = q1.deQueue();
            
                if (q1.isEmpty()) {            
                    break;
                }
                q2.enQueue(top);
            }
        }else {
            while (!q2.isEmpty()){
                top = q2.deQueue();
                
                if (q2.isEmpty()){
                    break;
                }
                q1.enQueue(top);
            }
        }
        return top;
    }
    

    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}