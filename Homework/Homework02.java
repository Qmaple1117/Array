import java.util.Scanner;

public class Homework02{

	public static void main(String[] args){

		//ʵ���ж�һ�����������ĸ���Χ��������С���㻹�ǵ�����
		//˼·������һ��Scanner�������Ҫ�жϵ�������Ȼ������ if
		//
		// Scanner myScanner = new Scanner(System.in);
		// System.out.print("������Ҫ�жϵ�������");
		// int int1 = myScanner.nextInt();
		// if(int1 > 0){
		// 	System.out.println("������");
		// } else if(int1 < 0){
		// 	System.out.println("С����");
		// } else{
		// 	System.out.println("������");
		// }

		//�ж�һ������Ƿ�Ϊ����
		//˼·����1������һ��Scanner�������Ҫ�жϵ���ݣ�Ȼ��if
		//       ��2���ɹ������ ˭˭�����꣬ʧ�ܾ���� ��������
		//       
		// Scanner myScanner = new Scanner(System.in);
		// System.out.print("������Ҫ�жϵ���ݣ�");
		// int year = myScanner.nextInt();
		// if( (year % 4 == 0 && year % 100 != 0) || year % 100 == 0 ){
		// 	System.out.println(year + "��������");
		// } else{
		// 	System.out.println("��������");
		// }

		//�ж�һ�������Ƿ���ˮ�ɻ�����һ�� 3 λ���������λ�����������͵����䱾��
		//����153 = 1*1*1 + 5*5*5 + 3*3*3
		//˼·��
		//��1������һ��Scanner�������Ҫ�жϵ�������
		//��2����λ�������� / 100
		//��2��ʮλ���������� - ��λ��*100��/ 10
		//��3����λ�������� - ��λ��*100 - ʮλ��*10   //��ʦ��˼·���ã�ʮλ����������%100��/10
		//                                                           ��λ�������� % 10
		//��4���ж� ���� �Ƿ���� ������������
		//
		Scanner myScanner = new Scanner(System.in);
		System.out.print("������Ҫ�жϵ������� 0-1000��");
		int num = myScanner.nextInt();
		int digits = 0;//�����λ��
		int tenDigits = 0;//����ʮλ��
		int hundreds = 0;// �����λ��
		if(num > 1000 || num < 0){
			System.out.println("�����������������");
		} else{
			hundreds = num / 100;
			System.out.println("��λ���ǣ�" + hundreds);
			tenDigits = (num - hundreds*100) / 10;
			System.out.println("ʮλ���ǣ�" + tenDigits);
			digits = num - hundreds*100 - tenDigits*10;
			System.out.println("��λ���ǣ�" + digits);
			if(num == (hundreds*hundreds*hundreds + tenDigits*tenDigits*tenDigits 
				+ digits*digits*digits)){
				System.out.println("��ˮ�ɻ���");
			} else{
				System.out.println("����");
			}
		}
	}
}