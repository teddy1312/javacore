/* Mục đích: Java20 - Nộp bài tập 9: Kiểm tra 2 số nhập vào có chữ số nào trùng nhay hay không
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 21/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT09KiemTraChuSoTrungNhau {
    final static byte UPPER_LIMIT = 99;
    final static byte LOWER_LIMIT = 10;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte so1,so2;
        boolean flag = true;
        do{
            System.out.print("Nhập số nguyên dương thứ 1 (10~99): ");
            so1 = Byte.parseByte(scan.nextLine());
            System.out.print("Nhập số nguyên dương thứ 2 (10~99): ");
            so2 = Byte.parseByte(scan.nextLine());
            if(so1<LOWER_LIMIT ||  so1>UPPER_LIMIT || so2<LOWER_LIMIT || so2>UPPER_LIMIT){
                System.out.println("Số nhập không hợp lệ. Vui lòng nhập lại");
            } else{
                flag = false;
            }
        } while(flag);

        if((so1/10 == so2/10) || (so1%10  == so2/10) || (so1/10  == so2%10) || (so1%10  == so2%10)){
            System.out.println("TRUE");
        } else{
            System.out.println("FALSE");
        }
    }
}
