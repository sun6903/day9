public class HelloWorld {
	public static void main(String args[]){
		while(true) {
		System.out.println("Hello World");
		try {
			Thread.sleep(2000);
		} catch(Exception ex) {
			System.out.println(ex);
			}
		}
	}
}
