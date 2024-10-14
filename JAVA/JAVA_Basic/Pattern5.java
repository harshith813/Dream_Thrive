class Pattern5
{
	public static void main(String args[])
	{
		int h=6;
		for (int i=0;i<h;i++)
		{
			for(int j=0;j<h-i-1;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<=i*2;k++)
			{
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}
}
