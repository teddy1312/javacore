/* Mục đích: Java20 - Nộp bài tập 4: In tổng các chữ số của số được nhập vào
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 21/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT04InTongCacChuSoNhap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên: ");
        int soNhap = Integer.parseInt(scan.nextLine());

        int tong = 0;
        int soTinhToan = soNhap;
        do{
            tong += Math.abs(soTinhToan)%10;
            soTinhToan/=10;
        } while(soTinhToan!=0);

        System.out.println("Tổng các chữ số của "+soNhap+" là "+tong);
    }
}
