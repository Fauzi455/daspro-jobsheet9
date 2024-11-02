import java.util.Scanner;    
    public class Percobaan4Pertanyaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int key = 0, hasil = 0;

System.out.print("Masukkan Banyaknya Nilai yang Akan Diinput: ");
int banyak = sc.nextInt();
        
int [] nilaiMhs = new int[banyak];
    for(int i = 0; i < nilaiMhs.length; i++){
    System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
    nilaiMhs[i] = sc.nextInt();
}
System.out.print("Masukkan Nilai Yang Ingin Dicari: ");
key = sc.nextInt();
    for(int i= 0; i < nilaiMhs.length; i++){
    if(key == nilaiMhs[i]){
        hasil = i;
        break;
    }
}
System.out.println("Nilai " + key + " ditemukan, merupakan nilai mahasiswa ke-" + (hasil+1));
sc.close();
    }
    }

