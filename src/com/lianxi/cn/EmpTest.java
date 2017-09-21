package com.lianxi.cn;

public class EmpTest {
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	private DeptTest depttest;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public DeptTest getDepttest() {
		return depttest;
	}
	public void setDepttest(DeptTest depttest) {
		this.depttest = depttest;
	}
	public EmpTest(){}
	public EmpTest(int empno,String ename,String job,double sal,double comm) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
	}
	public String getInfo(){
		return "雇员编号："+this.empno+"，姓名："+this.ename+"，职位"+this.job+"，工资："+this.sal
				+"，佣金："+this.comm ;
	}
}
