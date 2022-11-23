/* Mục đích: Java20 - Nộp bài tập 8: In ra chuỗi nhập với các ký tự đầu tiên được in hoa
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 21/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT08InHoaChuDauCuaChu {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Nhập 1 chuỗi viết thường: ");
        String chuoiNhap = scan.nextLine();

        String[] chuoiTam = chuoiNhap.split(" ");
        String chuoiXuat = "";
        for(int i=0;i<chuoiTam.length;i++){
            chuoiXuat += chuoiTam[i].substring(0,1).toUpperCase()+chuoiTam[i].substring(1)+" ";
        }

        System.out.println("Chuỗi sau khi xử lý là: "+chuoiXuat);
    }
}
