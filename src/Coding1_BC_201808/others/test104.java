package test104;

import java.util.ArrayList;
import java.util.Random;

/*����10�����ظ������������
 *������Ҫʵ�ֲ��ظ���Ҫ��ÿ��Ԫ�ؽ��뼯��ʱ��
 *      ����contains�жϣ����������ϡ�
 *      1.������������� Random();
 *      2.�������϶���
 *      3.���������
 *      4.����������ѭ����
 *        ���ü��������ж�������ɵ�����Ҫ��Ҫ���뼯�ϡ�
 *      5.����ѭ�����������ϡ�
*/
public class test104 {
	public static void main(String[] args) {
		//1.�������������
		Random r = new Random();
		//2.�������϶���
		ArrayList<Integer> array = new ArrayList<Integer>();
		//3.���������
		int count = 0;
		//4.����ѭ��Ϊ������Ӳ��ظ�Ԫ��
		while(count < 10){
			int number = r.nextInt(20);
			boolean b = array.contains(number);
			if(!b){
				array.add(number);
				count++;
			}
		}
		//5.��������
		for(Integer i : array){
			System.out.println(i);
		}
	}
}
