public class Homework06{

	public static void main(String[] args){

		//ð���������
		//˼·��
		//==�������� n ��Ԫ�أ���һ��Ҫ���� n-1 ��
		//==�� i ��Ҫ���� n-i ��
		//==Ƕ��forѭ��
		//
		int[] arr = {23, 45, 89, 12, 26};
		for(int j = 0; j < arr.length; j++){
			System.out.print(arr[j] + " ");
		}
		System.out.println();//����
		for(int i = 0; i < arr.length - 1; i++){//������ n-1 ��
			for(int j = 0; j < arr.length - i - 1; j++){
				int temp = 0;
				if(arr[j] > arr[j + 1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println("��" + (i + 1) + "�������");
			for(int j = 0; j < arr.length; j++){
				System.out.print(arr[j] + " ");
			}
			System.out.println();//����
		}
	}
}