/* Mục đích: Java20 - Nộp bài tập 14: Xóa phần tử bị lặp lại trong mảng
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 23/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT14XoaPTBiLapLaiTronMang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập độ dài của mảng: ");
        int soPhanTu = scan.nextInt();
        int[] mang = nhapMang(scan,soPhanTu);
        xuatMang(scan, mang);

        mang = xoaPTTrungLap(mang);
        System.out.println("Mảng sau khi xóa các phần tử bị trùng lặp: ");
        xuatMang(scan,mang);

    }

    private static int[] nhapMang(Scanner scan, int soPT){
        int[] mang = new int[soPT];
        System.out.println("Nhập phần tử của mảng: ");
        for(int i=0;i<soPT;i++){
            System.out.print("mang["+i+"] = ");
            mang[i] = scan.nextInt();
        }
        return mang;
    }

    private static void xuatMang(Scanner scan,int[] mang){
        System.out.print("Xuất mảng: ");
        for(int phanTu : mang) {
            System.out.print(phanTu+"   ");
        }
        System.out.print("\n");
    }

    private static int[] xoaPTTrungLap(int[] mang){
        int[] mangDem = new int[mang.length];
        int count = 0;
        for(int i=0;i<mang.length;i++){
            for(int j=0;j<mang.length;j++){
                if(mang[i] == mang[j]){
                    if(i<=j)    mangDem[i]++;
                    else        break;
                }
            }
            if(mangDem[i] == 0)     count++;
        }
        int[] mangMoi = new int[mang.length-count];
        for(int i=0,j=0;i<mang.length;){
            if(mangDem[i] == 0){
                i++;
            } else{
                mangMoi[j++] = mang[i++];
            }
        }
        return mangMoi;
    }
}
