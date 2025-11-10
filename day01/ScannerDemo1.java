import java.util.Scanner;//这个包使用scanner时必须要导入

public class ScannerDemo1 {
    public static void main(String[] args) {
        //用scanner进行键盘录入
        Scanner sc = new Scanner(System.in);// 定义一个Scanner类的对象sc
        System.out.println("Enter a number: ");
        int num = sc.nextInt();//定义一个变量num进行输入
        System.out.println(num);
    }
}
