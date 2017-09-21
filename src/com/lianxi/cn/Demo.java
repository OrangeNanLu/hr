package com.lianxi.cn;

class Armes {
	private String armsname; //部队番号
	private String armslevel; //部队等级
	private double weapeon; //武器
	private int peoplenumber; //部队人数
	private int killcome; //杀敌人数
	public Armes(){}
	public Armes(String armsname,String armslevel,double weapeon,int peoplenumber,int killcome){
		this.armsname = armsname;
		this.armslevel = armslevel;
		this.weapeon = weapeon;
		this.peoplenumber = peoplenumber;
		this.killcome = killcome;
	}
	public String getArmsname() {
		return armsname;
	}
	public void setArmsname(String armsname) {
		this.armsname = armsname;
	}
	public String getArmslevel() {
		return armslevel;
	}
	public void setArmslevel(String armslevel) {
		this.armslevel = armslevel;
	}
	public double getWeapeon() {
		return weapeon;
	}
	public void setWeapeon(double weapeon) {
		this.weapeon = weapeon;
	}
	public int getPeoplenumber() {
		return peoplenumber;
	}
	public void setPeoplenumber(int peoplenumber) {
		this.peoplenumber = peoplenumber;
	}
	public int getKillcome() {
		return killcome;
	}
	public void setKillcome(int killcome) {
		this.killcome = killcome;
	}
	public String getInfo(){
		return "部队番号："+this.armsname+
				"，部队等级："+this.armslevel+
				"，武器数量："+this.weapeon+
				"，部队人数："+this.peoplenumber+
				"，杀敌人数："+this.killcome;
	}
}
public class Demo {
	public static void main(String[] args) {
		Armes a = new Armes("935研究部队","7级部队",7896969556.28,669966,777777);
		System.out.println(a.getInfo());
	}
}
