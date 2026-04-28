package jp.co.aforce.sample;

public class Configuration {
	static String appName;
	static String version;

//	静的初期化ブロック
	static {
        appName = "MyApp";
        version = "1.0.0";
    }
	
	static void display() {
		System.out.println(appName);
		System.out.println(version);
	}
	
}
