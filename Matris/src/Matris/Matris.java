package Matris;

import java.util.Scanner;

public class Matris extends Islem {

    private int satir;
    private int sutun;
    private int[][] veri;

    public Matris(int satir, int sutun) {
        this.satir = satir;
        this.sutun = sutun;
        veri = new int[satir][sutun];
    }

    public Matris(int[][] veri) {
        this.veri = veri;
        this.satir = veri.length;
        this.sutun = veri[0].length;
    }

    public int getSatir() {
        return satir;
    }

    public void setSatir(int satir) {
        this.satir = satir;
    }

    public int getSutun() {
        return sutun;
    }

    public void setSutun(int sutun) {
        this.sutun = sutun;
    }

    @Override
    public int toplama() {
        return 0;
    }

    
    public int carpma() {
        return 0;
    }

    public void read() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                veri[i][j] = scan.nextInt();
            }
        }

    }
    
    public Matris multiply(Matris other) {
    if (this.sutun != other.satir) {
      throw new IllegalArgumentException("satır ve sütün sayıları eşit değil!");
    }
    
     int[][] product = new int[this.satir][other.sutun];
    int sum = 0;
    for (int i = 0; i < this.satir; i++) {
      for (int j = 0; j < other.sutun; j++) {
        for (int k = 0; k < other.satir; k++) {
          sum = sum + veri[i][k] * other.veri[k][j];
        }
        product[i][j] = sum;
      }
    }
    return new Matris(product);
  }

    public void print() {
    for (int i = 0; i < satir; i++) {
      for (int j = 0; j < sutun; j++) {
        System.out.print(veri[i][j] + " ");
      }
      System.out.println();
    }
  }

}
