class NodeQ1{
    int data;
    NodeQ1 next;
    NodeQ1(int d){
    {
        data=d;
    }        
public class MyQueue {
    public static void main(String[] args){
        MyQueue obj=new MyQueue();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.traverse("initial phase"+obj.head());
        obj.delete();
        obj.traverse("after deletion"+obj.head());
    }
    public void insert(int d){
        NodeQ1 newNode=new NodeQ1(d);
        if(head===null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void traverse(String desc,NodeQ1 head){
        System.out.println(desc);
        NodeQ1 current=head;
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    
}
