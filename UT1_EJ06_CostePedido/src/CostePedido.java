
public class CostePedido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemPrice = 4, itemCount = 3, discount = 2, totalCost;
		String finalMessage;
		
		totalCost = itemPrice * itemCount - discount;
		
		finalMessage = "Costo total: " + totalCost;
		
		System.out.println(totalCost);
	}

}
