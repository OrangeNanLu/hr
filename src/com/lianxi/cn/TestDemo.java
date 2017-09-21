package com.lianxi.cn;

public class TestDemo {
	public static void main(String[] args) {
		DeptTest dept = new DeptTest(10,"ACEJACK","NewYork");
		EmpTest ea = new EmpTest(7697,"BRUCE","ENGER",8000.0,0.0);
		EmpTest eb = new EmpTest(7697,"FROD","MANAGER",8000.0,0.0);
		EmpTest ec = new EmpTest(7697,"KING","PRESIDENT",8000.0,0.0);
		ea.setDepttest(dept);
		eb.setDepttest(dept);
		ec.setDepttest(dept);
		dept.setEmptests(new EmpTest[]{ea,eb,ec});
	}
}
