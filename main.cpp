#include <iostream>
#include <stdio.h>
using namespace std;
int n;
int ab(int x){
    return x>0 ? x :-x;
}
int sum1(int buf[],int x){
    int ans1=0;
    for(int i=0;i<x;i++){
        ans1+=buf[i];
    }
    return ans1;
}
int sum2(int buf[],int x){
    int ans2=0;
    for(int i=x;i<n;i++){
        ans2+=buf[i];
    }
    return ans2;
}
int main()
{
    while(scanf("%d",&n)!=EOF){
    int buf[20];              //用来保存输入的数字；
    int ans[20],anssize=0;    //把俩俩集合比较的数字保存起来；
    for(int i=0;i<n;i++){
        int x;
        scanf("%d",&x);
        buf[i]=x;
    }
//    for(int i=0;i<n;i++){
//        printf("%d",buf[i]);
//    }
    int i=0;
    while(i!=n){
        int a=sum1(buf,i);
        int b=sum2(buf,i);
        ans[anssize++]=ab(a-b);
       i++;
    }
    int mins=0;
    for(int i=0;i<anssize;i++){
        if(ans[mins]>ans[i]){
           mins=i;
        }
    }
    printf("%d",ans[mins]);
}
    return 0;
}
