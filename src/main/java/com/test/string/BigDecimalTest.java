package com.test.string;

import java.math.BigDecimal;

public class BigDecimalTest {
	public static void main(String[] args) {
		test06();
	}

	public static final String merAmtToAmount(String amt) {
		BigDecimal num = new BigDecimal(amt);
		return num.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP).toString();
	}

	/**
	 * 参数类型为double的构造方法的结果有一定的不可预知性,通常建议优先使用String构造方法
	 * Double.toString("")
	 */
	public static void test01() {
		BigDecimal stringDecimal = new BigDecimal("1.55");
		System.out.println("stringDecimal:" + stringDecimal);
		BigDecimal doubleDecimal = new BigDecimal(1.55); // double
		System.out.println("doubleDecimal:" + doubleDecimal);
		BigDecimal doubleTStringDecimal = new BigDecimal(Double.toString(1.55));
		System.out.println("doubleDecimal:" + doubleTStringDecimal);
	}
	
	/**
	 * 四舍五入
	 */
	public static void test03(){
		BigDecimal bd = new BigDecimal("1.238983");
		System.out.println(bd.setScale(2, BigDecimal.ROUND_HALF_UP));
	}
	
	/**
	 * 加法
	 */
	public static void test02(){
		BigDecimal a = new BigDecimal("1.55");
		BigDecimal b = new BigDecimal("1.55");
		a = a.add(b);
		System.out.println(a);
	}
	
	/**
	 * 减法
	 */
	public static void test04(){
		BigDecimal a = new BigDecimal("3.32222");
		BigDecimal b = new BigDecimal("0.11221");
		System.out.println(a.subtract(b));
	}
	
	/**
	 * 乘法
	 */
	public static void test05(){
		BigDecimal a = new BigDecimal("3.32222");
		BigDecimal b = new BigDecimal("0.11221");
		System.out.println(a.multiply(b));
	}
	
	/**
	 * 除法(可以用户精确小数点)
	 */
	public static void test06(){
		BigDecimal a = new BigDecimal("10");
		BigDecimal b = new BigDecimal("2");
		System.out.println(a.divide(b, 2, BigDecimal.ROUND_HALF_UP));
	}
		
}