public class Homework05{

	public static void main(String[] args){

		//�������ʮ���� 1~100  �����浽���飬�������ӡ�Լ���ƽ��ֵ��
		//�����ֵ�Լ��±꣬�����������Ƿ��� 8 
		//˼·��
		//��1����(int)(Math.random()*100) + 1 ����1~100���������Math.random()�������0~1��double��
		//��2������һ��int[] arr = new int[10];����forѭ�������������arr
		//��3������int sum = 0,max = 0,maxIndex = 0;double average = 0;
		//��4������Ѱ�ҵ���elem���� = 8��forѭ��һ�αȶ�һ�Σ��ȶԳɹ�����elem = 1
		//��5���������
		//
		int[] arr = new int[10];
		int sum = 0,max = 0,maxIndex = 0;//����ͣ����ֵ�����ֵ�±�ı���
		double average = 0;//����ƽ��ֵ����
		int elem = 8;//��Ѱ�ҵ���
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100) + 1;
			sum += arr[i];
			if(arr[i] > max){//�������ֵ�����±�
				max = arr[i];
				maxIndex = i;
			}
			if(arr[i] == elem){//���ҵ�8����
				elem = 1;
			}
		}
		average = 1.0 * sum / arr.length;
		for(int i = 0; i < arr.length; i++){//��ӡ��ʼ����
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n===���鵹�����===");
		for(int i = arr.length - 1; i >= 0; i--){//��ӡ��������
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nƽ��ֵ�ǣ�" + average);
		System.out.println("���ֵ�ǣ�" + max +" ���±�Ϊ��" + maxIndex);
		if(elem == 1){
			System.out.println("����Ԫ������8");
		} else{
			System.out.println("����Ԫ����û��8");
		}
	}
}