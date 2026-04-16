class NodeT2{
    int data;
    NodeT2 left;
    NodeT2 right;
    NodeT2(int d){
        data=d;
    }
}
class Binary{
    NodeT2 root;
    void insert(int key){
        
        if(root==null){
            root=new NodeT2(key);
        }
        insertHelper(root,key);
    }
    NodeT2 insertHelper(NodeT2 r,int k){
        if(r==null) {
            r=new NodeT2(k);
            return r;
        }

        if(k<r.data) r.left=insertHelper(r.left,k);
        else if(k>r.data) r.right=insertHelper(r.right,k);
        return r;
    }
    void inorder(NodeT2 root){
        if(root!=null{
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);

        })
    }
    void postorder(NodeT2 root){
        inorder(root.left);
            
            inorder(root.right);
            System.out.println(root.data+" ");
    }
    void preorder(NodeT2 root){
        System.out.println(root.data+" ");
        inorder(root.left);
            
            inorder(root.right);
            
    }
    void levelOrder(NodeT2 root){
        Queue<Nodet2> q=new Linkedlist();
        q.add(root);
        while(!q.isempty()){
            NodeT2 curr
        }
    }
    public static void main(String[] args){
        Binary obj=new Binary();
        obj.insert(10);
        obj.insert(5);
        obj.insert(2);
        obj.insert(6);
        obj.insert(16);
        obj.insert(14);
        obj.insert(18);
        obj.inoder(root);
        obj.preorder(root);
        obj.postorder(root);
    }
}