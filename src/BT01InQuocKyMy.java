/* Mục đích: Java20 - Nộp bài tập 1: In quốc kỳ Mỹ
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 20/11/2022
 *  Version: 1.00
 * */

public class BT01InQuocKyMy {
    public static void main(String[] args) {
        for(int i=0;i<15;i++){
            if(i<9) {
                if (i % 2 == 0) inHangBang(inHangSao(true), true);
                else            inHangBang(inHangSao(false), true);
            } else{
                inHangBang("", false);
            }
        }
    }

    private static String inHangSao(boolean hangChan){
        String digit1,digit2;
        if(hangChan){
            digit1 = "*";
            digit2 = " ";
        } else{
            digit1 = " ";
            digit2 = "*";
        }

        String row="";
        for(int i=0;i<11;i++){
            if(i%2==0){
                row+=digit1;
            } else{
                row+=digit2;
            }
        }
        return row+" ";
    }

    private static void inHangBang(String row,boolean hangNgan){
        if(hangNgan) {
            row += String.format("%-44s"," ").replace(" ","=");
        } else{
            row += String.format("%-56s"," ").replace(" ","=");
        }
        System.out.println(row);
    }
}
