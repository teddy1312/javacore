/* Mục đích: Java20 - Nộp bài tập 22: Tìm ra sub string palindromic(chẵn) có độ dài dài nhất từ chuỗi nhập vào
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 24/11/2022
 *  Version: 1.00
 * */

import java.util.Scanner;

public class BT22TimChuoiPalindromic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập 1 chuỗi: ");
        String chuoi = scan.nextLine();

        // Tìm chuỗi Palindromic chẵn
        String ketQuaChan = timEvenPalindromic(chuoi);
        if(ketQuaChan.length() != 0){
            System.out.println("Chuỗi Palindromic(even) có độ dài dài nhất là: "+ketQuaChan);
        } else{
            System.out.println("Không có chuỗi Palindromic(even)");
        }

        // Tìm chuỗi Palindromic lẻ
        String ketQuaLe = timOddPalindromic(chuoi);
        if(ketQuaLe.length() != 0){
            System.out.println("Chuỗi Palindromic(odd) có độ dài dài nhất là: "+ketQuaLe);
        } else{
            System.out.println("Không có chuỗi Palindromic(odd)");
        }

    }

    private static String timEvenPalindromic(String chuoi){
        char[] ch1 = new char[1];
        char[] ch2 = new char[1];
        String chuoiKetQua = "";
        String chuoiTam = "";
        for(int i=1;i<chuoi.length();i++){
            for(int j=0;(i+j)<chuoi.length() && (i-j)>0;){
                chuoi.getChars((i+j),(i+j)+1,ch1,0);
                chuoi.getChars((i-1-j),(i-1-j)+1,ch2,0);
                if(ch1[0] == ch2[0]) {
                    chuoiTam = chuoi.substring(i-1-j,i+1+j);
                    j++;
                } else {
                    break;
                }
            }
            if(chuoiTam.length()>chuoiKetQua.length())   chuoiKetQua = chuoiTam;
        }

        return chuoiKetQua;
    }

    private static String timOddPalindromic(String chuoi){
        char[] ch1 = new char[1];
        char[] ch2 = new char[1];
        String chuoiKetQua = "";
        String chuoiTam = "";
        for(int i=1;i<chuoi.length()-1;i++){
            for(int j=1;(i+j)<chuoi.length() && (i+1-j)>0;){
                chuoi.getChars((i+j),(i+j)+1,ch1,0);
                chuoi.getChars((i-j),(i-j)+1,ch2,0);
                if(ch1[0] == ch2[0]) {
                    chuoiTam = chuoi.substring(i-j,i+j+1);
                    j++;
                } else {
                    break;
                }
            }
            if(chuoiTam.length()>chuoiKetQua.length())   chuoiKetQua = chuoiTam;
        }

        return chuoiKetQua;
    }
}
