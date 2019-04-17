
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/
/**
*
* @author user
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class belajar {
public static void main(String[] args) {
// TODO code application logic here
BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
int data =0;
String[] nama    = new String[30];
String[] alamat  = new String[50];
String[] jumlahanak = new String[10];
 
System.out.println("SENSUS KEPENDUDUKAN");
System.out.println("+===============INPUTAN============================+");
try{
    System.out.println("Data Penduduk = ");
    data = Integer.parseInt(input.readLine());
    for (int a=1;a<=data;a++){
         System.out.println("------Data ke-"+ a +"------");
         System.out.println("Input Nama KK        = ");
            nama[a] = input.readLine();
         System.out.println("Input Alamat    = ");
            alamat[a] = input.readLine();
         System.out.println("Input Jumlah Anak    = ");
            jumlahanak[a] = input.readLine();
            
      System.out.println("Data Wilayah = ");      
    System.out.println ("Desa	: Simpang Rusa");
	System.out.println ("Kecamatan	: Membalong");
	System.out.println ("Kabupaten	: Belitung Induk");
     }
} catch (IOException e ){
  System.out.println("Error");
}
 
System.out.println("+==============HASIL SURVEY SENSUS PENDUDUK========================+");
System.out.println("Banyak data : " + data);
for (int a=1; a<=data;a++){
	System.out.println ("Desa	: Simpang Rusa");
	System.out.println ("Kecamatan	: Membalong");
	System.out.println ("Kabupaten	: Belitung Induk");
	
    System.out.println("Data Penduduk ke- " + a);
    System.out.println("Nama     : "+ nama[a]);
    System.out.println("Alamat    : "+ alamat[a]);
    System.out.println("Jumlah Anak  : "+ jumlahanak[a]);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}
}
}