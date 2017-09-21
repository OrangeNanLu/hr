package com.lianxi.cn;

public class DeptTest {
	private int deptno;
	private String dname;
	private String loc;
	private EmpTest emptests[] ;
	private EmpTest mgr;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public EmpTest[] getEmptests() {
		return emptests;
	}
	public void setEmptests(EmpTest[] emptests) {
		this.emptests = emptests;
	}
	public EmpTest getMgr() {
		return mgr;
	}
	public void setMgr(EmpTest mgr) {
		this.mgr = mgr;
	}
	public DeptTest(){}
	public DeptTest(int deptno,String dname,String loc){
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public String getInfo(){
		return "部门编号："+this.deptno+"，名称："+this.dname+"，位置："+this.loc ;
	}
}
