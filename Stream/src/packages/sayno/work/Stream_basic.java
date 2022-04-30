package packages.sayno.work;

import java.io.File;
import java.io.FileOutputStream;

public class Stream_basic {
    public static void main(String[] args) throws Exception{
        System.out.println("About the stream");
        System.out.println("数据流: 字节数据");
        File file = new File("output.txt");
        if (file.getParentFile() != null && !file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String str = "www.sayno.work";
        System.out.println(str.getBytes());
        fileOutputStream.write(str.getBytes());
        fileOutputStream.close();
        System.out.println("会自动创建文件，但是父目录不会");
    }
}
