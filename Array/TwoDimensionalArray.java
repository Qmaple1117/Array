import java.util.Scanner;

public class TwoDimensionalArray{

	public static void main(String[] args){

		// ���ö�ά�����������ͼ��
		// 0 0 0 0 0 0
		// 0 0 1 0 0 0
		// 0 2 0 3 0 0
		// 0 0 0 0 0 0
		// 
		Scanner myScanner = new Scanner(System.in);
		int[][] arr = {{0, 0, 0, 0, 0, 0},
					   {0, 0, 1, 0, 0, 0},
					   {0, 2, 0, 3, 0, 0},
					   {0, 0, 0, 0, 0, 0}};
		//�����ά�����е�ÿһ��Ԫ��
		for(int i = 0; i < arr.length; i++){
			//arr[i].length��ʾ��ά�����е� i+1 ��Ԫ�صĳ��ȣ���Ϊ��ά�����Ԫ����һά����
			//���һά�����е�ÿһ��Ԫ��
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();//����
		}
	}
}