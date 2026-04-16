class NodeT1{
    int data;
    NodeT1 left;
    NodeT1 right;
    NodeT1(int data){
        this.data=data;
        left=null;
        right=null;
    }
}

public class Tree1 {
    static NodeT1 build(int arr[],int i){
        if(i>=arr.length)
        return null;
        NodeT1 root=new NodeT1(arr[i]);
        root.left=build(arr,2*i+1);
        root.right=build(arr,2*i+2);
        return root;
    }
    public static void main(String[] args){
        int arr[]={10,20,30,40,50,60,70};
        NodeT1 root=build(arr,0);
    }
}
