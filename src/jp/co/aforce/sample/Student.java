package jp.co.aforce.sample;

public class Student {
String name;
int[] scores;

//平均計算メソッド
void showAverage() {
	
	int sum = 0;
	
	for(int i = 0;i< scores.length; i++) {
		sum += scores[i];
	}
	
	int avg = sum / scores.length;
	
	System.out.println(":"+name);
	System.out.println(""+avg);
}
public static void main(String[] args) {
	
	Student s = new Student();
	
	s.name="taro";
	s.scores= new int[] {8,9,7};
	
	s.showAverage();
	
	}

}