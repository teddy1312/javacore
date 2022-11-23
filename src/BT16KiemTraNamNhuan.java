/* Mục đích: Java20 - Nộp bài tập 16: Kiểm tra năm nhập có phải là năm nhuận hay không
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 23/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT16KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nhap;
        do{
            System.out.print("Nhấn 1 để tiếp tục, 2 để thoát: ");
            nhap = Integer.parseInt(scan.nextLine());
            if(nhap == 1) {
                System.out.print("Nhập năm: ");
                int nam = Integer.parseInt(scan.nextLine());
                if (kiemTraNamNhuan(nam)) {
                    System.out.println("Năm " + nam + " là năm nhuận");
                } else {
                    System.out.println("Năm " + nam + " không phải năm nhuận");
                }
            }
        } while(nhap!=2);

    }

    private static boolean kiemTraNamNhuan(int nam){
        if(nam % 400 == 0) {
            return true;
        } else if(nam % 4 == 0 && nam % 100 != 0){
            return true;
        } else{
            return false;
        }
    }
}
