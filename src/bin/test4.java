package bin;

import java.io.UnsupportedEncodingException;

public class test4 {
public static void main(String[] args) throws UnsupportedEncodingException {
	
	//编码UTF-8的最后一个字节。运算顺序&比|优先
			int c = '中';
			//c& 0x3f
			//0x80|c&0x3f
			System.out.println(Integer.toBinaryString(c));
			System.out.println(Integer.toBinaryString(c& 0x3f));
			System.out.println(Integer.toBinaryString(0x80|c&0x3f));
			
	
		/*
		 * 右移位计算，删除右边，左边补0
		 * n =                   00000000,  00000000, 01001110, 00101101
		 * m= n>>>6        00000000,  00000000, 00000001, 00111000
		 * 
		 * 
		 */		
			int n = 0x4e2d;
			int m = n>>>6;
			System.out.println(Integer.toBinaryString(n));
			System.out.println(Integer.toBinaryString(m));
	
		//编码UTF-8的最后一个字节。
		int b3 = 0x80|c&0x3f;
		//编码UTF-8的倒数第二个字节。
		int b4 =0x80|(c>>>6)&0x3f;
		//编码UTF-8的第一个字节。
		int b5 = 0xe0|(c>>>12)&0xf;
		//按照utf-8规则解码为字符串
		byte b [] = {(byte)b5,(byte)b4,(byte)b3};//byte数组
		String s= new String(b,"utf-8");//解码API
		System.out.println(s);//中
			
		int cc =((b5 &0xf)<<12)|((b4 & 0x3f)<<6)|(b3&0x3f);
		char ch = (char)cc;
		System.out.println(ch);
				
		/*
		 * 案例：将字符数据(Unicode)编码为UTF-8编码 
		 */
			
			
		/*
		 * 案例：将UTF-8编码解码为字符数据(Unicode)
		 */
}
}
