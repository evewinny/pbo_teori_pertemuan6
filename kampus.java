import java.util.Scanner;

class Siswa {
	String nama;
	String jurusan;
	String nim;
	
	void cetak() {
		System.out.println("Nama saya adalah "+nama+" ,jurusan saya adalah "+jurusan+" ,dan nim saya "+nim);
	}
}

class kampus {
	public static void main(String[] args) {
		Siswa s=new Siswa();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama anda: ");
		s.nama=input.nextLine();
		System.out.print("Masukkan NIM anda: ");
		s.nim=input.nextLine();
		System.out.print("Masukkan jurusan anda: ");
		s.jurusan=input.nextLine();
		s.cetak();
	}
}