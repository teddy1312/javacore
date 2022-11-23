/* Mục đích: Java20 - Nộp bài tập 5: Tính độ dài đoạn AB với A(x1,y1), B(x2,y2) nhập vào từ bàn phím
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 21/11/2022
 *  Version: 1.00
 * */

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT05TinhDoDaiDoanAB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập tọa độ của A với x1 = ");
        int x1 = Integer.parseInt(scan.nextLine());
        System.out.print("Nhập tọa độ của A với y1 = ");
        int y1 = Integer.parseInt(scan.nextLine());
        System.out.print("Nhập tọa độ của B với x2 = ");
        int x2 = Integer.parseInt(scan.nextLine());
        System.out.print("Nhập tọa độ của B với y2 = ");
        int y2 = Integer.parseInt(scan.nextLine());

        String pattern = "#.###";
        DecimalFormat dcf = new DecimalFormat(pattern);

        float doDaiAB = (float)Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        System.out.println("Độ dài đoạn AB = "+dcf.format(doDaiAB));
    }
}
