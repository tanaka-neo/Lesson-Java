package jp.co.aforce.sample;

public class Cars {
String model;
int speed;

Cars(String model,int speed) {
		this.model = model;
		this.speed = speed;
	}

void ShowInfo() {
	System.out.println("車種："+model+"スピード："+speed);
}
public static void main(String[] args) {
	Cars c1 = new Cars("ベンツ",100);
	Cars c2 = new Cars("toyota",90);
	Cars c3 = new Cars("honda",130);
	
	c1.ShowInfo();
	c2.ShowInfo();
	c3.ShowInfo();
}
}
