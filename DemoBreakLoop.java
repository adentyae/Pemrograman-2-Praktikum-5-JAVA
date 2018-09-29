public class DemoBreakLoop{
	public static void main(String[] args) {
		int i = 1;

		do{
			System.out.println("Iterasi ke " + i);
			i++;
			if (i>10 || i==5) break;
		}while(true);
	}
}