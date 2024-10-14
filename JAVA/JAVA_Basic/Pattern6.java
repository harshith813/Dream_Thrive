class Pattern6
{
	public static void main(String args[])
	{
		int h=6;
		for (int i=h;i>=1;i--)
		{
			for(int j=1;j<=h-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}
}
