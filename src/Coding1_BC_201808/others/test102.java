package test102;

import java.util.List;
import java.util.ArrayList;

/*���󣺴洢�Զ�����󲢱���
 *������ArrayList�����õ��ǵ�������hasNext()��next()����
 *      List��������forѭ����ʵ�֣����get()��size()������
 * 
 * 
 * 
 */
public class test102 {
	public static void main(String[] args) {
		//�������϶���
		List l = new ArrayList();
		
		//��������
		Student s1 = new Student("��ϼ",18);
		Student s2 = new Student("�",22);
		Student s3 = new Student("���",36);
		Student s4 = new Student("���",12);
        //�Ѷ�����ӵ�����
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		 
		//����
		for(int i = 0;i<l.size();i++){
			Student s = (Student) l.get(i);
			System.out.println(s.getName()+"---"+s.getAge());
		}
		}
		
}

