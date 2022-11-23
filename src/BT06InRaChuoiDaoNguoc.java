/* Mục đích: Java20 - Nộp bài tập 6: Nhập 1 chuỗi và in ra chuỗi đó theo thứ tự ngược lại
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 21/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT06InRaChuoiDaoNguoc {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Nhập 1 chuỗi bất kỳ: ");
        String chuoiNhap = scan.nextLine();
        StringBuilder chuoiNguoc = new StringBuilder();
        /*
        char[] ch = chuoiNhap.toCharArray();
        for(int i=0;i<chuoiNhap.length();i++){
            chuoiNguoc += String.valueOf(ch[chuoiNhap.length()-1-i]);
        }
        System.out.println("Chuỗi ngược sau khi đảo là "+chuoiNguoc);
        */
        chuoiNguoc.append(chuoiNhap);
        System.out.println("Chuỗi ngược sau khi đảo là "+chuoiNguoc.reverse());
    }
}
