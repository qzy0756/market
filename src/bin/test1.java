package bin;

public class test1 {
public static void main(String[] args) {
	
//	
//	for (int i = 0; i <= 50; i++) {
//		System.out.println(Integer.toBinaryString(i)+","+i);
	
//	int a = 0x693ba5e5;
//	System.out.println(Integer.toBinaryString(a));
	//将二进制缩写成 16进制
	//0110,1001,0011,1011,1010,0101,1110,0101
	//6       9       3       b       a       5       e       5
	 
//	for (int i = -50; i <=50; i++) {
//		System.out.println(Integer.toBinaryString(i)+", "+i);
//	}
	
	int max =Integer.MAX_VALUE;
	int min = Integer.MIN_VALUE;
	System.out.println(Integer.toBinaryString(max)+", "+ max);
	System.out.println(Integer.toBinaryString(min)+", "+ min);
	//0111，1111，1111，1111，1111，1111，1111，1111
	//0000，0000，0000，0000，0000，0000，0000，0000
	long maxL =Long.MAX_VALUE;
	long minL = Long.MIN_VALUE;
	System.out.println(Long.toBinaryString(maxL)+", "+ maxL);
	System.out.println(Long.toBinaryString(minL)+", "+ minL);
	//7FFF,FFFF,FFFF,FFFFL;---maxL
	//8000,000,000,000;----minL
	

	
	
	
	
	}

}
