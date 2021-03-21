package demo2;

public class GithubDemoTwo {

	public static void main(String[] args) {
		System.out.println("My first github commit......");

		gitDemoOne();
		
		webUI();
	}


	public static void gitDemoOne() {
		System.out.println("Pringting gitDemoOne for understanding process");
	}


	public static boolean webUI() {
		boolean result = false;

		if("UI".equals("DB")) {
			result = true;
		} else {
			System.out.println("Error Information for UI does not match with DB");
		}
		
		return result;
	}
}
