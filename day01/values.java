//字面量
public class values {
    public static void main(String[] args) {
        //整数：
        System.out.println(8888);
        System.out.println(-666);
        //小数：
        System.out.println(-666.66);
        //字符串：是一串。
        System.out.println("hello");
        //字符：只能一个。
        System.out.println('我');
        //布尔：true和false都是关键字
        System.out.println(true);
        //空：不能直接显示要用双引号括起来。
        System.out.println("null");
        //特殊类型字面量：
        //  \t ：制表符会对前面的字符串进行补齐，补完以后字符串加补上的空格应该一共有8位。
        //没改：
        System.out.println("ni23");
        System.out.println("nin234");
        //改了以后
        System.out.println("ni"+"\t"+"\t"+23);
        System.out.println("nin"+"\t"+"\t"+234);
        //在默认的里面是补8，在idea里是补4，以及他们的倍数
    }
}



