import java.util.Scanner;
//���ݵ��������ο����䣬��ӡƱ��  4-10���������ˣ�18-60��60Ԫ����ͯ<18����ۣ����ˣ�>60��1/3
//���� ����40 ����20

public class NestedIfExercise {

	public static void main(String[] args) {
		//����һ��Scanner��������ο���Ϣ
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����·�");
		int month = myScanner.nextInt();
		if(month >= 4 && month <= 10) {//�ж��Ƿ�������
			System.out.println("�����ο�����");
			int age = myScanner.nextInt();
			if(age >= 18 && age <= 60) {//�ж��ο������С
				System.out.println("Ʊ��60Ԫ");
			} else if(age > 60) {
				System.out.println("Ʊ��20Ԫ");
			}else if(age < 1) {
				System.out.println("���������������������...");
			}else {
				System.out.println("Ʊ��30Ԫ");
			}
		} else if( (month < 4 && month >= 1) || (month > 10 && month <= 12)) {//�ж��Ƿ��ǵ���
			System.out.println("�����ο�����");
			int age = myScanner.nextInt();
			if(age >= 18 && age <=60) {//�ж��ο������С
				System.out.println("Ʊ��40Ԫ");
			}else if(age < 1) {
				System.out.println("�����������");
			}else {
				System.out.println("Ʊ��20Ԫ");
			}
		}else {
			System.out.println("�·�������������������...");
		}
	}
}