import java.util.Scanner;

public class Switch01{
	//�½�һ��main����
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ�����a-g��");
		char day = myScanner.next().charAt(0);
		switch(day){
			case 'a':
				System.out.println("����һ");
				break;
			case 'b':
				System.out.println("���ڶ�");
				break;
			case 'c':
				System.out.println("������");
				break;
			case 'd':
				System.out.println("������");
				break;
			case 'e':
				System.out.println("������");
				break;
			case 'f':
				System.out.println("������");
				break;
			case 'g':
				System.out.println("������");
				break;
			default:
				System.out.println("��������ַ�����ȷ");
		}
		System.out.println("�������������");
	}
}