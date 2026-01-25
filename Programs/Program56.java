class Program56
{
	public static void main(String[] args)
	{	
		int n = 5;
		int count = (n*(n+1))/2;
		for(int i = 1 ; i<=n ; i++)
		{
			for(int j = i; j>=1; j--)
			{
				System.out.print(count++ + "\t"); 			}
			count = count - ((2*i)+1);
 			System.out.println();
		}
	}
}

/*

15
13      14
10      11      12
6       7       8       9
1       2       3       4       5

*/




