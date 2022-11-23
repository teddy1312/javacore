/* Mục đích: Java20 - Nộp bài tập tính tiền karaoke
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 20/11/2022
 *  Version: 1.00
 * */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class TinhTienKaraoke {
    final static int DON_GIA_1H = 30000;
    final static float DON_GIA_SAU_3H = DON_GIA_1H*3*0.3f;
    final static int DON_GIA_NUOC = 10000;
    final static byte GIO_MO_CUA = 9;
    final static byte GIO_DONG_CUA = 24;
    final static byte GIO_KHUYEN_MAI = 17;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte gioVao,gioRa;
        int soChaiNuoc;
        boolean flag = true;
        do {
            System.out.println("Thời gian mở cửa từ 9h đến 24h");
            gioVao = nhapGio(scan,true);
            gioRa = nhapGio(scan,false);
            if(gioVao>gioRa){
                System.out.println("Giờ nhập không hợp lệ(giờ vào lớn hơn giờ ra). Vui lòng nhập lại!");
            } else {
                flag = false;
            }
        } while(flag);
        soChaiNuoc = nhapSoChaiNuoc(scan);
        System.out.println("Tổng hóa đơn là: "+tinhTongChiPhi(gioVao,gioRa,soChaiNuoc)+" VNĐ");
    }

    private static byte nhapGio(Scanner scan, boolean nhapVao){
        byte gio;
        do{
            if(nhapVao) System.out.print("Nhập giờ vào: ");
            else        System.out.print("Nhập giờ ra: ");
            gio = Byte.parseByte(scan.nextLine());
            if(kiemTraThoiGian(gio)){
                return gio;
            }
        } while(true);
    }

    private static int nhapSoChaiNuoc(Scanner scan){
        int soChai;
        do{
            System.out.print("Nhập số chai nước đã uống: ");
            soChai = Integer.parseInt(scan.nextLine());
            if(soChai>=0)    return soChai;
        } while(true);
    }

    private static boolean kiemTraThoiGian(byte gio){
        if(gio>=GIO_MO_CUA && gio<=GIO_DONG_CUA){
            return true;
        } else{
            System.out.println("Giờ nhập không hợp lệ. Vui lòng nhập lại!");
            return false;
        }
    }

    private static String tinhTongChiPhi(byte gioVao, byte gioRa, int soChaiNuoc){
        String pattern = "###,###.#";
        DecimalFormat dcf = new DecimalFormat(pattern);

        float tongTien;
        if((gioRa-gioVao)<=3){
            tongTien = (gioRa-gioVao)*DON_GIA_1H;
        } else{
            tongTien = 3*DON_GIA_1H + (int)((gioRa-gioVao-3)*DON_GIA_SAU_3H);
        }
        if(soChaiNuoc>0)    tongTien += soChaiNuoc*DON_GIA_NUOC;
        if(gioRa<=GIO_KHUYEN_MAI)       tongTien *= 0.8f;

        return dcf.format(tongTien);
    }
}
