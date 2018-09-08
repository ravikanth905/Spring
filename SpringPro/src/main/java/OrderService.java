import org.springframework.beans.factory.annotation.Autowired;
public class OrderService {
	
	@Autowired
	OrderService Order;
	
	public static void main(String args[]) {
	
	int quantity;
	int id;

	public String  processorder()
	{
		if(Order.id==ProductDBStore.getId() && Order.quantity<=ProductDBStore.getQuantity())
		dbStore.productDetails().setQuantity(dbStore.getQuantity()-order.getQuantity());

		{

			System.out.println("the order is in  processes ");
			
		}
			else
			{
			System.out.println("insufficient quantity, order cannot be taken ");
		}
		
	}


}
	
	private static void processorder() {
		// TODO Auto-generated method stub
		
	}

}

