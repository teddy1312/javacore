/* Mục đích: Java20 - Nộp bài tập 3: In thông tin về java
 *  Người tạo: Nguyễn Anh Tú
 *  Ngày tạo: 21/11/2022
 *  Version: 1.00
 * */

public class BT03InRaThongTinTheoYC {
    public static void main(String[] args){
        System.out.println("Java Version (JDK): "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path"));
    }
}
