class Node {
  int item, height;
  Node left, right;

  Node(int d) {
    item = d;
    height = 1;
  }
}
class AVL {

  int height(Node N) {
    if (N == null)
      return 0;
    return N.height;
  

  int max(int a, int b) {
  
    return (a > b) ? a : b;
  }

  Node RotateRight(Node y) {
    Node x = y.left;
    Node T2 = x.right;
    x.right = y;
    y.left = T2;
    y.height = max(height(y.left), height(y.right)) + 1;
    x.height = max(height(x.left), height(x.right)) + 1;
    return x;
  }

  Node RotateLeft(Node x) {
    Node y = x.right;
    Node T2 = y.left;
    y.left = x;
    x.right = T2;
    x.height = max(height(x.left), height(x.right)) + 1;
    y.height = max(height(y.left), height(y.right)) + 1;
    return y;
  }
 
  int getBalanceFactor(Node N) {
    if (N == null)
      return 0;
    return height(N.left) - height(N.right);
  }

  Node insertNode(Node node, int item) {

    if (node == null)
      return (new Node(item));
    if (item < node.item)
      node.left = insertNode(node.left, item);
    else if (item > node.item)
      node.right = insertNode(node.right, item);
    else
      return node;

    node.height = 1 + max(height(node.left), height(node.right));
    int balanceFactor = getBalanceFactor(node);
    if (balanceFactor > 1) {
      if (item < node.left.item) {
        return RotateRight(node);
      } else if (item > node.left.item) {
        node.left = RotateLeft(node.left);
        return RotateRight(node);
      }
    }
    if (balanceFactor < -1) {
      if (item > node.right.item) {
        return RotateLeft(node);
      } else if (item < node.right.item) {
        node.right = RotateRight(node.right);
        return RotateLeft(node);
      }
    }
    return node;
  }

  private void printTree(Node currPtr) {
    if (currPtr != null) 
    {
      printTree(currPtr.left);
      System.out.print(currPtr.item+ " ");
      printTree(currPtr.right);
    }
  }

  public static void main(String[] args)
  {
    AVL tree = new AVL();
    tree.root = tree.insertNode(tree.root, 56);
    tree.root = tree.insertNode(tree.root, 14);
    tree.root = tree.insertNode(tree.root, 86);
    tree.root = tree.insertNode(tree.root, 25);
    tree.root = tree.insertNode(tree.root, 38);
    tree.root = tree.insertNode(tree.root, 69);
    tree.root = tree.insertNode(tree.root, 89);
    tree.printTree(tree.root);
  }
}

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
          




