package JcCount;

import java.util.Scanner;

//要求输入一个数，输出这个数的阶乘的二进制的位数
/*

阶乘位数

        9的阶乘等于：362880
        它的二进制表示为：1011000100110000000
        这个数字共有19位。

        请你计算，9999 的阶乘的二进制表示一共有多少位？

        注意：需要提交的是一个整数，不要填写任何无关内容（比如说明解释等）
*/

public class JcApp {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int jc = Jc(n);
        int answer = binaryCount(jc);
        System.out.println(answer);
    }

    public static int Jc(int n){
        if(n == 1)
            return 1;
        else
            return n * Jc(n-1);
    }

    public static int binaryCount(int jc){
        //拿到一个数，求它的二进制的位数
        int count = 0;
        while(jc / 2 != 0){
            jc = jc / 2;
            count++;
        }
        return count+1;
    }
}
