import java.util.Scanner;
    public class Percobaan3Pertanyaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

double lulus = 0, tidakLulus = 0;
double lulus1 = 0, tidakLulus1 = 0, rata1, rata2;

System.out.print("Masukkan Jumlah Mahasiswa: ");
int jumlah = sc.nextInt();

int [] nilaiMhs = new int[jumlah];
for(int i = 0; i < nilaiMhs.length; i++){
    System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
    nilaiMhs[i] = sc.nextInt();
        if (nilaiMhs[i] > 70) {
        lulus+=nilaiMhs[i];
        lulus1++;    
        }
        if (nilaiMhs[i] < 70) {
        tidakLulus+=nilaiMhs[i]; 
        tidakLulus1++;
        }
    }
    rata1 = lulus/lulus1;
    rata2 = tidakLulus/tidakLulus1;
    System.out.println("Rata-rata nilai lulus = " + rata1);
    System.out.println("Rata-rata nilai tidak lulus = " + rata2);
    }
}
