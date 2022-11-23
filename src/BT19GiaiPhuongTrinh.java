/* Mục đích: Java20 - Nộp bài tập 19: Giải chương trình bậc 1 và bậc 2 có xài menu
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 23/11/2022
 *  Version: 1.00
 * */

import java.text.DecimalFormat;
import java.util.Scanner;

public class BT19GiaiPhuongTrinh {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pattern = "###.###";
        DecimalFormat dcf = new DecimalFormat(pattern);
        byte luaChon;

        do{
            System.out.println("Vui lòng lựa chọn:");
            System.out.println("   1. Giải phương trình bậc 1");
            System.out.println("   2. Giải phương trình bậc 2");
            System.out.println("   3. Thoát");
            System.out.print("Lựa chọn của bạn là ");
            luaChon = Byte.parseByte(scan.nextLine());
            switch (luaChon){
                case 1:
                    giaiPTBac1(scan,dcf);
                    break;
                case 2:
                    giaiPTBac2(scan,dcf);
                    break;
            }
        } while(luaChon!=3);
    }

    private static void giaiPTBac1(Scanner scan,DecimalFormat dcf){
        System.out.print("Nhập hệ số a = ");
        float a = Float.parseFloat(scan.nextLine());

        System.out.print("Nhập hệ số b = ");
        float b = Float.parseFloat(scan.nextLine());

        if(a==0 && b==0){
            System.out.println("Phương trình có vô số nghiệm");
        } else if(a==0 && b!=0){
            System.out.println("Phương trình vô nghiệm");
        } else{
            System.out.println("Nghiệm của phương trình x = "+dcf.format((-1*b/a)+0.0));
        }
    }

    private static void giaiPTBac2(Scanner scan,DecimalFormat dcf){
        float a;
        do {
            System.out.print("Nhập hệ số a = ");
            a = Float.parseFloat(scan.nextLine());
            if(a==0) System.out.println("Hệ số a phải khác 0. Vui lòng nhập lại");
        } while(a==0);

        System.out.print("Nhập hệ số b = ");
        float b = Float.parseFloat(scan.nextLine());

        System.out.print("Nhập hệ số c = ");
        float c = Float.parseFloat(scan.nextLine());

        float delta = b*b - 4*a*c;
        if(delta < 0){
            System.out.println("Phương trình vô nghiệm");
        } else if(delta == 0){
            System.out.println("Phương trình có nghiệm kép x1,2 = " +dcf.format((-1*b/(2*a))+0.0));
        } else{
            System.out.println("Phương trình có 2 nghiệm x1 = "+dcf.format((-1*b-Math.sqrt(delta))/(2*a))
                                    +" và x2 = "+dcf.format((-1*b+Math.sqrt(delta))/(2*a)));
        }
    }
}
