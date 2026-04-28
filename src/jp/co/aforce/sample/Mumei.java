package jp.co.aforce.sample;

public class Mumei {
	public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, World!");
            }
        });

        t.start();
    }
}
