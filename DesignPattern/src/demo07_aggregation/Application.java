package demo07_aggregation;

public class Application {
	public static void main(String[] args) {
		Stuhl stuhl = new Stuhl();
		
		Restaurant restaurant = new Restaurant();
		
		restaurant.addStuhl(stuhl);
		
		Stuhl stuhl2 = restaurant.getStuhl();
		
		System.out.println("stuhl == stuhl2: " + (stuhl == stuhl2));
		
		restaurant = null;
		
		
		
	}
}
