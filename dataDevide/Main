package suanfa;

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in );
        int n;
        int [] a = new int [20];
        int m;
        int code;
        int k;
        int sum1, sum2;
        int i, j;
        int bit, diff,min;
        System.out.println("输入数据:");
        n = sc.nextInt();
        while( n>0 ) {
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            m = 1 << n;
            min = Integer.MAX_VALUE;
            for (code = 0; code < m; code++) //解码
            {
                k = code;
                sum1 = sum2 = 0;
                for (j = 0; j < n; j++) {
                    bit = k & 1;
                    
                    //code&1 011111101&00000001
                    
                    if (bit == 1)
                        sum1 += a[j];
                    else
                        sum2 += a[j];
                    k >>= 1;
                }
                diff = Math.abs(sum1 - sum2);//两组数差异最小；
                if (diff < min) {
                    min = diff;
                }
            }
            System.out.println("\t");
            System.out.println(min);
            n = sc.nextInt();
        }
   }


}
