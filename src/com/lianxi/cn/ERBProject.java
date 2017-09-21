package com.lianxi.cn;

class Enjoy {
	private String bname; //部门名称
	private int bnumber; //部门人数
	private String bleder; //部门领导人姓名
	private String jobdate;//日常工作
	private double bcomm; //部门奖金
	public Enjoy(){}
	public Enjoy(String bname,int bnumber,String bleder,String jobdate,double bcomm){
		this.bname = bname;
		this.bnumber = bnumber;
		this.bleder = bleder;
		this.jobdate = jobdate;
		this.bcomm = bcomm;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBnumber() {
		return bnumber;
	}
	public void setBnumber(int bnumber) {
		this.bnumber = bnumber;
	}
	public String getBleder() {
		return bleder;
	}
	public void setBleder(String bleder) {
		this.bleder = bleder;
	}
	public String getJobdate() {
		return jobdate;
	}
	public void setJobdate(String jobdate) {
		this.jobdate = jobdate;
	}
	public double getBcomm() {
		return bcomm;
	}
	public void setBcomm(double bcomm) {
		this.bcomm = bcomm;
	}
	public String getInfo(){
		return "部门名称："+this.bname+
				"部门人数："+this.bnumber+
				"部门领导人姓名："+this.bleder+
				"部门日常工作："+this.jobdate+
				"部门奖金："+this.bcomm;
	}
}
public class ERBProject {
	public static void main(String[] args) {
		Enjoy e = new Enjoy("JavaWeb开发部",7,"兴华","SSM框架开发，模块开发",78696);
		System.out.println(e.getInfo());
	}
}
