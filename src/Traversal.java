public class Traversal {
  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<>(10);

    //left subtree
    root.left = new TreeNode<>(9);
    root.left.left = new TreeNode<>(5);
    root.left.right = new TreeNode<>(2);

    //right subtree
    root.right = new TreeNode<>(15);
    root.right.left = new TreeNode<>(-3);
    root.right.right = new TreeNode<>(5);
    root.right.right.right = new TreeNode<>(22);

    TreeNode<String> stringRoot = new TreeNode<>("hello");

    //left subtree 2
    stringRoot.left = new TreeNode<>("town");
    stringRoot.left.left = new TreeNode<>("place");
    stringRoot.left.right = new TreeNode<>("calm");

    //right subtree 2
    stringRoot.right = new TreeNode<>("trance");
    stringRoot.right.left = new TreeNode<>("around");
    stringRoot.right.right = new TreeNode<>("twin");
    stringRoot.right.right.right = new TreeNode<>("bowel");

    // preorder(stringRoot);
    // postorder(root);
    // inorder(root);
    // printGreaterThan(root, 4);
    System.out.println(countNodes(root));
  }

  public static int countNodes(TreeNode<?> current){
    // bool?iftrue:else;
    return current == null ? 0 : 1 + countNodes(current.left) + countNodes(current.right);
    
    // if(current==null) return 0;
    // return 1 + countNodes(current.left) + countNodes(current.right);
  }

  //do a preorder traversal
  //only print the nodes greater than our threshold
  public static void printGreaterThan(TreeNode<Integer> current, int threshold){
    if(current==null) return;
    if(current.data > threshold) System.out.println(current.data);
    printGreaterThan(current.left, threshold);
    printGreaterThan(current.right, threshold);
  }

  public static void preorder(TreeNode<?> current){
    if(current == null) return;
    System.out.println(current.data);
    preorder(current.left);
    preorder(current.right);
  }

  public static <E> void postorder(TreeNode<E> current){
    if(current==null) return;
    postorder(current.left);
    postorder(current.right);
    E myData = current.data;
    System.out.println(myData);
  }

  public static void inorder(TreeNode<?> current){
    if(current==null) return;
    inorder(current.left);
    System.out.println(current.data);
    inorder(current.right);
  }
}
