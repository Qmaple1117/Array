
public class ArrayReverse{

	public static void main(String[] args){

		//Ҫ�󣺰������Ԫ�����ݷ�ת�� ArrayReverse
		//arr {11,22,33,44,55,66}    --> {66, 55,44,33,22,11}
		//˼·��
		//��1����������int������head��rear�ֱ𱣴�ͷ����β���������±�
		//��2��forѭ��������[head]������[rear]������ֵ����temp���������м�ֵ
		//��3��ÿһ�ν�����head++��rear--��ѭ����������Ϊhead > rear
		//
		int[] arr = { 11, 22, 33, 44, 55, 66 };
		System.out.println("����Ԫ��Ϊ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		int temp = 0;
		int head = 0, rear = arr.length - 1;
		for( ; head < rear; head++, rear--){
			temp = arr[head];
			arr[head] = arr[rear];
			arr[rear] = temp;
		}
		System.out.println();
		System.out.println("�ı�������Ԫ��Ϊ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}