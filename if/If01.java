
import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {

		//����һ��Scanner����������������
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������������");
		int age = myScanner.nextInt();
		if(age > 18) {
			System.out.println("����18.����Ϊ���𣬷��������");
		}
		System.out.println("�������������");
	}
}
