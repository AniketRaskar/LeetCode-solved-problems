class decodeXarray
{
    public static void main(String[] args) 
    {
        int first =0;
        int A[] ={1,2,3,4};
        int arr[] = new int[A.length+1];
        arr[0]=first;
        for(int i=0;i<A.length;i++)
        {
            arr[i+1]=A[i]-arr[i];
        }
        return arr;
    }
}