public class Test
{
  public static void main (String[]args)
  {
    int r ,c, n=1;
    for (r = 1; r <= 5; r++)
      {
	for (c = 1; c <=r; c++)
	  {
	    System.out.print (n+" ");
	    n++;
	  }
	System.out.println ("");
	int k=1;
	System.out.print (k+" ");
	k++;
      }
  }
}
