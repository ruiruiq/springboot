import org.junit.Test;

import java.util.List;
import java.util.ListIterator;

public class TakleName {
    //要处理的数据
    public List<String> nameList = GetFileName.GetName();
    //上交的名单
    public String[] submitList = new String[1000];
    //
    public int StudentNumber = nameList.size();

//    public static void main(String[] args) {
//        List<String> nameList = GetFileName.GetName();
//
//        for (int i = 0;i<nameList.size();i++) {
//            String full_name = nameList.get(i);
//            String[] ou = full_name.split("-");
//            String[] name = ou[2].toString().split("\\.");
//            //名字是name[0]
//            System.out.println(name[0]);
//
//        }
//
//        System.out.println(nameList.size());
//
//    }
    //输出上交的人数
    public void getSubmitName(){
        List<String> nameList = GetFileName.GetName();
        for (int i = 0;i<nameList.size();i++) {
            String full_name = nameList.get(i);
            String[] ou = full_name.split("-");
            String[] name = ou[2].toString().split("\\.");
            //名字是name[0]
            //System.out.println(name[0]);
            submitList[i] = name[0];
        }
        for (int i = 0;i<nameList.size();i++){
            System.out.println(submitList[i]);
        }
        System.out.println(nameList.size());
    }
    @Test
    public void fun(){
        new TakleName().getSubmitName();
    }

}
