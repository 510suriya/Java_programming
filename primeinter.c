#include <stdio.h>
int main()
{
    int n1,n2,c, i;
    scanf("%d",&n1);
    scanf("%d",&n2);
    while (n1 < n2)
    {
        c= 0;

        for(i = 2; i <= n1/2; ++i)
        {
            if(n1 % i == 0)
            {
                c= 1;
                break;
            }
        }

        if (c == 0)
            printf("%d ", n1);

        ++n1;
    }

    return 0;
}
