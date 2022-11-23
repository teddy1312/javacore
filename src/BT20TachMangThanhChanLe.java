/* Mục đích: Java20 - Nộp bài tập 20: Tách 1 mảng số tự nhiên thành 2 mảng chẵn lẻ
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 23/11/2022
 *  Version: 1.00
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class BT20TachMangThanhChanLe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soPhanTu;
        do{
            System.out.print("Nhập độ dài của mảng (>0): ");
            soPhanTu = Integer.parseInt(scan.nextLine());
            if(soPhanTu<1) System.out.println("Số phần tử phải dương. Vui lòng nhập lại");
        } while(soPhanTu<1);

        int[] mang = nhapMang(scan,soPhanTu);
        xuatMang(mang);

        ArrayList<int[]> ketQua = tachChanLe(mang);
        System.out.println("Mảng chẵn sau khi tách là:");
        xuatMang(ketQua.get(0));
        System.out.println("Mảng lẻ sau khi tách là:");
        xuatMang(ketQua.get(1));
    }

    private static int[] nhapMang(Scanner scan, int soPT){
        int[] mang = new int[soPT];
        System.out.println("Nhập phần tử của mảng: ");
        for(int i=0;i<soPT;i++){
            do {
                System.out.print("mang[" + i + "] = ");
                mang[i] = Integer.parseInt(scan.nextLine());
                if(mang[i]<0) System.out.println("Phần tử phải là số tự nhiên. Vui lòng nhập lại");
            } while(mang[i]<0);
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

    private static ArrayList<int[]> tachChanLe(int[] mang){
        ArrayList<int[]> mangChanLe = new ArrayList<int[]>();
        int count = 0;
        for(int pt : mang){
            if(pt%2==0)     count++;
        }
        int[] mangChan = new int[count];
        int[] mangLe = new int[mang.length-count];

        for(int i=0,j=0,k=0;i<mang.length;i++){
            if(mang[i]%2==0)    mangChan[j++] = mang[i];
            else                mangLe[k++] = mang[i];
        }
        mangChanLe.add(mangChan);
        mangChanLe.add(mangLe);
        return mangChanLe;
    }
}
