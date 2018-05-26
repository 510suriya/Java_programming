#include<stdio.h>
void main()
{
char str[100];
int len;
gets(str);
len = strlen(str);
printf("\n%d " , len );
getch();
}
