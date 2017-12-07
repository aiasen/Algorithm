import java.util.*;
public class Main {
	public static void main(String args[]){		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] p = new int[10001];
		int i;
		while( n>0 ) {
			for (i = 1; i <= n; i++) 
				p[i] = sc.nextInt();
			System.out.println(cut(p,n));
			n = sc.nextInt();  
			}
		}


public static int cut(int p[],int n) {
		int max;
		int f[]=new int [10001];
		int i;
		int k;
		f[1]=p[1];
		for( i=2;i<=n;i++){
			max=p[i];
			for(k=1;k<i;k++)
				if(f[i-k]+p[k]>max)
					max=f[i-k]+p[k];
			f[i]=max;
			}
		return f[n]	;
		}
	
}
