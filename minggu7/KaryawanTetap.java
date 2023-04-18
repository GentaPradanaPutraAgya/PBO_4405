import java.util.Scanner;

public class KaryawanTetap extends Karyawan{
    int GajiTetap;
    int Total;

    public void GajiTetap(){
        Scanner inputan = new Scanner(System.in);
        System.out.print("Inputkan Gaji Tetap : ");
        this.GajiTetap = inputan.nextInt();
        tunjanganAnak();
        Total = (GajiTetap+tunjangan);
    }

    public void cetak(){
        System.out.println("---CETAK---");
        System.out.println("Pendapatan Gaji Tetap : "+GajiTetap);
        System.out.println("Pendapatan Gaji Total : "+Total);
        System.out.println("");
    }
}