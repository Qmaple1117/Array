import java.util.Scanner;

public class DoWhileExercise{

	public static void main(String[] args){

		//���1-100
		// int i = 1;
		// do{
		// 	System.out.println(i);
		// 	i++;
		// } while(i <= 100);

		//����1-100 �ĺ�
		// int a = 1;
		// int sum = 0;
		// do{
		// 	sum += a;
		// 	a++;
		// } while(a <= 100);
		// System.out.println("1-100�ĺ��ǣ�" + sum);

		// 1 - 200 ֮�� �ܱ� 5 ���������ܱ� 3 ���������ĸ���
		// int start = 1, end = 200;
		// int numble = 0;
		// do{
		// 	if(start % 5 == 0 && start % 3 != 0){
		// 		numble++;
		// 	}
		// 	start++;
		// } while(start <= end);
		// System.out.println("������" + numble);

		Scanner myScanner = new Scanner(System.in);
		char reply = ' ';
		do{
			System.out.println("����������");
			System.out.println("��Ǯ���� y/n");
			reply = myScanner.next().charAt(0);
		} while(reply != 'y');

		System.out.println("�˳�dowhile..");
	}
}