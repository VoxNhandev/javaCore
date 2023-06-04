
public class baiTapVongLapFor1 {
	public static void main(String[] args) {
		
		System.out.println("So chan: ");
		for (int i = 1; i <= 100; i++)
		{
			if (i % 2 == 0) 
			{
				System.out.println(i);
			}
		}
		System.out.println("-------------");
		System.out.println("So le: ");
		for (int j = 1; j <= 100; j++)
		{
			if (j % 2 != 0)
			{
				System.out.println(j);
			}
		}
	}

}
