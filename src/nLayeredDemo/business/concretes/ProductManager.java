package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    private ProductDao productDao;


    @Override
    public void add(Product product) {
        if(product.getCategoryId() == 1){
            System.out.println("Bu categoryde urun kabul edilmiyor");
        }
        this.productDao.add(product);
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
