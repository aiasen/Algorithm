#include <algorithm>
using namespace std;

int main()
{
	int n = 1, sum = 0;
	int a[505];
	char c[505];
	while(scanf("%d",&n) && n)
	{
		for(int i=0; i<n; i++)
		{
			scanf("%s%d",&c[i],&a[i]);
		}
		sort(a,a+n);
		int	j = 0;
		sum=0;
		while(j<n-1)
		{
		sum+= a[j]+a[j+1];
		a[j+1] = a[j]+a[j+1];
		j++;
		sort(a+j,a+n);
		}
