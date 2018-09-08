import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

        @Autowired
		Order ProductDBStore;

    	private int id;
		private int quantity;
		
		public Order(Order productDBStore, int id, int quantity) {
			super();
			ProductDBStore = productDBStore;
			this.id = id;
			this.quantity = quantity;
		}
		
		public Order getProductDBStore() {
			return ProductDBStore;
		}
		public void setProductDBStore(Order productDBStore) {
			ProductDBStore = productDBStore;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

	
}
