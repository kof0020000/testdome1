import java.util.Scanner;

/*
 * �ġ���Ҫ����
 * 1�����Ҳ���λ��
 * ��Ҫ�����λ�ã�ѭ�����������˵�һ��Ϊ�յ�λ��
 * ����ҵ��ˣ����λ����Ҫ�������ݵ�λ��
 * ���û�ҵ�������ʾ�ʹ�����
 * 2��ִ��������ݲ���
 * a.��ʾ���пι�ѡ��Ĳ�Ʒ��Ϣ
 * �û���ѡ���Ʒ��ż�����
 * b.Ҫ�����붩���˵�����
 * c.Ҫ�������Ͳ�ʱ�䣨10-20֮�䣩
 * ���������Ϣ����ʱ�������ظ�����
 * d.�Ͳ͵ĵ�ַ
 * f.�������ܽ��ﵽ50Ԫʱ�����Ͳͷ�
 * �ܽ��=��Ʒ����*����
 * 
 * 3����ʾ������Ϣ
 *������Ʒ��Ϣ
 *��������Ϣ
 *�Ͳ�ʱ��
 *�Ͳ͵�ַ
 *������
 *4���������б�������
*/
public class ChiHuoLlianMeng {





	public static void main(String []args){
		
		String[] names =new String[4];
		String[] canp =new String[4]; //��Ʒ��
		int [] times =new int [4]; // �Ͳ�ʱ��
		String[] diz =new String[4]; //�Ͳ͵�ַ
		int [] zhuangt =new int[4]; //����״̬ 0��ʾԤ����1��ʾ�����
		double []zongje= new double[4];
		
		//��ʼ��2��������Ϣ
		names[0]="����";
		canp[0]="������˿";
		times[0]=12;
		diz[0]="��¥��12��";
		zhuangt [0]=1;
		zongje[0]=24.0;
		
		names[1]="����";
		canp[1]="���մ���";
		times[1]=12;
		diz[1]="��¥��12��";
		zhuangt [1]=0;
		zongje[1]=76.0;
		
		//�������壬һ���Ʒ��Ϣ
		
		String []canp1={"���մ���","������˿","�����߲�"}; //��Ʒ��
		double []danjia={38.0,18.0,10.0}; //����
		int []dianzs=new int [3]; //������
		
		Scanner input =new Scanner(System.in);
		int num=-1; //��¼�û����������
		
		do{
			System.out.println("************************");
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ɾ������");
			System.out.println("4.ǩ�ն���");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			
			System.out.println("��ѡ��");
			int xuanze =input.nextInt();
			boolean isAdd=false; //���ҵ����Բ����ֵʱ��Ϊture������Ϊfalseû�ҵ�
			switch (xuanze) { //ѡ��������Ϣ�ı���
			case 1:
				//��Ҫ����
				System.out.println("*******��Ҫ����********");
				//���Ҳ����λ��
				for(int i=0;i<names.length;i++){
					//����ҵ�Ϊ�յ�λ��ʱ����¼�±�
					if(names[i]==null){
						//��Ϊ�գ���ִ�в���
						isAdd=true; //��¼���ҵ�λ�ã��������ִ��
						System.out.println("���\t����\t����\t������");
						for(int j=0;j<canp1.length;j++){
						double dj1 =danjia[j];
						String dz=dianzs[j]+"��";
						System.out.println((j+1)+"\t"+canp1[j]+"\t"+dj1+"\t"+dz);
						//Ҫ��������ѡ��Ʒ�ı�ż�����
/*						System.out.println("1\t���մ���\t38.0");
						System.out.println("2\t������˿\t20.0");
						System.out.println("3\t�߲�\t\t20.0");*/
						}
						System.out.println("��ѡ��������Ʒ�����");
						int xuanc=input.nextInt();
						//��������ѡ���Ʒ����
						System.out.println("��ѡ�������ķ���");
						int fens=input.nextInt();
						//��������ѡ��������Ʒ����

						
						String canpxinxi =canp[xuanc-1]+""+fens+"��";
						System.out.println("�����붩��������");
						String name =input.next();
						//�����ַ�ȷ�����������
						System.out.println("�������Ͳ�ʱ�䣨1-20�������Ͳͣ���");
						//�������֣�ȷ���Ͳ�ʱ��
						int time=input.nextInt();
						//�����������ˣ�����Ҫ���û��������룬����һ��ѭ��
						while(time<10||time>20){
							System.out.println("������������������10-20֮���������");
							time=input.nextInt();
						}
						System.out.println("�������Ͳ͵�ַ��");
						//�����ַ�ȷ���Ͳ͵�ַ
						String dizhi =input.next();
						double dj1 = 0;
						//��Ҫ�����ܵĲͷ�
						double zongjine=danjia[xuanc-1]*fens;
						//�Ͳͷѣ��ͷѴﵽ50Ԫʱ����6Ԫ�Ͳͷ�
						double songcfei=zongjine>=50?0.0:6.0;
						//��ʾ������Ϣ
						System.out.println("���ͳɹ�");
						System.out.println("�����Ĳ��ǣ�"+canpxinxi);
						System.out.println("�����ˣ�"+name);
						System.out.println("�Ͳ�ʱ��"+time+"��");
						System.out.println("�Ͳ͵�ַ��"+dizhi);
						
						
						System.out.println("�ͷѣ�"+zongjine+"Ԫ"+"���Ͳͷ�"+songcfei+"Ԫ");
						System.out.println("�ܽ��"+(zongjine+songcfei)+"Ԫ");
						names[i]=name;
						canp[i]=canpxinxi;
						times[i]=time;
						diz[i]=dizhi;
						zongje[i]=zongjine+songcfei;
						//���Ѿ��ҵ��Ŀ�λ��ֵ������Ӧ����
						
					/*	String[] names =new String[4];
						String[] canp =new String[4]; //��Ʒ��
						int [] times =new int [4]; // �Ͳ�ʱ��
						String[] diz =new String[4]; //�Ͳ͵�ַ
						int [] zhuangt =new int[4]; //����״̬ 0��ʾԤ����1��ʾ�����
						double []zongje= new double[4];*/
						break;
					}
				}//���û���ҵ�Ϊ�յ�λ�ã�����ʾ��Ϣ
				//Ҫ����ȫ��ѭ���󣬲Ÿ�����ʾ����������if����з����ж�
				if(!isAdd){
					System.out.println("�Բ������Ĳʹ�����");
				}
				break;
			case 2:
				//�塢��ʾÿ��������Ϣ����������Ĺ��ܣ�
//				���  ������Ʒ��Ϣ  ���������� �Ͳ�ʱ�� �Ͳ͵�ַ  ״̬������� ��Ԥ��0�� �ܽ��
				System.out.println("�鿴�ʹ�");
				System.out.println("���\t������\t������Ʒ��Ϣ\t�Ͳ�ʱ��\t�Ͳ͵�ַ\t\t�ܽ��\t״̬");
//				��������
				for(int i=0;i<names.length;i++){
					//�ж��ⲿ�������Ƿ�Ϊ��,�����Ϊ�����������
					if(names[i]!=null){
						String  time =times[i]+"��";
						String  zongjine=zongje[i]+"Ԫ";
						//��Ԫ���㷨
						String  zt=zhuangt[i]==0?"��Ԥ��":"�����";
						//�±��1Ϊ��������ţ��±�Ĭ�ϴ�0��ʼ
						System.out.println((i+1)+"\t"+names[i]+"\t"+canp[i]+"\t\t"+time+"��\t"+diz[i]+
								"\t"+zongjine+"\t"+zt);
					}
				}
				//�鿴�ʹ�
				
				break;
				
				

			case 3:
				System.out.println("*******ɾ������******");
				System.out.println("��������Ҫɾ���Ķ������");
				//�ߡ�ɾ������
				//1������Ҫɾ���Ķ����ţ���1��ʼ��
				//2��ѭ������������������
				//a.�ҵ���������ǩ�գ�ִ��ɾ������
				//b.�ҵ��˶�������δǩ�գ���ʾ��Ϣ����ɾ
				//c.δ�ҵ����ᵥ����ʾ��Ϣû�ҵ�
				//3.ɾ��������ѭ����λ����Ҫɾ����Ԫ�صĺ���һ����ʼ��ֱ����������һ��Ԫ��������ǰ�ƶ���λ��������
					int xuhao1 =input.nextInt();
					//���趨һ��������¼Ҫɾ���Ķ��������
					int scxuhao= -1;//���ڴ���ɾ���������±�ĳ�ʼֵ
					boolean isDelFind=false; //��־Ϊ��¼�Ƿ��ҵ�������������true�����ҵ� ��֮��û�ҵ�
					for(int i=0;i<names.length;i++){
						if(names[i]!=null&&zhuangt[i]==1&&xuhao1==i+1){
							scxuhao=i;//�Ѿ��ҵ���Ҫɾ�����±꣬����ѭ��
							isDelFind=true;
							break;
						}else if(names[i]!=null&&zhuangt[i]==0&&xuhao1==i+1){
							System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ��");
							isDelFind=true;
							//�ҵ��ˣ���Ҫ����ѭ��
							break;
						}
						
					}//��ǩ�ղ�࣬û�ҵ��Ķ�����Ҫ��ѭ������У���Ҫ�õ��ж����
					if(!isDelFind){
						System.out.println("�Բ��𣬴�������������");
					}//ɾ��������ʼִ�У��������жϣ�����ҵ���Ҫɾ���Ķ����±겻���ڳ�ʼֵ-1����ʼִ��ɾ������
					if(scxuhao!=-1){
						//��Ҫɾ����Ԫ�صĺ���һ����ʼ��ֱ����������һ��Ԫ��������ǰ�ƶ���λ��
						for(int i=scxuhao+1;i<=names.length-1;i++){
							names[i-1]=names[i];//�����е��±���ǰһ��λ���ƶ�������
							//ɾ��������ζ�Ÿ����������Ϣ��Ҫ������ǰ�ƶ�������
							canp[i-1]=canp[i];
							times[i-1]=times[i];
							diz[i-1]=diz[i];
							zhuangt[i-1]=zhuangt[i];
							
							
						}
						//������, ��ʵ���ǰ������еĵ�ǰ��ֵ���Ĭ��ֵ
						names[names.length-1]=null;
						canp[canp.length-1]=null;
						times[times.length-1]=0;
						diz[diz.length-1]=null;
						zhuangt[zhuangt.length-1]=0;
						System.out.println("ɾ���ɹ�");
					}
					
				break;
			case 4:
				System.out.println("**********ǩ�ն���********");
				System.out.println("��������Ҫǩ�յĶ������");
				//�趨һ���������ڴ洢����������
				int xuhao =input.nextInt();
//				����Ҫ���û�����һ��ǩ�յĶ������
//				���ҵ�����������ѭ��������

				//ǩ�ն���
				boolean isFind=false; //��־Ϊ��¼�Ƿ��ҵ�������������true�����ҵ� ��֮��û�ҵ�
				for(int i=0;i<names.length;i++){
					if(names[i]!=null&&zhuangt[i]==1&&xuhao==i+1){
//						1���ҵ����±겻Ϊ�գ�����״̬������ɣ��Ѿ�ǩ����ϣ������ҵ����±����Ĭ��ֵ+1����ʾ�����ٴ�ǩ��
						System.out.println("��ѡ��Ķ�����ǩ�գ������ٴ�ǩ��");
						//���ѭ��������ѭ��
						isFind=true;
						break;
					}else if(names[i]!=null&&zhuangt[i]==0&&xuhao==i+1){
						zhuangt[i]=1;//״ֵ̬�޸�Ϊ1��Ȼ������ѭ��
						System.out.println("���Ķ�����ǩ�ճɹ�");
//						2���ҵ���״̬����Ԥ����δǩ�գ�������ǩ��
						isFind=true;
						break;
					}
				}
				if(!isFind){
					System.out.println("�Բ���û���ҵ���������");
				}
				//3��û���ҵ�����:������ʾû���ҵ�����	
				//������Ľ�����ܾ����Ƿ����Ѷ����֮��ģ�����Ҫд��forѭ��֮�⣬����ÿ��ѭ�������ȡ
				//�����жϣ����û���ҵ�������������ʾû�ҵ��Ľ��
				
				break;
			case 5:
				System.out.println("******��Ҫ����******");
				//��ʾ�����޵Ĳ�Ʒ�б�
				System.out.println("���\t����\t����\t������");
				for(int j=0;j<canp1.length;j++){
				double dj1 =danjia[j];
				String dz=dianzs[j]+"��";
				System.out.println((j+1)+"\t"+canp1[j]+"\t"+dj1+"\t"+dz);
				//������޵Ĳ�Ʒ���
				
				//��ʾ���޺�Ľ��
				//��Ҫ����
				}System.out.println("��������Ҫ���޵Ĳ�Ʒ���");
				int dzs =input.nextInt();
				//��ʾ���޳ɹ�,��ֵ+1
				dianzs[dzs-1]++;
				System.out.println("���޳ɹ�");
				System.out.println(canp1[dzs-1]+" "+dianzs[dzs-1]+"��");
				break;
			case 6:
				//�˳�ϵͳ
				
				

			default:
				
				break;
			}
			if(xuanze<1||xuanze>5){
				break;
			}else{
				
			
			
			//���û�����ı��Ϊ1-5������ʱ���˳�ѭ�������򽫻���ʾ����ж���ʾ0����
			//��ʾ����0
			System.out.println("����0����");
			num=input.nextInt();
			}//����0��ʱ���˳�ѭ��
		}while(num==0);
		System.out.println("лл�ݹˣ���ӭ�´ι���");
		
	}
}
