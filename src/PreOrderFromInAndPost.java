public class PreOrderFromInAndPost {

    public static int postOrderIndex;

    public static void printPreOrder(int[] in,int[] post,int startIndex,int endIndex,int n)
    {

    }

    public static void main(String[] args) {

    }

    public int search(int[] arr,int data)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==data)
            {
                return i;
            }
        }
        return -1;
    }
}
