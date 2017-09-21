package com.lianxi.cn;

class CounterStrike {
	private String playName;
	private String gun;
	private double momery;
	private String maps;
	private String CTT;
	public CounterStrike(){}
	public CounterStrike(String playName,String gun,double momery,String maps,String CTT){
		this.playName = playName;
		this.gun = gun;
		this.momery = momery;
		this.maps = maps;
		this.CTT = CTT;
	}
	public String getPlayName() {
		return playName;
	}
	public void setPlayName(String playName) {
		this.playName = playName;
	}
	public String getGun() {
		return gun;
	}
	public void setGun(String gun) {
		this.gun = gun;
	}
	public double getMomery() {
		return momery;
	}
	public void setMomery(double momery) {
		this.momery = momery;
	}
	public String getMaps() {
		return maps;
	}
	public void setMaps(String maps) {
		this.maps = maps;
	}
	public String getCTT() {
		return CTT;
	}
	public void setCTT(String cTT) {
		CTT = cTT;
	}
	public String getInfo(){
		return "反恐精英玩家姓名："+this.playName+
				"；\n使用枪支："+this.gun+
				"：\n获得金钱数："+this.momery+
				"；\n比赛地图："+this.maps+
				"；\n阵营（警/匪）："+this.CTT;
	}
}
public class GunGame {
	public static void main(String[] args) {
		CounterStrike c = new CounterStrike("Jonery狙神","FRF2",16000,"de_dust2","海豹突击队");
		System.out.println(c.getInfo());
	}
}
