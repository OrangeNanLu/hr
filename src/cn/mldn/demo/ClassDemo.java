package cn.mldn.demo;

import cn.mldn.vo.Dept;

public class ClassDemo {
	public static void main(String[] args) throws Exception {
		Class<?> cls = Class.forName("cn.mldn.vo.Dept");
		Object obj = cls.newInstance();
		System.out.println(obj);
	}
}
