package jp.co.aforce.sample;

public class Cat {
    String name;
	
    Cat(String name) {
		this.name = name;
	}

    void meow() {
        System.out.println(name + "が鳴いた！");
    }

    public static void main(String[] args) {

    	// ここにインスタンス化コードを記述
    	
    	Cat n = new Cat("タマ");
    	n.meow();
    }
}


