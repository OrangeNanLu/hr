package com.lianxi.cn;

class Upjober {
	private double momery; //彩礼钱
	private int pope; //人脉
	private String handdun; //手段
	private String bravenao; //头脑
	private String doThing; //处理事情
	public Upjober(){}
	public Upjober(double momery,int pope,String handdun,String bravenao,String doThing){
		this.momery = momery;
		this.pope = pope;
		this.handdun = handdun;
		this.bravenao = bravenao;
		this.doThing = doThing;
	}
	public double getMomery() {
		return momery;
	}
	public void setMomery(double momery) {
		this.momery = momery;
	}
	public int getPope() {
		return pope;
	}
	public void setPope(int pope) {
		this.pope = pope;
	}
	public String getHanddun() {
		return handdun;
	}
	public void setHanddun(String handdun) {
		this.handdun = handdun;
	}
	public String getBravenao() {
		return bravenao;
	}
	public void setBravenao(String bravenao) {
		this.bravenao = bravenao;
	}
	public String getDoThing() {
		return doThing;
	}
	public void setDoThing(String doThing) {
		this.doThing = doThing;
	}
	public String getInfo(){
		return "想升上去要具备：\n彩礼钱："+this.momery
				+"\n一定的人脉："+this.pope
				+"\n手段："+this.handdun
				+"\n随机应变的灵活的遇事不惊的头脑："+this.bravenao
				+"\n要会处理各种事情，并且让领导满意，事情概况："+this.doThing;
	}
}
	
public class UpProject {
	public static void main(String[] args) {
		Upjober up = new Upjober(9999999,16,"遇到小人应防范，遇到贵人应拉拢","高头脑不断的学习别人的长处，锻炼自己","做正确的事情，让领导满意的事情，应对不同的领导，做不同的事情，有的需要埋头苦干，有的需要大吹大擂，有的需要礼尚往来，有的需要保持距离");
		System.out.println(up.getInfo());
	}
}
