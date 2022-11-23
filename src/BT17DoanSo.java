/* Mục đích: Java20 - Nộp bài tập 17: Đoán số trúng với kết quả của máy
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 23/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT17DoanSo {
    final static int MAX = 1000;
    final static int MIN = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soNgauNhien = MIN + (int)(Math.random()*(MAX - MIN + 1));
        int soChon;
        do{
            System.out.print("Số dự đoán: ");
            soChon = Integer.parseInt(scan.nextLine());
            if(soChon>soNgauNhien) System.out.println("Chọn số nhỏ hơn");
            else if(soChon<soNgauNhien) System.out.println("Chọn số lớn hơn");
        } while(soChon!=soNgauNhien);

        System.out.println("Bạn đã đoán đúng! Kết quả là " + soNgauNhien);
    }
}
