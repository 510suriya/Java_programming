 #include <stdio.h>

int main()
{
    int n,i,p,r=1;

    printf("enter the n");
    scanf("%d",&n);
    printf("enter the power");
    scanf("%d",&p);
    for(i=1;i<=p;i++)
    {
        r=n*r;
        
        
    }
    printf("%d",r);
    

    return 0;
}
