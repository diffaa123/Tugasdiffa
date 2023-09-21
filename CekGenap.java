
package pkg4.cekgenap;
import java.util.Scanner;

/**
 *
 * DIFFA RAMA DAROJATUN
 * C2183207039
 * PTI B
 */
public class CekGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                
                System.out.print("Masukkan angka bulat (0 untuk keluar): ");
                int angka = input.nextInt();
                
                
                if (angka == 0) {
                    System.out.println("Program sudah berakhir. Sampai jumpa!");
                    break; // Keluar dari loop
                }
                
                
                if (angka % 2 == 0) {
                    System.out.println("Angka genap");
                } else {
                    System.out.println("Angka ganjil");
                }
            }
        }
    }
    
}