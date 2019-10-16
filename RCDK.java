
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

//生成一个16位的CDK序列码要求前十位为大写英文字母后六位为三个大写字母和三个小写字母
public class RCDK {
    public static void main(String[] args) {
        //System.out.println((int)'A');
        //System.out.println((int)'Z');
        //System.out.println((int)'a');
        //System.out.println((int)'z');
        System.out.print("请输入任意键开始生成：");
        Scanner input = new Scanner(System.in);
        String abt = input.next();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("本程序为生成一个16位的CDK序列码要求前十位为大写英文字母后六位为三个大写字母和三个小写字母");
        System.out.println();
        System.out.println();
        System.out.println();

        Random r = new Random();

        int[] num = new int[10];
        int[] num1 = new int[8];
        for (int i = 0;i < 10;i++) {
            num[i] = (int)(r.nextInt(26)+65);
        }

        char a;
        String first = "";
        for (int i = 0;i < 10;i++) {
            a = (char) num[i];
            first += a;
        }
        //System.out.println(first);

        int s = 0;
        while (s < 8) {
            int x;
            x = (int)(r.nextInt(58)+65);
            if ((x >= 65 & x <= 90) || (x >= 97 & x<= 122)) {
                num1[s] = x;
                s++;
            }
        }
        char b;
        String fin = "";
        for (int i = 0;i < 8;i++) {
            b = (char) num1[i];
            fin += b;
        }
        //System.out.println(fin);
        String cdk = first + fin;
        System.out.print("最终所生成的CDK为：");
        System.out.println(cdk);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("请输入任意键结束程序：");
        String oss = input.next();
    }
}
