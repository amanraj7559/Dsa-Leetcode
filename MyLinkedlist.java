class SSLNode{
    int data=0;
    SSLNode next=null; 
    SSLNode(int data){
        this.data=data;
    }


    
}
public class MyLinkedlist {
    void insert(int value){
        SSLNode n=new SSLNode(value);
        if(hed==null){
            head=n;
        
        }
        else{
            SSLNode current=head;
            while(current.next!=null){
                current=current.next;
            }
        }
    }
    public static void main(String[] args) {
        MyLinkedlist obj=new MyLinkedlist();
        obj.insert(10);
        obj.insert(20);

        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
    }
}
