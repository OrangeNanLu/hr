package cn.mldn.demoa;

interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	@Override
	public void eat() {
		System.out.println("****吃苹果****");
	}
}
class Orange implements Fruit {
	@Override
	public void eat() {
		System.out.println("****吃橘子****");
	}
}
class Factory{
	public static Fruit getInstance(String className) {
		Fruit fruit = null;
		try {
			fruit = (Fruit)Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fruit ;
	}
}
public class TestFactoryDemoA {
	public static void main(String[] args) {
		Fruit f = Factory.getInstance("cn.mldn.demoa.Orange");
		f.eat();
	}
}
