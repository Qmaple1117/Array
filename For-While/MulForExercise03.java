import java.util.Scanner;
public class MulForExercise03{

	public static void main(String[] args){

		//��ӡ * ���Ľ�����
		//��1����ÿһ�㶼ֻ��ӡһ�� *
		//��2�����������ȴ�ӡΪ����ֱ������
		//��3��ÿһ��ǰ����Ҫ�ճ��ġ��ո�����Ϊ���ܲ��� - ��ǰ������
		//��4��ÿһ�������Ҫ���ӵ� * ��Ϊ����ǰ���� - 1��
		//��5�����м��*�ڵ�
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�����������������");
		int layerNum = myScanner.nextInt();
		
		//��forʵ��
		// for(int i = 1; i <= layerNum; i++){

		// 	for(int n = 1; n <= (layerNum - i); n++){

		// 			System.out.print(" ");//���ÿһ��ǰ�����ճ��ľ���
		// 		}
		// 	for(int j = 1; j <= (2 * i - 1); j++){

		// 		if(i == layerNum){
		// 			System.out.print("*");//���һ��ֱ��������е�*
		// 		} else if(j < (2 * i - 1) && j > 1){
		// 			System.out.print(" ");//�����������
		// 		} else if(j == (2 * i - 1)){
		// 			System.out.println("*");//������һ��*������
		// 		} else{
		// 			System.out.print("*");//���ÿһ�еĵ�һ��*
		// 		}
		// 	}
		// }


		//��whileʵ��
		int i = 1;
		while(i <= layerNum){ 

			int n = 1;
			while(n <= (layerNum - i)){

					System.out.print(" ");//���ÿһ��ǰ�����ճ��ľ���
					n++;
				}
			int j = 1;
			while(j <= (2 * i - 1)){

				if(i == layerNum){
					System.out.print("*");//���һ��ֱ��������е�*
				} else if(j < (2 * i - 1) && j > 1){
					System.out.print(" ");//�����������
				} else if(j == (2 * i - 1)){
					System.out.println("*");//���һ��*����
				} else{
					System.out.print("*");//���ÿһ�еĵ�һ��*
				}
				j++;
			}
			i++;//������һ
		}
	}
}