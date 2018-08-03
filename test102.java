package test102;

import java.util.List;
import java.util.ArrayList;

/*需求：存储自定义对象并遍历
 *分析：ArrayList遍历用的是迭代器的hasNext()和next()方法
 *      List遍历则用for循环来实现，配合get()和size()方法。
 * 
 * 
 * 
 */
public class test102 {
	public static void main(String[] args) {
		//创建集合对象
		List l = new ArrayList();
		
		//创建对象
		Student s1 = new Student("李霞",18);
		Student s2 = new Student("李话",22);
		Student s3 = new Student("李机",36);
		Student s4 = new Student("李刚",12);
        //把对象添加到集合
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		 
		//遍历
		for(int i = 0;i<l.size();i++){
			Student s = (Student) l.get(i);
			System.out.println(s.getName()+"---"+s.getAge());
		}
		}
		
}

