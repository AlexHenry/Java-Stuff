package finance;

public class CheckPrinter {	

	public static void printChecks(Payable[] payables) {
		for (Payable p : payables) {
			System.out.println(p.getPayInfo());
		}
	}
}
