#include <stdio.h>
int main()
{
    int n1,n2, i;
    scanf("%d",&n1);
    scanf("%d",&n2);
    if(n1<=10000&&n2<=10000){

    for(i=n1; i<=n2; i++)
    {
    
        if(i%2==0)
        {
            
            printf("%d\n",i);
            
        }
    }
    }

    
    return 0;
}
