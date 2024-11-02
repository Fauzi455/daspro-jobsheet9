import java.util.Scanner;
    public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

double total = 0;
double rata2;

System.out.print("Masukkan Jumlah Mahasiswa yang Diinput :");
int input = sc.nextInt();

int [] nilaiMhs = new int[input];
for(int i = 0; i < input; i++){
    System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
    nilaiMhs[i] = sc.nextInt();
    total+=nilaiMhs[i];
}
rata2 = total/nilaiMhs.length;

int nilaiTertinggi = nilaiMhs[0];
int nilaiTerendah = nilaiMhs[0];
for(int i = 1; i < input; i++){
    if(nilaiMhs[i] > nilaiTertinggi){
        nilaiTertinggi=nilaiMhs[i];
    }
    if(nilaiMhs[i] < nilaiTerendah){
        nilaiTerendah=nilaiMhs[i];
    }
}
System.out.println("-------------------------------------");
for(int i = 0; i < input; i++){
    System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah " + nilaiMhs[i]);
}
System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
System.out.println("Nilai Terendah: " + nilaiTerendah);
System.out.println("Rata-rata Nilai Mahasiswa: " + rata2);
    } 
}
