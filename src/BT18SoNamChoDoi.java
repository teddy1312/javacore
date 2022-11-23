/* Mục đích: Java20 - Nộp bài tập 18: Tính số năm đợi chờ để có số tiền mong muốn từ việc gởi ngân hàng
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 23/11/2022
 *  Version: 1.00
 * */

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT18SoNamChoDoi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pattern = "###,###.#";
        DecimalFormat dcf = new DecimalFormat(pattern);
        System.out.print("Nhập số tiền anh X gửi(kVND): ");
        float tienGui = Float.parseFloat(scan.nextLine());

        System.out.print("Nhập số tiền anh X muốn nhận(kVND): ");
        float tienNhan = Float.parseFloat(scan.nextLine());

        System.out.print("Nhập số tiền lãi tiết kiệm mỗi năm(kVND): ");
        float tienLai = Float.parseFloat(scan.nextLine());
        int soNam = 0;
        while((int)Math.round(tienGui*100)/100.0f<tienNhan){
            tienGui += tienLai;
            soNam++;
        }

        System.out.println("Anh X phải chờ "+ soNam+" năm để có "+dcf.format(tienGui*1000)+" VNĐ");
    }
}
