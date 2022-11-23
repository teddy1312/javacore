/* Mục đích: Java20 - Nộp bài tập 10: Tính tổng số nguyên tố từ 1 đến n - số tự nhiên nhập vào
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 21/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT10TinhTongSoNguyenTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soNhap;
        do {
            System.out.print("Nhập số tự nhiên: ");
            soNhap = Integer.parseInt(scan.nextLine());
            if(soNhap<1) System.out.println("Số nhập phải dương. Vui lòng nhập lại");
        } while(soNhap<1);

        int tong = 0;
        for(int i=1;i<=soNhap;i++){
            if(kiemTraSNT(i))  tong+=i;
        }

        System.out.println("Tổng các số nguyên tố từ 1 đến "+soNhap+" là: "+tong);
    }

    private static boolean kiemTraSNT(int so){
        if(so == 1)  return false;
        int count = 2;
        while (so>count){
            if(so%count == 0)   return false;
            else                count++;
        }
        return true;
    }
}
