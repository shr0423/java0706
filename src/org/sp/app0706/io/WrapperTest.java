package org.sp.app0706.io;

public class WrapperTest {
	
	
	public static void main(String[] args) {
		String x="3";
		String y="5";
		
		int k=0;//자바의 기본자료형을 사용하여 정수0을대입
		Integer i=5;//자바의 객체자료형 중 Interger자료형으로
						//정수5를 대입
		//객체임에도 불구하고 위처럼 일반변수 대입방식을 지원하는
		//기법을 일반데이터를 객체로 감쌌다고 하여 Boxing이라 한다

		//자바의 모든 기본자료형마다 1:1대응되는 클래스를 가리켜 wrapper클래스라 부르며
		//기본자료형이 아닌 객체자료형이므로 기본 자료형보다 더 많은 처리를지원한다.
		//왜? 변수와 메서드를 가지고 잇으므로
		//byte:Byte,short:Short,int:Integer,long:Long,float:Float,double:Double
		
		//wrapper클래스의사용목적
		//1)기본자료형으로는할 수없는 더 많은 처리를 위해 사용
		//2)기본자료형과 객체자료형간의 형변환을 지원하기위해사용
		
		int p=6;
		String str=Integer.toString(p);//"6"
		System.out.println(i.parseInt(x)+i.parseInt(y));
	}
}
