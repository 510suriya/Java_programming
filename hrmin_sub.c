#include<stdio.h>
void main()
{
	int h1,h2,m1,m2,hr,min,t1,t2;
	unsigned int ans;
	scanf("%d %d",&h1,&m1);
	scanf("%d %d",&h2,&m2);
	t1=(h1*60)+m1;
	t2=(h2*60)+m2;
	ans=t1-t2;
	
	hr=ans/60;
	min=ans%60;
	printf("%d %d",hr,min);
}
