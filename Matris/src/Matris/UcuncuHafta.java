package Matris;

import java.util.Scanner;

public class UcuncuHafta {

    public static void main(String[] args) {
        
    Scanner scnr = new Scanner(System.in);
    System.out.print("Satır sayısını giriniz: ");
    int row1 = scnr.nextInt();
    System.out.print("Sütün sayısını giriniz: ");
    int column1 = scnr.nextInt();
    System.out.println();
    System.out.println("Birinic matris'in elemanlarını giriniz");
    Matris first = new Matris(row1, column1);
    first.read();

    System.out.print("Satır Sayısını Giriniz: ");
    int row2 = scnr.nextInt();
    System.out.print("Sütün Sayısını Giriniz: ");
    int column2 = scnr.nextInt();
    System.out.println();
    System.out.println("İkinci matris'in elemanlarını giriniz");
    Matris second = new Matris(row2, column2);
    second.read();

    Matris product = first.multiply(second);
    System.out.println("Sonuç: ");
    product.print();




    }
    
}
