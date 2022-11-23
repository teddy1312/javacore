/* Mục đích: Java20 - Nộp bài tập 7: Nhập 1 số tự nhiên và in ra ước số của số đó
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 21/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT07InRaUocSoSoTuNhien {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soNhap;
        do {
            System.out.print("Nhập số tự nhiên: ");
            soNhap = Integer.parseInt(scan.nextLine());
            if(soNhap<1) System.out.println("Số nhập phải dương. Vui lòng nhập lại");
        } while(soNhap<1);

        int count = 1;
        String chuoiUocSo = "";
        while (count <= soNhap){
            if(soNhap%count == 0){
                chuoiUocSo += String.valueOf(count)+",";
            }
            count++;
        }
        System.out.println("Ước số của "+soNhap+" là: "+chuoiUocSo);
    }
}
