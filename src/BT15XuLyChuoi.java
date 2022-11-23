/* Mục đích: Java20 - Nộp bài tập 15: Xử lý trên chuỗi
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 23/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT15XuLyChuoi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập 1 chuỗi: ");
        String chuoi = scan.nextLine();

        System.out.println("Độ dài chuỗi là: "+chuoi.length());

        System.out.println("Ký tự đã in ra là: "+inKyTu(scan,chuoi));

        if(kiemTraChuoiPhu(scan,chuoi)){
            System.out.println("Chuỗi phụ có nằm trong chuỗi nhập");
        } else{
            System.out.println("Chuỗi phụ không nằm trong chuỗi nhập");
        }

    }

    private static String inKyTu(Scanner scan, String chuoi){
        char[] ch = new char[1];
        int viTri;
        do{
            System.out.print("Nhập vị trí của ký tự muốn in ra(0~"+(chuoi.length()-1)+"): ");
            viTri = Integer.parseInt(scan.nextLine());
            if(viTri<0 || viTri>chuoi.length()-1){
                System.out.println("Vị trí ký tự nằm ngoài phạm vi. Vui lòng nhập lại");
            }
        } while(viTri<0 || viTri>chuoi.length()-1);

        chuoi.getChars(viTri,viTri+1,ch,0);
        return String.valueOf(ch);
    }

    private static boolean kiemTraChuoiPhu(Scanner scan, String chuoi){
        System.out.print("Nhập 1 chuỗi phụ: ");
        String chuoiPhu = scan.nextLine();

        if(chuoi.toLowerCase().contains(chuoiPhu.toLowerCase())){
            return true;
        } else{
            return false;
        }
    }
}
