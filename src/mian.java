import javax.print.Doc;
import javax.swing.text.Document;
import java.io.File;
import java.util.Random;

public class mian {
    public static void main(String[] args) {
        // bug1:除零
        int a = 1 / 0;
        System.out.println(a);

        // bug2:相同的两个if分支
        boolean bool = true;
        if(bool) {
            System.out.println("1");
        } else {
            System.out.println("1");
        }

        // bug3:数据类型转换
        double dou = 1 + 2;
        System.out.println(dou);

        // bug4:无用变量自我分配
        a = a;

        // bug5:无用变量自我分配
        a = a;

        // bug6:无用变量自我分配
        a = a;

        // bug7:无用变量自我分配
        a = a;

        // bug8:无用变量自我分配
        a = a;

        // bug9:无用变量自我分配
        a = a;

        // bug10:无用变量自我分配
        a = a;

        // bug11:无用变量自我分配
        a = a;

        // bug12:无用变量自我分配
        a = a;

        // bug13:无用变量自我分配
        a = a;

        // bug14:无用变量自我分配
        a = a;

        // bug15:无用变量自我分配
        a = a;

        // bug16:无用变量自我分配
        a = a;

        // bug17:无用变量自我分配
        a = a;
    }
}
