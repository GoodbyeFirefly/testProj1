import javax.print.Doc;
import javax.swing.text.Document;
import java.io.File;

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

        // bug4:无用自我分配
        a = a;

    }
}
