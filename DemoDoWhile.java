public class DemoDoWhile{
	public static void main(String[] args) {
		int x = 0;

		do{
			x++;
			System.out.println(x++);
			--x;
			
		}while (x++<10);
	}
}