
public class ArrayExercise{

	public static void main(String[] args){

		char[] letter = new char[26];
		char j = 'A' + 2;         //��byte��short��char���м���ʱ������������Ƚ�����ת��Ϊint����
								//���ԣ���������char letter[i] = j + i;
		for(int i = 0; i < letter.length; i++){//����ʣ���25��Ԫ��
			letter[i] = j;
			j++;
		}
		for(int i = 0; i < letter.length; i++){
			System.out.print(letter[i] + " ");//������е�Ԫ��
		}
	}
}