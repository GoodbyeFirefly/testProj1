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
    }
}
