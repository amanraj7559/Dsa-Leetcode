class NodeQ2{
    int data;
    int pri;
    NodeQ2 next;
    NodeQ2(int d){
    {
        data=d;
    }        
public class MyQueue2 {
    public static void main(String[] args){
        MyQueue2 obj=new MyQueue2();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.traverse("initial phase"+obj.head());
        obj.delete();
        obj.traverse("after deletion"+obj.head());
    }
    public void insert(int d,int p){
        NodeQ2 newNode=new NodeQ2(d,p);
        if(head===null){
            
        }
        else{
            if(p<head.pri){
                newNode.next=head;
                head=newNode;
            }
            else{
                NodeQ2 current=head;
                while(current.next!=null && current.next.pri<=p){
                    current=current.next;
                }
                newNode.next=current.next;
                current.next=newNode;
            }
        }

    }
    public void traverse(String desc,NodeQ2 head){
        System.out.println(desc);
        NodeQ2 current=head;
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    
}
