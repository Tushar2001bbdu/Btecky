public class bubblesort {
    public static void main(String args[])
    {

        int[] arr={4,3,2,1};
        bubblesort.sel(arr,4,0,0,0);
        for(int i=0;i<4;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void sel(int[] arr,int r,int c,int max,int i)
    {
        if(r==1)
            return;
        else if(c<(r-1))
        {
            if(arr[c]>max)
            {
                max=arr[c];i=c;
            }
            sel(arr,r,c+1,max,i);
        }
        else {
            if(arr[r-1]<max)
            {
                arr[i]=arr[r-1];
                arr[r-1]=max;
            }
            sel(arr,r-1,0,0,0);
        }
    }
    public static void fun(int[] arr,int r,int c)
    {
        if(r==1)
            return;
        else if(c<(r-1))
        {
            int temp=0;
            if(arr[c]>arr[c+1]) {
                temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
          fun(arr,r,c+1)  ;
        }
        else
        {
            fun(arr,r-1,0);
        }
    }


}
