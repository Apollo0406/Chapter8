package test104;

import java.util.ArrayList;
import java.util.Random;

/*需求：10个不重复随机数的数列
 *分析：要实现不重复则要在每个元素进入集合时，
 *      进行contains判断，最后输出集合。
 *      1.创建随机数对象 Random();
 *      2.创建集合对象
 *      3.定义计数器
 *      4.计数器控制循环，
 *        利用集合特性判断随机生成的数字要不要加入集合。
 *      5.结束循环，遍历集合。
*/
public class test104 {
	public static void main(String[] args) {
		//1.创建随机数对象
		Random r = new Random();
		//2.创建集合对象
		ArrayList<Integer> array = new ArrayList<Integer>();
		//3.定义计数器
		int count = 0;
		//4.进入循环为集合添加不重复元素
		while(count < 10){
			int number = r.nextInt(20);
			boolean b = array.contains(number);
			if(!b){
				array.add(number);
				count++;
			}
		}
		//5.遍历集合
		for(Integer i : array){
			System.out.println(i);
		}
	}
}
