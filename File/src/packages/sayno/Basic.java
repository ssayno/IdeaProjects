package packages.sayno;

import javax.swing.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Basic {
    public static void main(String[] args) throws Exception{
        File file = new File("/home/sayno/PycharmProjects/longzu/dragon_four.tex");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
//        if (file.exists()) {
//            file.delete();
//        }else{
//            file.createNewFile(); // will throw IOException
//        }
        System.out.println(file.getParent());
        System.out.println("File separator in Linux is " + File.separator);
        System.out.println("When you create file, you should confirm parent path is exists.");
        System.out.println("file.getParent() return type is String");
        System.out.println("file.getParentFile() return type is File type, if you want to use File, you should use this;");
        System.out.println("文件是否可读" + file.canRead());
        System.out.println("文件是否可写" + file.canWrite());
        System.out.println("文件大小:" + file.length()  / (double) 1024 / 1024 + "M");
        System.out.println("最后修改日期: (lastModified return long type value, so ti can be used by SimpleDateFormat)" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));
        System.out.println(file.getAbsolutePath());
        System.out.println("是否是文件: " + file.isFile());
        System.out.println("是否是目录: " + file.isDirectory());
        listall(new File("/home/sayno/PycharmProjects"));
        // List_digui(new File("/home/sayno/PycharmProjects/longzu"));
        rename_all(new File("/home/sayno/PycharmProjects/test"));
    }
    public static void listall(File temp){
        if (temp.isDirectory()){
            File [] result = temp.listFiles();
            for (int x=0, length = result.length;x<length;x++){
                if (result[x].isFile()){
                    System.out.println(result[x].getName() + " is a file");
                }else{
                    System.out.println(result[x].getName() + " is a directory");
                }
            }
        }
    }
    public static void List_digui(File temp){
        if (temp.isDirectory()){
            System.out.println("hello");
            File [] result = temp.listFiles();
            System.out.println(result);
            for (int x=0, length=result.length;x<length;x++){
                List_digui(result[x]);
            }
        }
        System.out.println(temp);
    }
    public static void rename_all(File temp){
        if (temp.isDirectory()){
            File [] results = temp.listFiles();
            for (int x=0, length = results.length;x<length;x++){
                rename_all(results[x]);
            }
        }else if (temp.isFile()){
            String name = temp.getName();
            String firstName = name.split("\\.")[0];
            String newName = firstName + ".txt";
            // two operation to set new File Path
            // temp.renameTo(new File(temp.getParent() + File.separator + newName));
            temp.renameTo(new File(temp.getParent(), newName));
            System.out.println(temp.getParent() + File.separator + newName);
            System.out.println(temp.getName());
        }
    }
}
