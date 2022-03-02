package demo01_assertion.appropriate;

/**
 * Do Use Assertions, Even in Public Methods, 
 * to Check for Cases that You Know
 * Are Never, Ever Supposed to Happen
 */
public class Demo04CheckCases {
	public static void main(String[] args) {
		doStuffA();
	}

	public static void doStuffA() {
		int y = 0;
		for (int i = 0; i <= 4; i++) {
			switch (i) {
			case 1:
				System.out.println("y: " + y);
				break;
			case 2:
				System.out.println("y: " + y);
				break;
			case 3:
				System.out.println("y: " + y);
				break;
			default:
				assert false: "we're not supposed to get here " + i;				
			}
		}

	}
}
