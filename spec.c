#include <stdio.h>
 
int main()
{
    char    str[100];
    int count1,count2,count3,count4;
    int counter;
    count1=count2=count3=count4=0;
 
    printf("Enter a string: ");
    gets(str);
 
    for(counter=0;str[counter]!=NULL;counter++)
    {
 
        if(str[counter]>='0' && str[counter]<='9')
            count1++;
        else if((str[counter]>='A' && str[counter]<='Z')||(str[counter]>='a' && str[counter]<='z'))
            count2++;
        else if(str[counter]==' ')
            count3++;
        else
            count4++;
    }
 
    printf("%d",count4);
 
    return 0;
}
