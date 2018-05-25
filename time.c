#include<stdio.h>
void main()
{
	int min,hr,ip_min;
	scanf("%d",&ip_min);
	hr=ip_min/60;
	min=ip_min%60;
	printf("%d %d",hr,min);
}
