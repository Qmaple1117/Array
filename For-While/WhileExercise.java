public class WhileExercise{

	public static void main(String[] args){

		//��ӡ 1��100 ֮�������ܱ�3��������
		// int i = 1;
		// while(i <= 100){
		// 	if(i % 3 == 0){
		// 		System.out.println(i);
		// 	}
		// 	i++;
		// }

		//��ӡ 40��200 ֮�����е�ż��
		int start = 40;
		int end = 200;
		while(start <= end){
			if(start % 2 == 0){
				System.out.println(start);
			}
			start++;
		}

		System.out.println("while��ֹ..");
	}
}