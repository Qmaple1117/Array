import java.util.Scanner;

public class MultiplyForExercise{

	public static void main(String[] args){

		//ͳ�� 3 ����ɼ������ÿ������ 5 ��ͬѧ������������ƽ����
		//�����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]��
		//ͳ�������༰��������ÿ������ 5 ��ͬѧ��
		Scanner myScanner = new Scanner(System.in);
		int a = 3;//�м����༶
		int b = 5;//ÿ������������
		double score = 0;//�洢ÿ��ѧ���ķ���
		double allSum = 0, allAverage = 0;//�洢���а༶���ֺܷ�ƽ����
		int passing = 0;
		for(int start = 1; start <= a; start++){

			double sum = 0, average = 0;;//�洢�����༶���ֺܷ�ƽ����
			for(int i = 1; i <= b; i++){

				System.out.println(start + "���" + i + "��ѧ���ĳɼ���");
				score = myScanner.nextDouble();
				sum += score;
				if(score >= 60){
					passing++;
				}
			}
			average = sum / b;
			allSum += sum;
			System.out.println(start + "���ƽ�����ǣ�" + average);
		}
		allAverage = allSum / (a * b);
		System.out.println("�����༶��ƽ������" + allAverage);
		System.out.println("�����༶�ĺϸ�����Ϊ" + passing + "��");
	}
}