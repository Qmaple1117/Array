import java.util.Scanner;

public class ArrayAdd{

	public static void main(String[] args){

		//Ҫ��ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ��������ݡ�ArrayAdd.java
		// 1) ԭʼ����ʹ�þ�̬���� int[] arr = {1,2,3}
		// 2) ���ӵ�Ԫ�� 4��ֱ�ӷ����������� arr = {1,2,3,4}
		// 3) �û�����ͨ�����·����������Ƿ������ӣ���ӳɹ����Ƿ������y/n
		//˼·��
		//��1������һ��Scanner���󣬽���Ҫ���ӵ�����Ԫ��
		//��2������һ�����飬���ԭ�������ӵ���������
		//��3��ʹ��for����ѭ����ÿһ��ѭ������ѯ���Ƿ�������
		//
		int[] arr = {1, 2, 3};//��ʼ������
		Scanner myScanner = new Scanner(System.in);
		for(;;){
			System.out.print("��ӵ�����Ϊ��");
			int elem = myScanner.nextInt();
			int[] newArr = new int[arr.length + 1];
			for(int i = 0; i < newArr.length; i++){
				if(i == newArr.length - 1){
					newArr[i] = elem;//����Ԫ�����������ĩβ
				} else{
					newArr[i] = arr[i];
				}
			}
			arr = newArr;//��ԭ����ĵ�ַǨ���������鴦
			System.out.println("��ӳɹ�");
			for(int i = 0; i < arr.length; i++){//��������µ�arr����
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.print("�Ƿ������ӣ�y/n  ");
			char choice = myScanner.next().charAt(0);
			if(choice != 'y'){//�ɸ�ϸ��������ʵ�ֳ���Ľ�׳��
				break;
			}
		}
		System.out.println("�˳�������");
	}
}