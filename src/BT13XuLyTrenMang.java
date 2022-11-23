/* Mục đích: Java20 - Nộp bài tập 13: Xử lý mãng theo yêu cầu
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 22/11/2022
 *  Version: 1.00
 * */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class BT13XuLyTrenMang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập độ dài của mảng: ");
        int soPhanTu = Integer.parseInt(scan.nextLine());
        int[] mang = nhapMang(scan,soPhanTu);
        //int[] mang = {5,-20,6,-2,0,-9,-25,17,9};
        xuatMang(mang);

        if(mang == null || mang.length<1){
            System.out.println("Mảng trống!");
        } else {
            System.out.println("Giá trị trung bình: " + tinhGTTrungBinh(mang));

            int[] ketQua = timSoMaxMin(mang);
            System.out.println("Giá trị lớn nhất: "+ketQua[0]+" | Giá trị nhỏ nhất: "+ketQua[1]);

            ketQua = timSoAmMaxMin(mang);
            if(ketQua != null) System.out.println("Giá trị âm lớn nhất: "
                            +ketQua[0]+" | Giá trị âm nhỏ nhất: "+ketQua[1]);

            ketQua = timSoDuongMaxMin(mang);
            if(ketQua != null) System.out.println("Giá trị dương lớn nhất: "
                            +ketQua[0]+" | Giá trị dương nhỏ nhất: "+ketQua[1]);

            ArrayList<String> chanLe = timSoChanLe(mang);
            if(chanLe != null) {
                System.out.println("Các giá trị chẵn: "+chanLe.get(0));
                System.out.println("Các giá trị lẻ: "+chanLe.get(1));
            }

            ketQua = themPhanTu(scan,mang);
            System.out.println("Mảng trước khi thêm: ");
            xuatMang(mang);
            System.out.println("Mảng sau khi thêm phần tử: ");
            xuatMang(ketQua);

            ketQua = xoaPhanTu(scan,mang);
            System.out.println("Mảng trước khi xóa: ");
            xuatMang(mang);
            System.out.println("Mảng sau khi xóa phần tử: ");
            xuatMang(ketQua);
        }
    }

    private static int[] nhapMang(Scanner scan, int soPT){
        int[] mang = new int[soPT];
        System.out.println("Nhập phần tử của mảng: ");
        for(int i=0;i<soPT;i++){
            System.out.print("mang["+i+"] = ");
            mang[i] = Integer.parseInt(scan.nextLine());
        }
        return mang;
    }

    private static void xuatMang(int[] mang){
        System.out.print("Xuất mảng: ");
        for(int phanTu : mang) {
            System.out.print(phanTu+"   ");
        }
        System.out.print("\n");
    }

    private static String tinhGTTrungBinh(int[] mang){
        String pattern = "###.###";
        DecimalFormat dcf = new DecimalFormat(pattern);
        float gtTrungBinh = 0;
        for(int phanTu : mang){
            gtTrungBinh += phanTu;
        }
        return dcf.format(gtTrungBinh/mang.length);
    }

    private static int[] timSoMaxMin(int[] mang){
        int[] soMaxMin = {mang[0],mang[0]};   // {Max,Min}
        for(int i=1;i<mang.length;i++){
            // Tìm phần tử lớn nhất
            if(mang[i] > soMaxMin[0]){
                soMaxMin[0] = mang[i];
            }
            // Tìm phần tử nhỏ nhất
            if(mang[i] < soMaxMin[1]){
                soMaxMin[1] = mang[i];
            }
        }
        return soMaxMin;
    }

    private static int[] timSoAmMaxMin(int[] mang){
        int soPTAmDauTien = -1;
        // Tìm phần tử có giá trị âm đầu tiên trong mảng
        for(int i=0;i<mang.length;i++) {
            if(mang[i]<0) {
                soPTAmDauTien = i;
                if(i == mang.length-1)  return new int[]{mang[i], mang[i]};
                break;
            }
        }
        if(soPTAmDauTien == -1){
            System.out.println("Mảng không có số âm");
            return null;
        }

        int[] soAmMaxMin = {mang[soPTAmDauTien],mang[soPTAmDauTien]};   // {Max,Min}
        for(int i=soPTAmDauTien+1;i<mang.length;i++){
            // Tìm giá trị âm lớn nhất
            if(mang[i]>soAmMaxMin[0] && mang[i]<0){
                soAmMaxMin[0] = mang[i];
            }
            // Tìm giá trị âm nhỏ nhất
            if(mang[i]<soAmMaxMin[1]) {
                soAmMaxMin[1] = mang[i];
            }
        }
        return soAmMaxMin;
    }

    private static int[] timSoDuongMaxMin(int[] mang){
        int soPTDuongDauTien = -1;
        // Tìm phần tử có giá trị dương đầu tiên trong mảng
        for(int i=0;i<mang.length;i++) {
            if(mang[i]>0) {
                soPTDuongDauTien = i;
                if(i == mang.length-1)  return new int[]{mang[i], mang[i]};
                break;
            }
        }
        if(soPTDuongDauTien == -1){
            System.out.println("Mảng không có số dương");
            return null;
        }

        int[] soDuongMaxMin = {mang[soPTDuongDauTien],mang[soPTDuongDauTien]};   // {Max,Min}
        for(int i=soPTDuongDauTien+1;i<mang.length;i++){
            // Tìm giá trị dương lớn nhất
            if(mang[i]>soDuongMaxMin[0] ){
                soDuongMaxMin[0] = mang[i];
            }
            // Tìm giá trị dương nhỏ nhất
            if(mang[i]<soDuongMaxMin[1] && mang[i]>0) {
                soDuongMaxMin[1] = mang[i];
            }

        }
        return soDuongMaxMin;
    }

    private static ArrayList<String> timSoChanLe(int[] mang){
        ArrayList<String> mangChanLe = new ArrayList<String>();
        String chuoiChan = "";
        String chuoiLe = "";

        for(int phanTu : mang){
            if(phanTu%2 == 0){
                chuoiChan += String.valueOf(phanTu) + "  ";
            } else{
                chuoiLe += String.valueOf(phanTu) + "  ";
            }
        }
        mangChanLe.add(chuoiChan);
        mangChanLe.add(chuoiLe);
        return mangChanLe;
    }

    private static int[] themPhanTu(Scanner scan,int[] mang){
        int[] mangMoi = new int[mang.length+1];
        int phanTu;
        do {
            System.out.print("Nhập vị trí phần tử muốn thêm(0~" + (mangMoi.length-1) + "): ");
            phanTu = Integer.parseInt(scan.nextLine());
            if (phanTu<0 || phanTu>mangMoi.length-1) {
                System.out.println("Vị trí phần tử nằm ngoài phạm vi cho phép. Vui lòng nhập lại");
            }
        } while(phanTu<0 || phanTu>mangMoi.length-1);

        System.out.print("Nhập giá trị của phần tử muốn thêm: ");
        int giaTri = Integer.parseInt(scan.nextLine());
        for(int i=0,j=0;j< mangMoi.length;){
            if(j==phanTu){
                mangMoi[j++] = giaTri;
            } else {
                mangMoi[j++] = mang[i++];
            }
        }

        return mangMoi;
    }

    private static int[] xoaPhanTu(Scanner scan,int[] mang){
        int[] mangMoi = new int[mang.length-1];
        int phanTu;
        do {
            System.out.print("Nhập vị trí phần tử muốn xóa(0~" + (mang.length-1) + "): ");
            phanTu = Integer.parseInt(scan.nextLine());
            if (phanTu<0 || phanTu>mang.length-1) {
                System.out.println("Vị trí phần tử nằm ngoài phạm vi cho phép. Vui lòng nhập lại");
            }
        } while(phanTu<0 || phanTu>mang.length-1);

        for(int i=0,j=0;j < mangMoi.length;){
            if(j==phanTu)   i++;
            mangMoi[j++] = mang[i++];
        }

        return mangMoi;
    }
}