/*
ʹ�ö�ά�����ӡһ�� 10 �����������

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 1

˼·��
��1���� i ���� i ����
��2��ÿһ�еĵ�һ���������һ��������1
��3���������������ǣ�arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
��4���ȶ���һ����10��Ԫ�صĶ�ά���飬֮����Ϊһά���鿪�ٿռ�
��5������������һ��Scanner���󣬽���������ǵ�����
 */
import java.util.Scanner;

public class YangHuiSanJiao{

	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);
		System.out.print("���������������ǵ�������");
		int numble = myScanner.nextInt();
		int[][] arr = new int[numble][];
		for(int i = 0; i < arr.length; i++){
			//��һά���鿪�ٿռ�
			arr[i] = new int[i + 1];
			for(int j = 0; j < arr[i].length; j++){
				if(j == 0 || j == i){//�����ǰλ���Ǹ�һά�����ͷ��β����1
					arr[i][j] = 1;
				} else{
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){//�������ÿһ��һά�����ֵ
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();//����
		}
	}
}