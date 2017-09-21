package com.lianxi.cn;

class Person {
	private String name;
	private int age;
	private String group;
	private double height;
	private String sex;
	public Person(){}
	public Person(String name,int age,String group,double height,String sex) {
		this.name = name;
		this.age = age;
		this.group = group;
		this.height = height;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getInfo(){
		return "姓名："+this.name+
				"，年龄："+this.age+
				"，班级："+this.group+
				"，身高："+this.height+
				"，性别："+this.sex;
	}
}
public class MathTest {
	public static void main(String[] args) {
		Person p = new Person("南鲁",28,"三年二班",182,"男");
		System.out.println(p.getInfo());
	}
}