#include<stdio.h>

   /**
  　　* 0 <= p <= q < r, subarray array[p..q] and array[q+1..r] are already sorted.
  　　* the merge() function merges the two sub-arrays into one sorted array.
    */

   __int64 count;
   __int64 a[500005];
   __int64 temp[500005];
   //防止数据溢出

void Merge(int p, int q,int r)
{
        int i,k;
        int begin1,end1,begin2,end2;
        k=p;
        begin1 = p;
        end1 = q;
        begin2 = q+1;
        end2 = r;
        while((begin1 <=end1)&&( begin2<=end2))
            {
                if(a[begin1]<=a[begin2])
                {
                    temp[k] = a[begin1];
                    begin1++;
                }
                else
                {
                    temp[k] = a[begin2];
                    begin2++;

              //count++;
              /*
              *
              *求逆序对，当array[begin1]中的数比array[begin2]中的数大时；
             *那么可以推出此数后面的数和array[begin2]这个数大;
              */
                    count += end1 - begin1+1;

                }

                k++;

            }

            while(begin1<=end1)
            {
                temp[k++]=a[begin1++];

            }

            while(begin2<=end2)
            {
                temp[k++]=a[begin2++];

            }

            for(i=p;i<=r;i++)       //把合并后的数组还原

            a[i]=temp[i];

}



  /**
  归并操作（二分法）
  */

void MergeSort(int first,int last)
{
    int mid=0;
    if(first<last)
    {
        mid=(first+last)/2;
        MergeSort(first,mid);
        MergeSort(mid+1,last);
        Merge(first,mid,last);
    }

}


int main()
{
    int i;
    int input;
    scanf("%d",&input);
    while(input!=0)
    {
        count=0;
        for(i=0;i<input;i++)
    {
        scanf("%I64d",&a[i]);
    }

    MergeSort(0,input-1);

    printf("%I64d\n",count);

    scanf("%I64d",&input);
    }

 return 1;
 }
