import java.util.Scanner;
//�μӸ��ֱ�������������ɼ����� 8.0 ���������������ʾ��̭�����Ҹ����Ա���ʾ�����������Ů����

public class NestedIf {

	public static void main(String[] args) {
		//����һ��Scanner������ռ����������Ϣ
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����ɼ� 0-10");
		double score = myScanner.nextDouble();
		if(score > 8.0) {
			System.out.println("����ѡ���Ա� ��orŮ");
			char gender = myScanner.next().charAt(0);
			if(gender == '��') {
				System.out.println("�������������");
			} else if(gender == 'Ů') {
				System.out.println("����Ů�������");
			} else {
				System.out.println("�Ա��������");
			}
		} else {
			System.out.println("��̭");
		}
		System.out.println("�������������");
	}
}