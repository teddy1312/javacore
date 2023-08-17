/* Mục đích: Java20 - Nộp bài tập 2: Chuyển đổi số từ hệ cơ số 10 sang hệ nhị phân và ngược lại
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 20/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT02ChuyenDoHeCoSo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int luaChon;
        do{
            System.out.print("Nhập 1.Chuyển đổi hệ nhị phân, 2.Chuyển đổi hệ thập phân, 3.Thoát :");
            luaChon = Integer.parseInt(scan.nextLine());
            if(luaChon == 1)        chuyenBinary(scan);
            else if(luaChon == 2)   chuyenDecimal(scan);
        } while(luaChon!=3);
    }

    private static void chuyenBinary(Scanner scan){
        int soDecimal;
        String chuoiBinary = "";
        String chuoiPhu = "";
        do {
            System.out.print("Nhập số hệ cơ số 10: ");
            soDecimal = Integer.parseInt(scan.nextLine());
            if (soDecimal < 1) {
                System.out.println("Số nhập phải dương. Vui lòng nhập lại");
            }
        } while(soDecimal < 1);
        int soTinhToan = soDecimal;
        do{
            chuoiPhu = String.valueOf(soTinhToan%2);
            chuoiBinary = chuoiPhu + chuoiBinary;
            soTinhToan /= 2;
        } while(soTinhToan!=0);

        System.out.println("Số "+soDecimal+" có hệ cơ số nhị phân là "+chuoiBinary);
    }

    private static void chuyenDecimal(Scanner scan){
        String chuoiBinary = "";
        int soDecimal = 0;
        char[] ch = new char[1];
        boolean flag = true;
        do {
            System.out.print("Nhập số hệ cơ số 2: ");
            chuoiBinary = scan.nextLine();
            for(int i=0;i<chuoiBinary.length();i++){
                chuoiBinary.getChars(i,i+1,ch,0);
                if(ch[0]!=48 && ch[0]!=49){
                    System.out.println("Số nhập chỉ được chứa 0 và 1. Vui lòng nhập lại");
                    flag = true;
                    break;
                } else{
                    if(ch[0]==49) {
                        soDecimal += (int) Math.pow(2, chuoiBinary.length() - 1 - i);
                    }
                    flag = false;
                }
            }

        } while(flag);
        System.out.println("Số "+chuoiBinary+" có hệ cơ số thập phân là "+soDecimal);
    }

    // Add some thing 2

}
