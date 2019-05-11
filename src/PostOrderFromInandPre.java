public class PostOrderFromInandPre {

    public static int preindex;


    public static void printPostOrderFromInorderAndPre(int[] in,int[] pre,int startIndex,int endIndex,int n)
    {
        if(startIndex<=endIndex) {
            int inorderIndex = searchElementInInorder(in, pre[preindex++]);
            if(inorderIndex!=0) {
                printPostOrderFromInorderAndPre(in, pre, startIndex, inorderIndex - 1,n);
            }
            if(inorderIndex!=n-1) {
                printPostOrderFromInorderAndPre(in, pre, inorderIndex + 1, endIndex, n);
            }
            System.out.print(in[inorderIndex] + " ");
        }

    }

    public static int searchElementInInorder(int[] arr,int data)
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

    public static void main(String[] args) {
        int in1[] = { 4, 2, 5, 1, 3, 6 };
        int pre[] = { 1, 2, 4, 5, 3, 6 };
        int n = in1.length;
        printPostOrderFromInorderAndPre(in1,pre,0,n,n);
    }

}
