package test101;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*���󣺶�̬�ضԼ�����Ԫ�ؽ������Ӻ�ɾ����������
 * ������1.�������϶���
 *       2.����������ӵ�����
 *       3.��������
 *           3.1 ���ü��϶����ȡ������
 *           3.2 ͨ����������hasNext()�����ж��Ƿ���Ԫ��
 *           3.3 ͨ����������next()������ȡԪ�ز�ָ����һλ��
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
