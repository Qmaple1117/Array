import java.util.Scanner;

public class SwitchExercise{

	public static void main(String[] args){

		//��ϰһ��ʹ�� switch ��Сд���͵� char ��תΪ��д(��������)��
		//ֻת�� a, b, c, d, e. ���������"other"
		//����һ��Scanner�������������ַ�
		/*Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ���a-z");
		char c1 = myScanner.next().charAt(0);
		switch(c1){
			case 'a':
				c1 = 'A';
				System.out.println("aתΪ:" + c1);
				break;
			case 'b':
				c1 = 'B';
				System.out.println("bתΪ:" + c1);
				break;
			case 'c':
				c1 = 'C';
				System.out.println("cתΪ:" + c1);
				break;
			case 'd':
				c1 = 'D';
				System.out.println("dתΪ:" + c1);
				break;
			case 'e':
				c1 = 'E';
				System.out.println("eתΪ:" + c1);
				break;
			default:
				System.out.println("other");
		}*/

		//�ڶ��⣺��ѧ���ɼ����� 60 �ֵģ����"�ϸ�"������ 60 �ֵģ�
		//���"���ϸ�"��(ע������ĳɼ����ܴ��� 100), ��ʾ �ɼ�/60
		/*Scanner myScanner = new Scanner(System.in);
		System.out.println("������ɼ���1 - 100");
		double score = myScanner.nextDouble();
		if(score > 100 || score < 0){
			System.out.println("������������������");
		} else{
			switch( (int)(score / 60) ){
				case 1:
					System.out.println("�ϸ�");
					break;
				case 0:
					System.out.println("���ϸ�");
					break;
			}
		}*/
		
		//��������ָ���·ݣ���ӡ���·������ļ��ڡ�3,4,5 ���� 6,7,8
		// �ļ� 9,10,11 �＾ 12, 1, 2 ���� [������ϰ, ��ʾ ʹ�ô�͸
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·ݣ�1 - 12");
		int month = myScanner.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("�·�������������������");
		}
		

		System.out.println("�������������");
	}
}