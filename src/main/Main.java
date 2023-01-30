package main;
import brincando_com_java.Singleton;

public class Main {

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.toString());
	}
}
