public class Homework03{

	public static void main(String[] args){

		//��� 1-100 ֮�䲻�ܱ�5����������ÿ���һ��
		//˼·��
		//��1��������ܱ�5��������
		//��2����Ϊ���һ��
		int num = 0;//��¼ÿ���Ѿ��м�����
		for(int i = 1; i <= 100; i++){
			if(i % 5 != 0){
				System.out.print(i + "\t");
				num++;
			}
			if(num == 5){
				System.out.println();//����������num
				num = 0;
			}
		}

		//���Сд�� a-z �Լ���д�� Z-A
		//˼·��
		//��1��a-z��ASCII���� 97-122��A-Z��ASCII���� 65-90
		//��2��Сд��forѭ��++����д����forѭ��--
		//
		//˼·ǳ���ˣ������ַ������ǿ�������ģ�����char a = 'a'; a <= 'z'; a++
		char letter = ' ';
		char majuscule = ' ';
		for(int j = 97; j<=122; j++){
			letter = (char)j;
			System.out.print(letter);
		}
		System.out.println();
		for(int n = 90; n >= 65; n--){
			majuscule = (char)n;
			System.out.print(majuscule);
		}
		System.out.println();

		//��� 1 - 1/2 + 1/3 - 1/4.....1/100 �ĺ�
		//˼·��
		//��1��forѭ����1-100��ÿһ��ѭ�������ۼӲ���
		//��2������һ��double�����洢�ۼӵ�ֵ
		//��3��ѭ������Ϊż��ʱ���� -= ����
		//��4���������ֵ
		//
		double sum1 = 0;
		for(int a = 1; a <= 100; a++){
			if(a % 2 == 0){
				sum1 -= (1.0 / a);	
			} else{
				sum1 += (1.0 / a);
			}
		}
		System.out.println("���ǣ�" + sum1);
		
		//�� 1 + (1+2) + (1+2+3) +....+ (1+2+3+...+100) �Ľ��
		//˼·��
		//��1��forѭ�� 1-100 ��������һ��int���� sum2 �洢�ۼ�ֵ
		//��2������һ��int���� allSum �洢ÿһ���ۼ�ֵ�ĺ�
		//
		int sum2 = 0;
		int allSum = 0;
		for(int start = 1; start <= 100; start++){
			sum2 += start;
			allSum += sum2;
		}
		System.out.println("1 + (1+2) + ... + (1+2+...+100)�Ľ���ǣ�" + allSum);
	}
}