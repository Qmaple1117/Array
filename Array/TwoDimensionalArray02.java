//��ά����� ʹ�÷�ʽ1 �� ʹ�÷�ʽ2 ��һά��������
//
//���磺int[][] arr = new int[2][3]        int[][] arr;
//										  arr = new int[][];
//										  

//ʹ�÷�ʽ3��������ȷ��				ʹ�÷�ʽ4����̬��ʼ��Ҳ�Ǻ�һά��������
//��̬��������������
//	1
//	2	2
//	3	3	3
//
public class TwoDimensionalArray02{

	public static void main(String[] args){

		int[][] arr = new int[3][];
		// for(int i = 0; i < arr.length; i++){//���û������Ŀ��ٿռ䣬һά�����е� 3 ��Ԫ�ض�Ϊnull
		// 	System.out.print(arr[i] + " ");
		// }
		for(int i = 0; i < arr.length; i++){
			//��arr�е�����Ԫ�ؿ��ٿռ�
			arr[i] = new int[i + 1];
			//��һά���鸳ֵ
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = i + 1;
			}
		}
		for(int i = 0; i < arr.length; i++){//�������
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}