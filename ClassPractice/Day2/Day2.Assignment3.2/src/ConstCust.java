
public class ConstCust {
	private static String name;
	private static String email;
	private static int age;
	private static double cred;

	public static String getDetails() {
		return name + " " + email + " " + age + " " + cred;
	}

	public static void main(String[] args) {
		System.out.println(getDetails());

	}

}
