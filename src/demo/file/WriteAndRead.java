package demo.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {
    private static List<String> readFile(String pathname){
        BufferedReader br = null ;
        FileReader fileReader  = null ;
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(pathname);
            if (!file.exists()){
                file.createNewFile();
            }
            fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            String str ;
            while ((str = br.readLine()) != null){
                strings.add(str);
            }
            return strings ;
        }catch (IOException e){
            System.err.println("Lỗi IO");
        }catch (Exception e){
            System.err.println("lỗi chương trình");
        }
        finally {
            try {
                if (fileReader != null ){
                    fileReader.close();
                }
                if (br != null ){
                    br.close();
                }
            }catch (IOException e ){
                System.err.println("Lỗi đóng file khi đọc");
            }
        }
        return strings;
    }
    public static void writeFile(String pathName , List<String> strings ){
        FileWriter fileWriter = null ;
        BufferedWriter bw = null ;
        try {
            fileWriter = new FileWriter(pathName );
            bw = new BufferedWriter (fileWriter);
            for (String str : strings) {
                bw.write(str);
                bw.newLine();
            }
        }catch (IOException e){
            System.err.println("lỗi đọc file");
        }finally {
            try {
                if (fileWriter !=null ){
                   fileWriter.close();
                }
                if (bw !=null ){
                    bw.close();
                }
            }catch (IOException e) {
                System.err.println("lỗi dọc file");
            }
        }
    }
}
