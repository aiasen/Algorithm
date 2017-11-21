package mergeSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class MergeSORT {
	static long count = 0;
    public static void mergeSort(int []input,int left,int right){
        //分治
    	int mid = (left + right) / 2;  
        if (left < right) {  
            // 左边  
        	
            mergeSort(input,left,mid);  
            // 右边  
            
            mergeSort(input,mid+1,right);  
            // 左右归并  
            
            merge(input,left,mid,right);  
            }  
        }
    /**
     * 二路归并
     * input
     * left左数组的第一个元素的索引
     * center左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
     * right右数组最后一个元素的索引
     */
    public static void merge(int[]input,int left,int center,int right){
    	int []tempArray = new int[right-left+1];
        int mid = center+1;
        int temp = left;
        int current = 0;
        while(left<=center && mid<=right){
            if(input[left]>input[mid]){
                tempArray[current++]=input[mid++];
                /*
                 * 如果input[left]>input[mid]，那么表明下标为left~center的值都会比input[mid]大;
                 * (5,7,8)(4,9)合并为 3+0+0+0
                 * */               
                count+=center-left+1;
            }else{
                tempArray[current++]=input[left++];
            }
        }
        //只会执行一个
        while(left<=center){
            tempArray[current++]=input[left++];
        }
        while(mid<=right){
            tempArray[current++]=input[mid++];
        }
        current=0;
        while(temp<=right){
            input[temp++]=tempArray[current++];
        }
    }
    public static void main(String[] args) throws IOException {
        StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        while(cin.nextToken()!=cin.TT_EOF){
            int n = (int)cin.nval;
            int []input = new int[n];
            for(int i=0;i<n;i++){
                cin.nextToken();
                input[i] = (int)cin.nval;
            }
            count=0;
            mergeSort(input,0,input.length-1);
            System.out.println(count);
        }
    }
}
