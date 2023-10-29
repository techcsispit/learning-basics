#include <stdio.h>
void
main ()
{
  int days;
  printf ("YMD Calculator\n=>Enter the Number of Days: ");
  scanf ("%d", &days);
  if (days < 0)
    {
      printf ("Invalid input\n");
    }
  if (!scanf ("%d", &days))
    {
      printf ("Invalid input.\n");
      return;
    }
  printf ("Assuming a year is 365 days and a month is 30 days...\n");
  int years = days / 365;
  days = days % 365;
  int month = days / 30;
  days = days % 30;
  printf ("%d Years, %d Months, %d Days\n", years, month, days);
}

