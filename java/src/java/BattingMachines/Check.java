package java.BattingMachines;

public class Check {
	
	private int price = 1000;
	private int input = 0;
	private int sum = 0;
	
	public void checkprice( int input ) {
		
		this.input = input;
		sum += input;
		System.out.println(sum + "원 투입");
		
		if( price == input ) {
			
		System.out.println("총" + sum + "원");
			
		}
	}
	
	public static void main(String[] args) {
		int a = 500;
		
		Check check = new Check();
		check.checkprice(a);
	}
		
}