import java.util.*;
public class Probmen2 {
	public static void main(String[] args){
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int[] d = new int[n];
		        int[] v=new int[n];
		        for (int i = 0; i < n; i++){
		            d[i] = sc.nextInt();
		            v[i]=0;
		        }
		        int tar = sc.nextInt();
		        Arrays.sort(d);
		        int i=n-1;
		        while(tar>d[0]){
		            for(;i>=0;i--)
		                if(d[i]<=tar){
		                    tar=tar-d[i];
		                    v[i]++;
		                    break;
		                }
		        }
		        if(tar>0)
		            v[0]++;
		        for(i=n-1;i>=0;i--)
		            if(v[i]!=0)
		                System.out.println(d[i]+":"+v[i]);
		    }
		}

