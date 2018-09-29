public class ExBreakUnlabel{
	public static void main(String[] args) {
		String names[] = {"Beah","Bianca","Lance","Belle","Nico","Yza","Gem","Ethan"};
		String searchname = "Yza";
		boolean foundname = false;

		for (int i=0; i< names.length;i++ ) {
			if (names[i].equals(searchname)) {
				foundname = true;
				break;
			}
		}
		if (foundname) {
			System.out.println(searchname + " found !");
		}else {
			System.out.println(searchname + " not found!");
		}	
	}
}

/* Analisa
	1. Looping berjalan sebanyak 6 kali
	2. jika kondisi if terpenuhi maka akan menjalankan statement yang ada di dalam if sekaligus statement break
		yang akan memberhentikan proses looping 
*/