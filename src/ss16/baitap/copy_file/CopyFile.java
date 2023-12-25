package ss16.baitap.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private static final String FILE_DICH = "D:\\codegym\\module2_a07\\src\\ss16\\baitap\\copy_file\\result.txt";

    List<String> strings = new ArrayList<>();
    BufferedReader bufferedReader = null ;

    public List<String> readFileText(String filepath ){
        try {
            File file = new File(filepath);

            if (!file.exists()){
                System.out.println("Tập nguồn không tồn tại");
                throw new FileNotFoundException();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                strings.add(line);
            }
            return strings;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader !=null){
                    bufferedReader.close();
                }
            }catch (IOException e){
                throw new RuntimeException();
            }
        }
        return strings;
    }

    public void writeFile(String filePath) {
        FileWriter fileWriter = null ;
        BufferedWriter bufferedWriter = null ;
        try {
            fileWriter = new FileWriter(filePath , true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < strings.size(); i++) {
                bufferedWriter.write(strings.get(i)+ "\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null){
                    fileWriter.close();
                }
                if (bufferedWriter != null ){
                    bufferedWriter.close();
                }
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }

    public int countStr(){
        String[] str1;
        int count = 0 ;
        for (String str : strings) {
            str1 = str.split("");
            count += str.length();
        }
        return count;
    }
}
