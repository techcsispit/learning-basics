#include<stdio.h>
void
fact (int num)
{
  int k = 1;

  if (num > -1)
    {
      for (int n = 1; n <= num; n++)
	{
	  k = k * (n);

	}
      printf ("factorial is %d \n", k);
    }
  else
    printf ("error");
}
int
main ()
{
  int num;
  printf ("Enter number for factorial \n");
  scanf ("%d", &num);
 
	if(!scanf("%d",&num)){
		printf("error\n");
		return 1;
	}
	 fact (num);
 return 0;
}
