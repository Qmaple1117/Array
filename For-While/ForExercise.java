
public class ForExercise{

	public static void main(String[] args){

		//��ӡ 1~100 ֮�������� 9 �ı�����������ͳ�Ƹ��� ���ܺ͡�����Ϊ��������
		//
		//�Ϻ�˼·��
		//����Ϊ��
		//��1�����1~100
		//��2��ֻ���9�ı���
		//��3��ͳ�Ƹ������������
		//��4�������ܺͣ������������������ʱ +i
		//�������
		//�� 1 �� 100 �ñ������棬���Ը��õĵ�����Χ
		int numble = 0;
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 9 == 0){
				++numble;
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("1~100֮����9�ı����������ĸ���Ϊ��" + numble);
		System.out.println("��Щ�����ĺ�Ϊ��" + sum);

		//����Ϊ��
		//��1����� 0 �� 5
		//��2��+ ������ 5-a
		//�������
		//�� 5 �ñ�������
		int n = 5;
		for(int a = 0; a <= n; a++){
			System.out.println(a + "+" + (n - a) + "=" + n);
		}
	}
}