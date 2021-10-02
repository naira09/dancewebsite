import java.util.*;
class Question4_java{
static long prodXOR(int arr[], int n)
    {
       int ans = 1; 
      
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                ans *= arr[i] ^ arr[j];
      
        return ans;
    }
      
    public static void main(String args[])
    {
        long prod = 0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
          
        prod = prodXOR(arr, n);
        double output=prod%(Math.pow(10,9)+7);
        System.out.println((int)output);
    }
}
  