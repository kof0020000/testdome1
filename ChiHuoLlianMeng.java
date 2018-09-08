import java.util.Scanner;

/*
 * 四、我要订餐
 * 1、查找插入位置
 * 找要插入的位置，循环遍历订餐人第一个为空的位置
 * 如果找到了，则此位置是要插入数据的位置
 * 如果没找到，则显示餐袋已满
 * 2、执行添加数据操作
 * a.显示所有课供选择的残品信息
 * 用户可选择餐品编号及份数
 * b.要求输入订餐人的姓名
 * c.要求输入送餐时间（10-20之间）
 * 当输入的信息有误时，可以重复输入
 * d.送餐的地址
 * f.订单的总金额达到50元时，免送餐费
 * 总金额=餐品单价*份数
 * 
 * 3、显示订单信息
 *所定餐品信息
 *订餐人信息
 *送餐时间
 *送餐地址
 *付款金额
 *4、向数组中保存数据
*/
public class ChiHuoLlianMeng {





	public static void main(String []args){
		
		String[] names =new String[4];
		String[] canp =new String[4]; //餐品名
		int [] times =new int [4]; // 送餐时间
		String[] diz =new String[4]; //送餐地址
		int [] zhuangt =new int[4]; //订单状态 0表示预定，1表示已完成
		double []zongje= new double[4];
		
		//初始化2条订单信息
		names[0]="张晴";
		canp[0]="鱼香肉丝";
		times[0]=12;
		diz[0]="鼓楼区12号";
		zhuangt [0]=1;
		zongje[0]=24.0;
		
		names[1]="张晴";
		canp[1]="红烧带鱼";
		times[1]=12;
		diz[1]="鼓楼区12号";
		zhuangt [1]=0;
		zongje[1]=76.0;
		
		//数据主体，一组餐品信息
		
		String []canp1={"红烧带鱼","鱼香肉丝","新鲜蔬菜"}; //菜品名
		double []danjia={38.0,18.0,10.0}; //单价
		int []dianzs=new int [3]; //点赞数
		
		Scanner input =new Scanner(System.in);
		int num=-1; //记录用户输入的数字
		
		do{
			System.out.println("************************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.删除订单");
			System.out.println("4.签收订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			
			System.out.println("请选择：");
			int xuanze =input.nextInt();
			boolean isAdd=false; //当找到可以插入的值时则为ture，否则为false没找到
			switch (xuanze) { //选定接受信息的变量
			case 1:
				//我要订餐
				System.out.println("*******我要订餐********");
				//查找插入的位置
				for(int i=0;i<names.length;i++){
					//如果找到为空的位置时，记录下标
					if(names[i]==null){
						//若为空，则执行操作
						isAdd=true; //记录已找到位置，插入操作执行
						System.out.println("序号\t菜名\t单价\t点赞数");
						for(int j=0;j<canp1.length;j++){
						double dj1 =danjia[j];
						String dz=dianzs[j]+"赞";
						System.out.println((j+1)+"\t"+canp1[j]+"\t"+dj1+"\t"+dz);
						//要求输入所选餐品的编号及份数
/*						System.out.println("1\t红烧带鱼\t38.0");
						System.out.println("2\t鱼香肉丝\t20.0");
						System.out.println("3\t蔬菜\t\t20.0");*/
						}
						System.out.println("请选择所定餐品的序号");
						int xuanc=input.nextInt();
						//输入数字选择餐品类型
						System.out.println("请选择所定的份数");
						int fens=input.nextInt();
						//输入数字选择所定餐品数量

						
						String canpxinxi =canp[xuanc-1]+""+fens+"份";
						System.out.println("请输入订餐人姓名");
						String name =input.next();
						//输入字符确定点餐人姓名
						System.out.println("请输入送餐时间（1-20点整点送餐）：");
						//输入数字，确定送餐时间
						int time=input.nextInt();
						//如果输入错误了，则需要让用户重新输入，建立一个循环
						while(time<10||time>20){
							System.out.println("您的输入有误，请输入10-20之间的整数：");
							time=input.nextInt();
						}
						System.out.println("请输入送餐地址：");
						//输入字符确定送餐地址
						String dizhi =input.next();
						double dj1 = 0;
						//还要计算总的餐费
						double zongjine=danjia[xuanc-1]*fens;
						//送餐费，餐费达到50元时，免6元送餐费
						double songcfei=zongjine>=50?0.0:6.0;
						//显示订单信息
						System.out.println("订餐成功");
						System.out.println("您订的餐是："+canpxinxi);
						System.out.println("订单人："+name);
						System.out.println("送餐时间"+time+"点");
						System.out.println("送餐地址："+dizhi);
						
						
						System.out.println("餐费："+zongjine+"元"+"，送餐费"+songcfei+"元");
						System.out.println("总金额"+(zongjine+songcfei)+"元");
						names[i]=name;
						canp[i]=canpxinxi;
						times[i]=time;
						diz[i]=dizhi;
						zongje[i]=zongjine+songcfei;
						//给已经找到的空位赋值插入相应数据
						
					/*	String[] names =new String[4];
						String[] canp =new String[4]; //餐品名
						int [] times =new int [4]; // 送餐时间
						String[] diz =new String[4]; //送餐地址
						int [] zhuangt =new int[4]; //订单状态 0表示预定，1表示已完成
						double []zongje= new double[4];*/
						break;
					}
				}//如果没有找到为空的位置，则提示信息
				//要遍历全部循环后，才给出提示，而不是在if里进行否则判断
				if(!isAdd){
					System.out.println("对不起，您的餐袋已满");
				}
				break;
			case 2:
				//五、显示每条订单信息（遍历数组的功能）
//				序号  所定残品信息  订餐人姓名 送餐时间 送餐地址  状态（已完成 已预订0） 总金额
				System.out.println("查看餐袋");
				System.out.println("序号\t订餐人\t所定餐品信息\t送餐时间\t送餐地址\t\t总金额\t状态");
//				遍历数组
				for(int i=0;i<names.length;i++){
					//判断这部分数据是否为空,如果不为空则继续遍历
					if(names[i]!=null){
						String  time =times[i]+"点";
						String  zongjine=zongje[i]+"元";
						//三元计算法
						String  zt=zhuangt[i]==0?"已预订":"已完成";
						//下标加1为正常的序号，下标默认从0开始
						System.out.println((i+1)+"\t"+names[i]+"\t"+canp[i]+"\t\t"+time+"点\t"+diz[i]+
								"\t"+zongjine+"\t"+zt);
					}
				}
				//查看餐袋
				
				break;
				
				

			case 3:
				System.out.println("*******删除订单******");
				System.out.println("请输入您要删除的订单序号");
				//七、删除订单
				//1、输入要删除的订单号（从1开始）
				//2、循环遍历查找这条订单
				//a.找到订单，已签收，执行删除操作
				//b.找到此订单，且未签收：提示信息不让删
				//c.未找到此提单：提示信息没找到
				//3.删除操作（循环移位）从要删除的元素的后面一个开始，直到数组的最后一个元素依次向前移动移位，最后清空
					int xuhao1 =input.nextInt();
					//先设定一个变量记录要删除的订单号序号
					int scxuhao= -1;//用于储存删除订单的下标的初始值
					boolean isDelFind=false; //标志为记录是否找到了这条订单，true：已找到 反之则没找到
					for(int i=0;i<names.length;i++){
						if(names[i]!=null&&zhuangt[i]==1&&xuhao1==i+1){
							scxuhao=i;//已经找到了要删除的下标，跳出循环
							isDelFind=true;
							break;
						}else if(names[i]!=null&&zhuangt[i]==0&&xuhao1==i+1){
							System.out.println("您选择的订单未签收，不能删除");
							isDelFind=true;
							//找到了，需要跳出循环
							break;
						}
						
					}//与签收差不多，没找到的订单需要在循环外进行，需要用到判断语句
					if(!isDelFind){
						System.out.println("对不起，此条订单不存在");
					}//删除操作开始执行，先做个判断，如果找到的要删除的订单下标不等于初始值-1，则开始执行删除操作
					if(scxuhao!=-1){
						//从要删除的元素的后面一个开始，直到数组的最后一个元素依次向前移动移位，
						for(int i=scxuhao+1;i<=names.length-1;i++){
							names[i-1]=names[i];//数组中的下标向前一个位置移动并覆盖
							//删除操作意味着各类数组的信息都要跟着向前移动并覆盖
							canp[i-1]=canp[i];
							times[i-1]=times[i];
							diz[i-1]=diz[i];
							zhuangt[i-1]=zhuangt[i];
							
							
						}
						//最后清空, 其实就是把数组中的当前数值变成默认值
						names[names.length-1]=null;
						canp[canp.length-1]=null;
						times[times.length-1]=0;
						diz[diz.length-1]=null;
						zhuangt[zhuangt.length-1]=0;
						System.out.println("删除成功");
					}
					
				break;
			case 4:
				System.out.println("**********签收订单********");
				System.out.println("请输入您要签收的订单序号");
				//设定一个变量用于存储这个变量序号
				int xuhao =input.nextInt();
//				六、要求用户输入一个签收的订单序号
//				查找到这条订单（循环遍历）

				//签收订单
				boolean isFind=false; //标志为记录是否找到了这条订单，true：已找到 反之则没找到
				for(int i=0;i<names.length;i++){
					if(names[i]!=null&&zhuangt[i]==1&&xuhao==i+1){
//						1、找到，下标不为空，并且状态是已完成（已经签收完毕）并且找到了下标序号默认值+1：提示不能再次签收
						System.out.println("您选择的订单已签收，不能再次签收");
						//完成循环，跳出循环
						isFind=true;
						break;
					}else if(names[i]!=null&&zhuangt[i]==0&&xuhao==i+1){
						zhuangt[i]=1;//状态值修改为1，然后跳出循环
						System.out.println("您的订单已签收成功");
//						2、找到，状态是已预订（未签收）：可以签收
						isFind=true;
						break;
					}
				}
				if(!isFind){
					System.out.println("对不起，没有找到这条订单");
				}
				//3、没有找到订单:返回提示没有找到订单	
				//遍历后的结果才能决定是否是已定情况之外的，所以要写在for循环之外，避免每次循环都会读取
				//条件判断：如果没有找到这条订单则提示没找到的结果
				
				break;
			case 5:
				System.out.println("******我要点赞******");
				//显示供点赞的餐品列表
				System.out.println("序号\t菜名\t单价\t点赞数");
				for(int j=0;j<canp1.length;j++){
				double dj1 =danjia[j];
				String dz=dianzs[j]+"赞";
				System.out.println((j+1)+"\t"+canp1[j]+"\t"+dj1+"\t"+dz);
				//输入点赞的餐品序号
				
				//显示点赞后的结果
				//我要点赞
				}System.out.println("请输入您要点赞的餐品序号");
				int dzs =input.nextInt();
				//提示点赞成功,数值+1
				dianzs[dzs-1]++;
				System.out.println("点赞成功");
				System.out.println(canp1[dzs-1]+" "+dianzs[dzs-1]+"赞");
				break;
			case 6:
				//退出系统
				
				

			default:
				
				break;
			}
			if(xuanze<1||xuanze>5){
				break;
			}else{
				
			
			
			//当用户输入的编号为1-5的数字时，退出循环，否则将会提示输出判定提示0返回
			//提示输入0
			System.out.println("输入0返回");
			num=input.nextInt();
			}//不是0的时候退出循环
		}while(num==0);
		System.out.println("谢谢惠顾，欢迎下次光临");
		
	}
}
