package ss16.baitap.copy_file;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        List<String> list = copyFile.readFileText("");
        copyFile.writeFile("D:\\codegym\\module2_a07\\src\\ss16\\baitap\\copy_file\\result.txt");
        System.out.println(copyFile.countStr());
    }
}
