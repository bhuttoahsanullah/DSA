
class QueueUsingTwoStacks extends StackInLinkedList{
    
    private StackInLinkedList s1,s2;
    
    QueueUsingTwoStacks(){
        s1 = new StackInLinkedList();
        s2 = new StackInLinkedList();
    }

    public void enQueu1(int data){
        s1.push(data);
    }

    public int deQueue(){
    
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }

        int temp = s2.pop();
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }

        return temp;
    }

    public static void main(String[] args) {
    
        QueueUsingTwoStacks q1 = new QueueUsingTwoStacks();
    
        q1.enQueu1(3);
        q1.enQueu1(2);
        q1.enQueu1(1);
        System.out.println(q1.deQueue());
        System.out.println(q1.deQueue());
    }
}
