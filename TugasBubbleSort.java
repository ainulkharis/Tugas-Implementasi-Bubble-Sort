/*
   Nama        : AINUL KHARIS
   NIM         : 21090090
   Kelas       : 2A
   Mata Kuliah : Algoritma dan Struktur Data 2

 */
package BubbleSort;

import java.util.Scanner;

public class TugasBubbleSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("MENGURUTKAN NAMA MENGGUNAKAN TEKNIK BUBBLE SORT");

        int jumlahData;
        System.out.print("\nMasukkan Jumlah Data : ");
        jumlahData = input.nextInt();

        String[] nama = new String[jumlahData];
        for (int a=0;a<jumlahData;a++){
            System.out.print("Nama ke-" + (a + 1) + " : ");
            nama[a] = input.next();
        }
        System.out.println();

        System.out.println("Data Sebelum di Sorting : ");
        for (int a=0;a<jumlahData;a++)
            System.out.print(nama[a]+" ");

        System.out.println();
        System.out.println("\nProses Bubble Sort");
        for (int a=0;a<nama.length;a++){
            System.out.println("Iterasi ke-" + (a + 1) + " : ");
            for (int b=0;b<nama.length-1;b++){
                if (nama[b].compareTo(nama[b+1])>0){
                    String temp = nama[b];
                    nama[b] = nama[b+1];
                    nama[b+1] = temp;
                }
                if (b<nama.length-(a+b)){
                    for (int c=0;c<nama.length;c++)
                        System.out.print(nama[c]+" ");
                    System.out.println();
                }
            }
            System.out.println(" ");
        }

        System.out.print("Data Setelah di Sorting : ");
        for (int a=0;a<nama.length;a++)
            System.out.print(nama[a]+" ");
    }
}
