public class Homework04{

	public static void main(String[] args){

		/*
		��֪�и���������飬Ҫ�����һ��Ԫ�أ���������Ϊ���򣬱��磺
		{10, 12, 45, 90}�����23������Ϊ{10, 12, 23, 45, 90}
		 */
		
		int[] arr = {10, 12, 45, 90};
		System.out.println("���Ԫ��ǰ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int elem = 23;//�����Ԫ��
		int[] newArr = new int[arr.length + 1];
		//��arr��Ԫ��ת��newArr��
		for(int i = 0; i < arr.length; i++){
			newArr[i] = arr[i];
		}
		//���Ԫ�ز���������
		for(int i = 0; i < newArr.length; i++){
			int temp = 0;//�м����
			if(i == newArr.length - 1){//���һ���ǿ�Ԫ�أ�ֱ�Ӳ���
				newArr[i] = elem;
			} else if(elem < newArr[i]){
				temp = elem;
				elem = newArr[i];
				newArr[i] = temp;
			}
		}
		arr = newArr;//��arr�ĵ�ַǨ��
		System.out.println("��Ӻ�");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}