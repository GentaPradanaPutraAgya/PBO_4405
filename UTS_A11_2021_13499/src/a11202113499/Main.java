package a11202113499;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MahasiswaBaru> mahasiswaBaru = new ArrayList<>();
        ArrayList<MahasiswaTransfer> mahasiswaTransfer = new ArrayList<>();
        ArrayList<MahasiswaLulus> mahasiswaLulus = new ArrayList<>();
        ArrayList<MahasiswaAktif> mahasiswaAktif = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        int pilihan;
        
        do {
        	System.out.println("Daftar Menu:");
            System.out.println("1. Input Mahasiswa Baru");
            System.out.println("2. Input Mahasiswa Transfer");
            System.out.println("3. Input Mahasiswa Lulus");
            System.out.println("4. Input Mahasiswa Aktif");
            System.out.println("5. Keluar");
            
            System.out.print("Masukkan Pilihan: ");
            pilihan = scanner.nextInt();
            	
            switch (pilihan) {
            case 1:
            	 System.out.print("Masukkan jumlah mahasiswa: ");
                 int n2 = scanner.nextInt();

                 for (int i = 0; i < n2; i++) {
                     System.out.println("Data mahasiswa ke-" + (i+1) + ":");
                     System.out.println("Nama: ");
                     String nama = scanner.next();
                     System.out.println("NIM: ");
                     String nim = scanner.next();
                     System.out.println("Semester: ");
                     int semester = scanner.nextInt();
                     System.out.println("Usia: ");
                     int usia = scanner.nextInt();
                     System.out.print("Asal Sekolah: ");
                     String asalSekolah = scanner.next();
                     System.out.println("\n");
                     
                     System.out.println("Masukkan Jumlah KRS: ");
                     int m = scanner.nextInt();
                     
                     String[] krs = new String[m];
                     for (int j = 0; j < m; j++) {
                     	System.out.println("Masukkan Nama Matkul ke - "+(j+1)+": ");
                     	krs[j] = scanner.next();
                     }
                     
                     MahasiswaBaru mhsBaru = new MahasiswaBaru(nim, nama, semester, usia, krs, asalSekolah);
                     
                     mahasiswaBaru.add(mhsBaru);
                     
                 }
                 
                 System.out.println("\nDaftar Mahasiswa Baru:");
                 for (MahasiswaBaru mhsBaru : mahasiswaBaru) {
                     System.out.println("Info Mahasiswa");
                     mhsBaru.infoMahasiswa();
                     System.out.println("\nKeikutsertaan Ospek: "+mhsBaru.ikutOspek());
                     System.out.println("\nInfo KRS");
                     mhsBaru.infoKrsMahasiwa();
                     System.out.println("\n");
                 }
                 
                break;
            case 2:
            	 System.out.print("Masukkan jumlah mahasiswa: ");
                 int n3 = scanner.nextInt();

                 for (int i = 0; i < n3; i++) {
                     System.out.println("Data mahasiswa ke-" + (i+1) + ":");
                     System.out.println("Nama: ");
                     String nama = scanner.next();
                     System.out.println("NIM: ");
                     String nim = scanner.next();
                     System.out.println("Semester: ");
                     int semester = scanner.nextInt();
                     System.out.println("Usia: ");
                     int usia = scanner.nextInt();
                     System.out.print("Asal Sekolah: ");
                     String asalSekolah = scanner.next();
                     System.out.println("Asal Universitas: ");
                     String asalUniversitas = scanner.next();
                     System.out.println("\n");
                     
                     System.out.println("Masukkan Jumlah KRS: ");
                     int m = scanner.nextInt();
                     
                     String[] krs = new String[m];
                     for (int j = 0; j < m; j++) {
                     	System.out.println("Masukkan Nama Matkul ke - "+(j+1)+": ");
                     	krs[j] = scanner.next();
                     }
                     
                     MahasiswaTransfer mhsTransfer = new MahasiswaTransfer(nim, nama, semester, usia, krs, asalSekolah, asalUniversitas);
                     
                     mahasiswaTransfer.add(mhsTransfer);
                 }
                 
                 System.out.println("\nDaftar Mahasiswa Transfer:");
                 for (MahasiswaTransfer mhsTransfer : mahasiswaTransfer) {
                     System.out.println("Info Mahasiswa");
                     mhsTransfer.infoMahasiswa();
                     System.out.println("\nKeikutsertaan Ospek: "+mhsTransfer.ikutOspek());
                     System.out.println("\nInfo KRS");
                     mhsTransfer.infoKrsMahasiwa();
                     System.out.println("\n");
                 }
                 
                break;
            case 3:
            	System.out.print("Masukkan jumlah mahasiswa: ");
                int n4 = scanner.nextInt();

                for (int i = 0; i < n4; i++) {
                    System.out.println("Data mahasiswa ke-" + (i+1) + ":");
                    System.out.println("Nama: ");
                    String nama = scanner.next();
                    System.out.println("NIM: ");
                    String nim = scanner.next();
                    System.out.println("Semester: ");
                    int semester = scanner.nextInt();
                    System.out.println("Usia: ");
                    int usia = scanner.nextInt();
                    System.out.println("Tahun Wisuda: ");
                    int tahunWisuda = scanner.nextInt();
                  	System.out.println("IPK: ");
                  	float ipk = scanner.nextFloat();
                  	System.out.println("\n");
                  	
                  	System.out.println("Masukkan Jumlah KRS: ");
                    int m = scanner.nextInt();
                  	
                  	String[] krs = new String[m];
                    for (int j = 0; j < m; j++) {
                    	System.out.println("Masukkan Nama Matkul ke - "+(j+1)+": ");
                    	krs[j] = scanner.next();
                    }
                  	
                  	MahasiswaLulus mhsLulus = new MahasiswaLulus(nim, nama, semester, usia, krs, tahunWisuda, ipk);
                    
                    mahasiswaLulus.add(mhsLulus);   	
                }
                
                System.out.println("\nDaftar Mahasiswa Lulus:");
                for (MahasiswaLulus mhsLulus : mahasiswaLulus) {
                    System.out.println("Info Mahasiswa");
                    mhsLulus.infoMahasiswa();
                    System.out.println("\nKeikutsertaan Wisuda: "+mhsLulus.ikutWisuda());
                    System.out.println("\nInfo KRS");
                    mhsLulus.infoKrsMahasiwa();
                    System.out.println("\n");
                }
            	break;
            case 4:
            	// meminta input dari user
                float value;
                int[] nilai;
                	System.out.println("Nama: ");
                	String nama = scanner.next();
                    System.out.println("NIM: ");
                    String nim = scanner.next();
                    System.out.println("Semester: ");
                    int semester = scanner.nextInt();
                    System.out.println("Usia: ");
                    int usia = scanner.nextInt();
                    System.out.println("\n");
                    
                    System.out.println("Masukkan Jumlah KRS: ");
                    int m = scanner.nextInt();
                    
                    String[] krs = new String[m];
                    for (int j = 0; j < m; j++) {
                    	System.out.println("Masukkan Nama Matkul ke - "+(j+1)+": ");
                    	krs[j] = scanner.next();
                    }
                    
                    nilai = new int[m];

                    // Menginput nilai pada array menggunakan loop for
                    for (int k = 0; k < m; k++) {
                        System.out.print("Masukkan nilai ke-" + (k+1) + ": ");
                        nilai[k] = scanner.nextInt();
                    }
                    
                    // membuat objek mahasiswa
                    MahasiswaAktif mhsAktif = new MahasiswaAktif(nim, nama, semester, usia, krs);
                    
                    value = mhsAktif.hitungRataNilai(nilai);
                    
                    // menambahkan objek mahasiswa ke dalam ArrayList
                    mahasiswaAktif.add(mhsAktif);
                
                
             // menampilkan data mahasiswa
                for (MahasiswaAktif mhsAkt : mahasiswaAktif) {
                System.out.println("\nDaftar Mahasiswa:");
                    System.out.println("Info Mahasiswa");
                    mhsAkt.infoMahasiswa();
                    System.out.println("\nInfo KRS");
                    mhsAkt.infoKrsMahasiwa();
                    System.out.println("Rata - rata Nilai: "+value);
                    System.out.println("\n");
                }
            	break;
            case 5:
            	System.out.println("Anda keluar dari sitem");
            	break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
            }
        } while (pilihan != 5);
    }
}
