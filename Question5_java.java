import java.util.*;
class Question5_java{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n ??");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        System.out.println("Enter the value of A ??");
        int a=sc.nextInt();
        System.out.println("Enter the value of B ??");
        int b=sc.nextInt();
        for(int i=1;i<n;i++){
        	if((i<i+a)||(i>i-b))
        		count+=1;
        }
        System.out.println("Different positions can be "+count);

	}
}