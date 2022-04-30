package packages.sayno.work;

import java.io.File;
import java.io.FileInputStream;

public class InputStreamUseage {
    public static void main(String[] args) throws Exception{
        System.out.println("InputStream useage");
        FileInputStream fileInputStream = new FileInputStream(new File("sayo/output.txt"));
//        byte [] data2 = fileInputStream.readAllBytes();
//        System.out.println(new String(data2));
        System.out.println(fileInputStream.read());
        System.out.println((char) fileInputStream.read());
        byte [] data = new byte[20];
        int len = fileInputStream.read(data);
        System.out.println("读取长度为: " + len);
        System.out.println(new String(data, 0, len));
        fileInputStream.close();
    }
}
