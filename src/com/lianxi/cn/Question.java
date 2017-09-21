package com.lianxi.cn;

class DRAKTouble {
	private String ChaoXiao;
	private String XianHai;
	private String QiangQian;
	private String BiePaoQi;
	private String Damn;
	private String LvLe;
	private String ZiSha;
	private String NoMomery;
	public DRAKTouble(){}
	public DRAKTouble(String ChaoXIao,String XianHai,String QaingQian,String BiePaoQi,String Damn,String LvLe,String ZiSha,String NoMomery){
		this.ChaoXiao = ChaoXiao;
		this.XianHai = XianHai;
		this.QiangQian = QiangQian;
		this.BiePaoQi = BiePaoQi;
		this.Damn = Damn;
		this.LvLe = LvLe;
		this.ZiSha = ZiSha;
		this.NoMomery = NoMomery;
	}
	public String getChaoXiao() {
		return ChaoXiao;
	}
	public void setChaoXiao(String chaoXiao) {
		ChaoXiao = chaoXiao;
	}
	public String getXianHai() {
		return XianHai;
	}
	public void setXianHai(String xianHai) {
		XianHai = xianHai;
	}
	public String getQiangQian() {
		return QiangQian;
	}
	public void setQiangQian(String qiangQian) {
		QiangQian = qiangQian;
	}
	public String getBiePaoQi() {
		return BiePaoQi;
	}
	public void setBiePaoQi(String biePaoQi) {
		BiePaoQi = biePaoQi;
	}
	public String getDamn() {
		return Damn;
	}
	public void setDamn(String damn) {
		Damn = damn;
	}
	public String getLvLe() {
		return LvLe;
	}
	public void setLvLe(String lvLe) {
		LvLe = lvLe;
	}
	public String getZiSha() {
		return ZiSha;
	}
	public void setZiSha(String ziSha) {
		ZiSha = ziSha;
	}
	public String getNoMomery() {
		return NoMomery;
	}
	public void setNoMomery(String noMomery) {
		NoMomery = noMomery;
	}
}
public class Question {
	public static void main(String[] args) {
		DRAKTouble dt = new DRAKTouble();
	}
}
