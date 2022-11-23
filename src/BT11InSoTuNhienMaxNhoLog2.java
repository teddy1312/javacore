/* Mục đích: Java20 - Nộp bài tập 11: In số tự nhiên lớn nhất nhỏ hơn log2(n)
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 21/11/2022
 *  Version: 1.00
 * */

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT11InSoTuNhienMaxNhoLog2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pattern = "###.##";
        DecimalFormat dcf = new DecimalFormat(pattern);
        int soNhap;
        int soCanTim;
        do {
            System.out.print("Nhập số tự nhiên: ");
            soNhap = Integer.parseInt(scan.nextLine());
            if(soNhap<1) System.out.println("Số nhập phải dương. Vui lòng nhập lại");
        } while(soNhap<1);
        float soLog = (float)(Math.log10(soNhap)/Math.log10(2));
        if(soLog == Math.round(soLog)){
            soCanTim = Math.round(soLog)-1;
        } else{
            soCanTim = (int)soLog;
        }
        System.out.println("log2("+soNhap+") = "+dcf.format(soLog));
        if(soCanTim<0){
            System.out.println("Không có số tự nhiên lớn nhất nhỏ hơn log2("+soNhap+")");
        } else{
            System.out.println("Số tự nhiên lớn nhất nhỏ hơn log2("+soNhap+") là: "+soCanTim);
        }

    }
}

