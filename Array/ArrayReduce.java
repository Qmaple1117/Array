import java.util.Scanner;

public class ArrayReduce{

	public static void main(String[] args){

		//Ҫ��ʵ������ɾ��Ԫ��Ч����ʵ�ֶ�����������ArrayReduce.java
		// int[] arr = {1,2,3,4,5}
		// ÿ����������Ԫ�أ�������ѯ���û��Ƿ��������������ֻʣһ��ʱ��ʾ�޷�����ɾ��
		//
		int[] arr = {1, 2, 3, 4, 5};//��ʼ������
		Scanner myScanner = new Scanner(System.in);//����һ��Scanner��������û�������
		System.out.println("����ĳ�ʼԪ��Ϊ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(;;){
			int[] newArr = new int[arr.length - 1];
			for(int i = 0; i < newArr.length; i++){
					newArr[i] = arr[i];
			}
			arr = newArr;//��ԭ����ĵ�ַǨ���������鴦
			System.out.println("ɾ���ɹ�");
			for(int i = 0; i < arr.length; i++){//��������µ�arr����
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.print("�Ƿ����ɾ����y/n  ");
			char choice = myScanner.next().charAt(0);
			if(choice != 'y'){//�ɸ�ϸ��������ʵ�ֳ���Ľ�׳��
				break;
			}
			if(arr.length == 1){
				System.out.println("����ֻʣһ��Ԫ�أ��޷�����ɾ����");
				break;
			}
		}
		System.out.println("�˳�������");
	}
}