public class BreakExercise{

	public static void main(String[] args){

		//1 - 100 ���ڵ�����ͣ��� �͵�һ�δ���20�ĵ�ǰ��
		int sum = 0;
		int i = 0;
		for( ; i <= 100; i++){

			sum += i;
			if(sum > 20){
				break;
			}
		}
		System.out.println("����Ϊ" + i);
	}
}