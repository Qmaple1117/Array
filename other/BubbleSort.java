

public class BubbleSort{

	public static void main(String[] args){

		//���ǽ��������24,69,80,57,13 ʹ��ð�����򷨽���
		//�ų�һ����С������������С�
		//˼·��   �����Сlength
		//��1�������� length-1 ��
		//��2���� i ����Ҫ���� length-i ��
		//��3������ǰָ�����ָ�룬ÿһ�����������󽻻�arr[ǰָ��]��arr[��ָ��]����ǰ���++
		//     [���Ը���࣬�� j �� j+1 ����ǰ��ָ�룬������ʡ��ÿһ��֮��ĳ�ʼ��]
		//��4��ÿһ�ֽ���ǰ��Ҫ��ָ���ʼ��
		//��5����Ҫ����ѭ��
		//
		int[] arr = {24, 69, 80, 57, 13};
		int length = arr.length;
		System.out.println("===��������ǰ===");
		for(int i = 0; i < length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		int front = 0, behind = 1;//����ǰָ�����ָ��
		for(int i = 0; i < length - 1; i++){//������ length-1 ��
			int temp = 0;
			for(int j = 1; j < length - i; j++){//�� i �ֽ���
				//������������������
				if(arr[front] > arr[behind]){
					temp = arr[front];
					arr[front] = arr[behind];
					arr[behind] = temp;
				}
				front++;
				behind++;
			}
			front = 0;behind = 1;//��ʼ��ָ��
		}
		System.out.println("===���������===");
		for(int i = 0; i < length; i++){
			System.out.print(arr[i] + "\t");
		}
	}
}