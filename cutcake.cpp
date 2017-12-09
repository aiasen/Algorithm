#include <iostream>
using namespace std;

void cutcake(const int *p,int n,int *r,int *s)
{
    r[0]=0;
	for(int i=1;i<=n;i++)
	{
		int q=-1;
		for(int j=1;j<=i;j++)
		{
			int tmp=p[j-1]+r[i-j];
			if(q<tmp)
			{
				q=tmp;
				s[i]=j;
			}
		}
		r[i]=q;
	}
	cout << r[n] << endl;
}


int main()
{
	int n;
	while(cin >> n && n!=0)
	{
		int *p = new int[n];
		for(int i=0;i<n;i++)
		{
			cin >> p[i];
		}
		int *r = new int[n+1];
		int *s = new int[n+1];

		cutcake(p,n,r,s);
	}
	return 0;
}
