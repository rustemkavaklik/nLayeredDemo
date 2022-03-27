package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {
        /*
        bir projede entity le rharic new yapiyorsan ileride problem yasayacaksin demektir.
         */

        //ToDo: Spring IoC ile cozulecek

      //  ProductService productService = new ProductManager(new HibernateProductDao());  //Artik Hibernate yerine baska bir sistem kullanacagim
        ProductService productService = new ProductManager(new AbcProductDao());   // Sistem artik AbcProductDao()'ya gecti

        Product product = new  Product(1,2,"Elma", 12,50);
        productService.add(product);

    }
}
