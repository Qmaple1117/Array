import java.util.Scanner;

public class SwitchDetail{
	//�½�һ��main����
	public static void main(String[] args){
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("������һ���ַ�����a-g��");
		// char day = myScanner.next().charAt(0);
		int day = 12;//��ȷ
		switch(day){
			case 'a':
				System.out.println("����һ");
				break;
			case 'b':
				System.out.println("���ڶ�");
				break;
			default:
				System.out.println("dsadas");
		}
	}
}