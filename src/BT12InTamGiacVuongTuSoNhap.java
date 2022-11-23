/* Mục đích: Java20 - Nộp bài tập 12: Nhập số tự nhiên n (1~9) và in ra tam giác vuông có độ dài tương ứng
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 21/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT12InTamGiacVuongTuSoNhap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soNhap;
        do {
            System.out.print("Nhập số tự nhiên (1~9): ");
            soNhap = Integer.parseInt(scan.nextLine());
            if(soNhap<1 || soNhap>9) System.out.println("Số nhập không hợp lệ. Vui lòng nhập lại");
        } while(soNhap<1 || soNhap>9);

        String chuoi = "";
        for(int i=1;i<=soNhap;i++) {
            chuoi += String.valueOf(i);
            System.out.println(String.format("%-" + soNhap + "s", chuoi));
        }
    }
}
