package test_Exception;

import java.io.*;

//JAVA异常处理
public class Test_Ex {

	public static void main(String[] args) {
		/*int arry[] = {1,2,5,7};
		System.out.println(arry[2]);
		
		try {
			System.out.println(2/0);   //try{}里放的是有可能发生异常的语句，catch{}是应对方法
		}catch (ArithmeticException ae) {  //当某一异常对象发生后，该异常对象会封装到ae对象里，初始化ae，从而调用了catch方法
			System.out.println("出错了，是否向管理员发送错误信息？");
			ae.printStackTrace();  //打印错误的堆栈信息，其实也就是出错时，java提供的信息
		}*/
		
		FileInputStream in = null;
		try {
			in = new FileInputStream("myfile.txt"); //会抛出FileNotFoundException异常
			int b;
			b = in.read();  //read()会抛出IOException异常  read()方法返回的是一个int数据类型
			while(b!=-1) {  //读取结束时，read()方法返回-1
				System.out.println((char)b);  //为什么要强制转换成字符
				System.out.println("1");
				//b = in.read();
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("2");
		
		} catch (IOException e) {
			//System.out.println(e.getMessage());
			System.out.println("3");
		
		} finally {  //无论try所指定的代码块中是否抛出例外，也就是异常，finally所指定的代码都要被执行。
			try {
				in.close();
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("4");
			}
		}
	}
}
