package bin;
/*
 * 取反 ~
 * 与 &
 * 或 |
 * 左移位运算 <<
 * 数学右移位 >>
 * 逻辑右移位 >>>
 * 
 * 位运算的用途：文字的编码
 * 字符：char 类型 16位
 * 互联网数据 ：8 位
 * 互联网传送字符必须将字符拆分为byte(8位)进行传送。
 * 将字符拆分为字节的拆分方案称为字符的编码
 * 最简单的拆分方案：UTF-16BE,将字符一分为二，无论中英文都是2字节编码，
 * 英文浪费一个字节，只能支持65535个字符。
 * 
 * Unicode：一个符号一个不重复的数，已经编码了10万+个符号了。
 * Java char类型支持编码数量：65535个字符
 * Java 建议利用int类型支持扩展的Unicode。
 * 
 * UTF-8：变长编码，英文一个字节，中文三个字节,支持4字节编码，支持100万+字符。
 * 一字节编码：0xxxxxxx
 * 两字节编码：110xxxxx，10xxxxxx
 * 三字节编码：1110xxxx，10xxxxxx，10xxxxxx。x存储数字
 * 四字节编码：11110xxx，10xxxxxx，10xxxxxx，10xxxxxx。
 * 
 */
public class test3 {
	public static void main(String[] args) {
		/*
		 * 
		 * 与运算&(逻辑乘法)
		 * 0 & 0 = 0
		 * 0 & 1 = 0
		 * 1 & 0 = 0
		 * 1 & 1 = 1
		 * 
		 * 两个数，对齐位置，上下计算与。
		 * n =         00000000,  00000000, 01001110, 00011101
		 * m=         00000000,  00000000, 00000000, 00011111
		 * k=n&m   00000000,  00000000, 00000000, 00011101
		 * 
		 * 用于切
		 */
		
		
		int n  = 0x4e2d;
		int m = 0x3f;
		int k = n&m;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		System.out.println(Integer.toBinaryString(k));
		/*
		 * 
		 * 或运算| (逻辑加)
		 * 规则：
		 * 0|0=0
		 * 0|1=1
		 * 1|0=1
		 * 1|1=1
		 * n =         00000000,  00000000, 01001110, 1000000
		 * m=         00000000,  00000000, 00000000, 00101011
		 * k=n&m   00000000,  00000000, 00000000, 10101011
		 * 
		 * 用于合并
		 */
		
		int n1 = 0x80;
		int n2 = 0x2b;
		int n3 = n1|n2;
		System.out.println(Integer.toBinaryString(n1));
		System.out.println(Integer.toBinaryString(n2));
		System.out.println(Integer.toBinaryString(n3));
		
		
	
	}
}
