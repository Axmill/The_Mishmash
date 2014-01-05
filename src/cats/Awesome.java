package cats;
// TODO Add variables.
public class Awesome {

	private static String SirString;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Life = 42;
		double Pi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
		System.out.println("The meaning of life plus pi is...");
		System.out.println(Life + Pi);
		String CoolString = "So, you think you can stop me?";
		System.out.println(CoolString);
		setSirString("BY THE POWER OF ENGLISH, I WILL STOP YOU!");
		System.out.println(SirString);
		System.out.println("AND THE BATTLE RAGED! WITH BLADES OF FIRE! WHY AM I SINGING THIS SONG! DUM DEE DUM!");
	}

	public static String getSirString() {
		return SirString;
	}

	public static void setSirString(String sirString) {
		SirString = sirString;
	}

}
