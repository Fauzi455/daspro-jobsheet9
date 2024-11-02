import java.util.Scanner;
    public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.print("Masukkan Jumlah Pesanan: ");
int jumlah = sc.nextInt();
sc. nextLine();   

String [] nama = new String[jumlah];
int [] harga = new int[jumlah];
int total = 0;

    for(int i = 0; i < jumlah; i++){
        System.out.print("Masukkan Nama Makanan/Minuman ke-" + (i+1) + " : ");
        nama[i] = sc.nextLine();

        System.out.print("Masukkan Harga " + nama[i] + " : ");
        harga[i] = sc.nextInt();
        sc.nextLine();
        total+=harga[i];
        }


        System.out.println("--------------DAFTAR PESANAN---------------");
        for(int i = 0; i < jumlah; i++){
            System.out.println((i+1) + ". Nama Pesanan " + nama[i] + " harga " + harga[i]);
        }
        System.out.println("-------------------------------------------");
        System.out.println("Total yang Harus Dibayar Rp." + total);
        System.out.println();
    }
}
