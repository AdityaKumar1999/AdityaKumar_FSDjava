import java.util.*;
public class Problem1 {
	public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] a=new int[n];
     for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
     int m=sc.nextInt();
     int[] tar=new int[n];
     for(int i=0;i<m;i++)
         tar[i]=sc.nextInt();
     for(int i=0;i<m;i++)
         solve(n,a,tar[i]);
 }
 static void solve(int n,int[] a,int tar){
     int sum=0;
     for(int i=0;i<n;i++){
         sum+=a[i];
         if(sum>=tar){
             System.out.println("Target achieved after "+(i+1)+" transactions");
             break;
         }
     }
     if(sum<tar)
         System.out.println("Target is not achieved");
 }
}

