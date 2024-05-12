/**
*
* @author Furkan KAMACI kamacif@itu.edu.tr
* @since 12.05.2024
* <p>
* Açıklama
* </p>
*/

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Seçim yapınız: ");
            System.out.println("1. Rastgele Kişi Üret: ");
            System.out.println("2. Çıkış");

            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Bir sayı giriniz:");
                int number = scanner.nextInt();
                System.out.println("Girdiğiniz sayı: " + number);
                
                System.out.println("********");
                for(int i = 0;i<number;i++) {
                	System.out.println(new RastgeleKisi());	
                }
                System.out.println("********");
                
            } else if (choice == 2) {
                System.out.println("Programdan çıkılıyor...");
                break;
            } else {
                System.out.println("Geçersiz bir değer bir daha deneyiniz..");
            }
        }

        scanner.close();
    }
}