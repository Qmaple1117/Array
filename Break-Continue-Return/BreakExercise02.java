import java.util.Scanner;

public class BreakExercise02{

	public static void main(String[] args){

		//ʵ�ֵ�¼��֤���� 3 �λ��ᣬ����û���Ϊ"����" ,
		//����"666"��ʾ��¼�ɹ���������ʾ���м��λ��ᣬ��ʹ�� for+brea
		//
		//�ַ�����Ƚ���equals ʹ�÷�������name����ʾ���� name.equals("�Ƚ϶���")
		//                                          "�Ƚ϶���".equals(name) �Ƽ������Ա����ָ�� 

		int chance = 3;//�ɳ��Դ���
		Scanner myScanner = new Scanner(System.in);
		label1:
		for(;;){

			System.out.print("�������û�����");
			String name = myScanner.next();
			if("����".equals(name)){//�����û����Ƿ����
				for(;;){//���ִ��ڣ�����������֤����

					System.out.print("���������룺");
					String code = myScanner.next();
					if("666".equals(code)){
						System.out.println("��½�ɹ�");
						break label1;//��¼�ɹ����˳�����
					} else if(chance != 1){
						chance--;
						System.out.println("����������������룬����" + chance + "�λ���");
					} else{
						System.out.println("��½ʧ��");
						break label1;//������֤������Χ���˳�����
					}
				}
			} else{
				System.out.println("�û��������ڣ����������룺");
			}

		}
	}
}