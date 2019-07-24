package finance;

import java.util.Date;
import finance.Payable;

public class Invoice implements Payable {	
	private String name;
	private Date date;
	private double amount;

	public Invoice (String name, double amount) {
		this.name = name;
		this.amount = amount;
		this.date = new Date();
	}

	public String getPayInfo() {
		return name + " " + date + " " + amount;
	}

}
