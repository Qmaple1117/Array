public class ArrayExercise02{

	public static void main(String[] args){

		//���һ������ int[]�����ֵ { 4, -1, 9, 10, 23 }�����õ���Ӧ���±�
		//˼·��
		//��1������һ��int����洢��Ӧ����ֵ
		//��2������ max �� a[0]
		//��3����forѭ���������飬�����ǰԪ�ش���max��max���£��������±�
		int[] a = { 4, -1, 9, 10, 23 };
		int max = a[0];
		int index = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] > max){
				max = a[i];
				index = i;
			}
		}
		System.out.println("���ֵ�ǣ�" + max + " ��Ӧ���±���" + index);
	}
}