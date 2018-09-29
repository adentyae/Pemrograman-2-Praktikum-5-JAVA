import java.io.*;
public class CaseLogin{
	public static void main(String[] args) throws IOException {
		BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));

		String id_user, password;
		boolean status=true;

		do{
			System.out.print("Masukkan ID.User : ");
			id_user = dataInput.readLine();

			System.out.print("Masukkan password : ");
			password = dataInput.readLine();

			if (!id_user.equals("171530003")) {
				System.out.println("ID. User Yang Anda Masukkan Salah");
			}else {
				if (!password.equals("mahasiswa123")) {
					System.out.println("password yang anda masukkan salah");
				}else {
					status = false;
				}
			}
		}while(status);

		System.out.println("Selamat Datang " + id_user);
	}
}