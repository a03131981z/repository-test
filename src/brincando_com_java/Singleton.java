package brincando_com_java;

public class Singleton {

	private static Singleton singleton = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
