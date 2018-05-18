#include <stdio.h>

int main()
{
    int n,k,a[20],sum=0;
    printf ("Enter the n");
    scanf("%d",&n);
    printf ("Enter the k");
    scanf("%d",&k);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }    
    for(int j=0;j<k;j++)
    {
         sum=sum+a[j];
    }     
    printf("sum is %d",sum);
    return 0;
}
