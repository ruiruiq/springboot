import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 检查未交的名单是否与上交名单有冲突
 *
 */
public class Check {
    public String[] SubmitList = new TakleName().submitList;
    int num = new TakleName().StudentNumber;
    public void CheckName() throws IOException {
        String fileName ="C:\\Users\\lenovo\\Desktop\\未交名单.txt";
        FileReader fileReader = new FileReader(fileName);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        System.out.println("字符集："+fileReader.getEncoding());

        String line =bufferedReader.readLine();//取出一个未交名字
        boolean flag = true;

        while (line!=null){
            for (int i = 0; i < num; i++) {
                if(line==SubmitList[i]){
                    flag = false;
                }
            }
            System.out.println(flag);
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        fileReader.close();

    }


    @Test
    public void fun() throws IOException {
        new Check().CheckName();
    }

    public static void main(String[] args) {

    }


}




