#include<stdio.h>
int main()
{
 char letter1, letter2;
 printf("please input the first letter of someday\n");
 while ((letter1 = getchar()) != 'Y')
 {
  switch (letter1)
  {
   case 'S': 
    fflush(stdin);
    printf("please input second letter\n"); 
    if ((letter2 = getchar()) == 'a')
    printf("Saturday\n");
    else
      if (letter2 == 'u')
        printf("Sunday\n");
      else printf("data error\n");
   break;
   case 'F':
    printf("Friday\n");
   break;
   case 'M':
   printf("Monday\n");
    break;
   case 'T':
   fflush(stdin);
   printf("please input second letter\n");
   if ((letter2 = getchar()) == 'u')
    printf("Tuesday\n");
    else if (letter2 == 'h')
    printf("Thursday\n");
    else printf("data error\n");
   break;
   case 'W':
   printf("Wednesday\n");
    break;
   default:
   printf("data error\n");
    break;
  }
  fflush(stdin);
 }
 return 0;
} 