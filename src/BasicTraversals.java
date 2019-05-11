public class BasicTraversals {

    public static void  inorderTraversal(Node root)
    {
      if(root==null)
      {
          return;
      }
      inorderTraversal(root.getLeft());
      System.out.println(root.getData());
      inorderTraversal(root.getRight());
    }


    public static void preOrderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.getData());
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());

    }

    public static void postOrderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }
        postOrderTraversal(root.getLeft());
        postOrderTraversal(root.getRight());
        System.out.println(root.getData());
    }

    public static void main(String[] args) {

        Node root=new Node();
        root.setData(1);
        Node left=new Node();
        left.setData(2);
        Node right=new Node();
        right.setData(3);
        root.setLeft(left);
        root.setRight(right);
        System.out.println("----------post order----------");
        postOrderTraversal(root);
        System.out.println("----------pre order----------");
        preOrderTraversal(root);
        System.out.println("----------Inorder----------");
        inorderTraversal(root);
    }
}
