
public class luyenCode {
	public static void main(String[] args) {
		
		int[] mangSo = {32, 56, 6, 8,1, 3, 5};
		int[] mangSo1 = {35, 100, 32 , 4 ,6 , 7, 8};
		
		timSoLonNhat(mangSo);
		timSoLonNhat(mangSo1);
			
	}
	
	public static void timSoLonNhat(int[] mangSo)
	{
		int max = mangSo[0];
		int viTri = 0;
		
		for (int i = 0; i < mangSo.length; i++)
		{
			if (max < mangSo[i])
			{
				max = mangSo[i];
				viTri = i;
			}
		}
		System.out.println("max " + max + " -- vi tri " + viTri);
	}

}
