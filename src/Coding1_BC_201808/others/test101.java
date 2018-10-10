package test101;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*需求：动态地对集合类元素进行增加和删除、遍历。
 * 分析：1.创建集合对象
 *       2.创建对象并添加到集合
 *       3.遍历集合
 *           3.1 利用集合对象获取迭代器
 *           3.2 通过迭代器的hasNext()方法判断是否有元素
 *           3.3 通过迭代器的next()方法获取元素并指向下一位置
*/
public class test101 {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("judy");
		c.add("may");
		c.add("jolly");
		
		Iterator it = c.iterator();
		
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}
		
	}
}
