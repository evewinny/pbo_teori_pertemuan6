import java.util.Scanner;

class lingkaran {
	int r;
	
	void cetakluas(){
	System.out.println("Luas Lingkaran: "+(3.14*r*r));
	}
}

class kubus {
	double sisi;
	double volume;
	
	void cetakvolum() {
		volume = sisi*sisi*sisi;
		System.out.println("Volume kubus= "+volume);
	}
}

	class bentuk {
	public static void main(String[] args) {
		double volume;
		Scanner input = new Scanner(System.in);
		lingkaran l=new lingkaran();
		System.out.print("Masukkan nilai jari-jari lingkaran: ");
		l.r=input.nextInt();
		l.cetakluas();
		
		System.out.println();
		
		kubus k=new kubus();
		System.out.print("Masukkan nilai sisi kubus: ");
		k.sisi=input.nextInt();
		k.cetakvolum();
		} 
	}