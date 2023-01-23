public class Main {

	public static void main(String[] args) {
		Customer c;
		RegularCustomer r = new RegularCustomer("Hazel Delda", 10.00);
		SeniorCustomer s = new SeniorCustomer("Jeon Jung", 10.00);

		c = r;
		System.out.println(c.calculateBill());
		c = s;
		System.out.println(c.calculateBill());
	}
}
