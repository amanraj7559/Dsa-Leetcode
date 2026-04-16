class Node{
    int item,height;
    Node left,right;
    Node(int d){
        item=d;
        height=1;
    }

}
public class Avl {
    Node root;
    int getBalancefactor(Node N){
        if(N==null) return 0;
        return height(N.left)-height(N.right);


    }
    Node insertNode(Node node,int item){
        if(node==null) return (new Node(item));
        if(item<node.item) node.left=insertNode(node.left,item);
        else if(item>node.item) node.right=insertNode(node.right,item);
        else 
        node.height=1+max(height(node.left),height(node.right));
        int balancefactor=getBalanceFactor(node);
        if(balanceFactor>1){
            if(item<node.left.item)  return RotateRight(node);
            else if(itm>node.left.item){
                node.left=RotateLeft(node.left);
                return RotateRight(node);
            
            }
        }
        if(balanceFactor<-1){
            if(item>node.right)
        }
    }
    public static void main(String[] args){
        Avl tree=new Avl();
        tree.root=tree.insertNode(tree.root,56);
        tree.root=tree.insertNode(tree.root,14);
        tree.root=tree.insertNode(tree.root,86);
        tree.root=tree.insertNode(tree.root,25);
        tree.root=tree.insertNode(tree.root,38);
        tree.root=tree.insertNode(tree.root,69);
        tree.root=tree.insertNode(tree.root,89);
        tree.printTree(tree.root);
        
    }
    
}
