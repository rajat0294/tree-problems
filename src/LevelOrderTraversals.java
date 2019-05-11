import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversals {

    //level order traversal without using Extra space
    public static void levelOrderTraversals(Node root,int level)
    {
       if(root==null)
       {
           return;
       }
       if(level==0) {
           System.out.println(root.getData());
       }
       levelOrderTraversals(root.getLeft(), level-1);
       levelOrderTraversals(root.getRight(),level-1);
    }

    //using a queue
    public static void levelOrderTraversalsUsingQueue(Node root)
    {
        Queue<Node> queue=new LinkedList<Node>();
        if(root!=null)
        {
            queue.add(root);
        }
        while(!queue.isEmpty())
        {
            Node current=queue.poll();
            System.out.println(current.getData());
            if(current.getLeft()!=null)
            {
                queue.add(current.getLeft());
            }
            if(current.getRight()!=null)
            {
                queue.add(current.getRight());
            }
        }
    }

    public static void main(String[] args) {
      Node n=new Node();
      n.setData(1);
      Node n1=new Node();
      n1.setData(2);
      n.setLeft(n1);
        Node n2=new Node();
        n2.setData(3);
        n.setRight(n2);
        levelOrderTraversalsUsingQueue(n);
        int h=heightOfTree(n);
        for(int i=0;i<h;i++) {
            levelOrderTraversals(n,i);
        }
    }

    //height of tree
public static int heightOfTree(Node root)
{
    if(root==null)
    {
        return 0;
    }
    else
    {
        return Math.max(heightOfTree(root.getLeft()),heightOfTree(root.getRight()))+1;
    }
}
}
