package test_Exception;

import java.io.*;

//JAVA�쳣����
public class Test_Ex {

	public static void main(String[] args) {
		/*int arry[] = {1,2,5,7};
		System.out.println(arry[2]);
		
		try {
			System.out.println(2/0);   //try{}��ŵ����п��ܷ����쳣����䣬catch{}��Ӧ�Է���
		}catch (ArithmeticException ae) {  //��ĳһ�쳣�������󣬸��쳣������װ��ae�������ʼ��ae���Ӷ�������catch����
			System.out.println("�����ˣ��Ƿ������Ա���ʹ�����Ϣ��");
			ae.printStackTrace();  //��ӡ����Ķ�ջ��Ϣ����ʵҲ���ǳ���ʱ��java�ṩ����Ϣ
		}*/
		
		FileInputStream in = null;
		try {
			in = new FileInputStream("myfile.txt"); //���׳�FileNotFoundException�쳣
			int b;
			b = in.read();  //read()���׳�IOException�쳣  read()�������ص���һ��int��������
			while(b!=-1) {  //��ȡ����ʱ��read()��������-1
				System.out.println((char)b);  //ΪʲôҪǿ��ת�����ַ�
				System.out.println("1");
				//b = in.read();
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("2");
		
		} catch (IOException e) {
			//System.out.println(e.getMessage());
			System.out.println("3");
		
		} finally {  //����try��ָ���Ĵ�������Ƿ��׳����⣬Ҳ�����쳣��finally��ָ���Ĵ��붼Ҫ��ִ�С�
			try {
				in.close();
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("4");
			}
		}
	}
}
