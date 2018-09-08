import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
class ProdutDBStore {

	private List<Product> product = new ArrayList<Product>();
	public void ProductDBStore()
	{
		product.add(new Product(1,"chicken",20,1));
		product.add(new Product(2,"mutton",22,2));
		product.add(new Product(3,"chic",20,55));
		product.add(new Product(4,"chicke",204,1));
		product.add(new Product(5,"cken",2,1));

	}

	public List<Product> getProduct() {
		return product;
	}
}

