/* Mục đích: Java20 - Nộp bài tập 21: Xác định 2 con Kangaroo có gặp nhau trên đường được hay không
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 23/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT21KangarooGapNhau {
    final static byte X_GIOIHAN_DUOI = 0;
    final static int X_GIOIHAN_TREN = 10000;
    final static byte V_GIOIHAN_DUOI = 1;
    final static int V_GIOIHAN_TREN = 10000;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1,x2,v1,v2;
        boolean flag = true;
        do{
            System.out.print("Nhập vị trí con Kangaroo1 ("+X_GIOIHAN_DUOI+"~"+(X_GIOIHAN_TREN-1)+") x1 = ");
            x1 = Integer.parseInt(scan.next());
            System.out.print("Nhập vị trí con Kangaroo2 ("+(x1+1)+"~"+(X_GIOIHAN_TREN-1)+") x2 = ");
            x2 = Integer.parseInt(scan.next());
            System.out.print("Nhập vận tốc con Kangaroo1 ("+V_GIOIHAN_DUOI+"~"+V_GIOIHAN_TREN+") v1 = ");
            v1 = Integer.parseInt(scan.next());
            System.out.print("Nhập vận tốc con Kangaroo2 ("+V_GIOIHAN_DUOI+"~"+V_GIOIHAN_TREN+") v2 = ");
            v2 = Integer.parseInt(scan.next());
            if(!kiemTraDieuKien(x1,x2,v1,v2))   System.out.println("Dữ liệu nhập không hợp lệ. Vui lòng nhập lại");
            else                                flag = false;

        } while(flag);

        kiemTraGapNhau(x1,x2,v1,v2);
    }

    private static boolean kiemTraDieuKien(int x1,int x2, int v1, int v2){
        int[] mang = {x1,x2,v1,v2};
        boolean flag = true;
        for(int i=0;i<4;i++){
            if(i<2) {
                if (mang[i] < X_GIOIHAN_DUOI || mang[i] > X_GIOIHAN_TREN - 1)   flag = false;
            } else {
                if (mang[i] < V_GIOIHAN_DUOI || mang[i] > V_GIOIHAN_TREN)       flag = false;
            }
        }
        if(x1>=x2)  flag = false;
        return flag;
    }

    private static void kiemTraGapNhau(int x1,int x2, int v1, int v2){
        do{
            x1 += v1;
            x2 += v2;
            if(x1 == x2){
                System.out.println("Hai con Kangaroo sẽ gặp nhau tại vị trí "+x1);
                return;
            }
        } while(x1<X_GIOIHAN_TREN && x2<X_GIOIHAN_TREN);
        System.out.println("Hai con Kangaroo sẽ không gặp nhau");
    }
}
