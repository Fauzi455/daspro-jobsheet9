import java.util.Scanner;   
    public class Tugas3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
for(String i : menu){
    System.out.println(i);
}
System.out.println("-------------------------------");
System.out.print("Nama Makanan yang Ingin Dicari : ");
String nama=sc.nextLine();

boolean ada=false;
for(int i= 0; i < menu.length; i++){
    if(menu[i].equalsIgnoreCase(nama)){
    ada=true;
        }
}
if (ada) {
    System.out.println("Menu Tersebut Tersedia");
}else{
    System.out.println("Menu Tersebut Tidak Tersedia");
}
        }
}
