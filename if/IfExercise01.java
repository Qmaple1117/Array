import java.util.Scanner;

public class IfExercise01{

	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);
		//���յ�һ����
		// System.out.println("�������һ������");
		// double d1 = myScanner.nextDouble();
		// //���յڶ�����
		// System.out.println("������ڶ�������");
		// double d2 = myScanner.nextDouble();
		// //�жϵ�һ�����Ƿ����10.0���ڶ������Ƿ�С��20.0
		// if(d1 > 10.0 && d2 < 20.0){
		// 	System.out.println("�������ĺ� = " + (d1 + d2));
		// }

		// System.out.println("�������һ������");
		// int a1 = myScanner.nextInt();
		// //���յڶ�����
		// System.out.println("������ڶ�������");
		// int a2 = myScanner.nextInt();
		// if((a1 + a2) % 3 == 0 && (a1 + a2) % 5 == 0){
		// 	System.out.println("���ߵĺͼ��ܱ�3���ܱ�5����");
		// }else{
		// 	System.out.println("���ߵĺͲ����Լ��ܱ�3���ܱ�5����");
		// }
		
		System.out.println("������һ����ݣ�");
		int year = myScanner.nextInt();
		//�ж��Ƿ�Ϊ���꣬������һ���ɡ���1���ܱ�4���������ܱ�100���� ��2���ܱ�400����
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println("�����������");
		}else{
			System.out.println("����ݲ�������");
		}
		System.out.println("�������������");
	}
}