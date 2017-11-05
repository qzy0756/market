package bin;

public class test5 {
public static void main(String[] args) {
	/*
	 * 
	 * 移位计算的数学意义--移动小数点运算
	 * 10进制时候数字向左移动一次数字扩大10倍
	 * 2进制时候数字向左移动一次数字扩大2倍
	 * 
	 * 
	 */
	int n = 50;
	int m = n<<1;
	int k = n<<2;
	System.out.println(Integer.toBinaryString(n));
	System.out.println(Integer.toBinaryString(m));
	System.out.println(Integer.toBinaryString(k));
	System.out.println(n);
	System.out.println(m);
	System.out.println(k);
	
	/*面试题目：
	 * 优化计算n*8为？(n<<3)
	 * 移位计算远远快于乘法计算
	 */
	
	/*
	 * 区别 >>>       >>
	 * 
	 * 数学右移位>>：其结果满足数学规律，整除向小方向取整。负数移位，高位补1，结果还是负数。如50/2/2=12。-50/2/2=-13
	 * 逻辑右移位 >>>：无论正负高位都补0！一般字符编码时候用
	 *
	 */
	
	/*面试题目
	 * 优化计算表达式 n=n+n/2 (n>0)
	 * n+=n>>1
	 * 
	 */
	
	int t= 2;
	System.out.println(t+=t>>1);
	
}
}
