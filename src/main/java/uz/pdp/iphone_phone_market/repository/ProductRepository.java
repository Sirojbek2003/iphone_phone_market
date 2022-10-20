package uz.pdp.iphone_phone_market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import uz.pdp.iphone_phone_market.entity.Product;
import uz.pdp.iphone_phone_market.projection.ProductProjection;


import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select p.id, p.name, p.quantity, p.price, p.img_url from products p join category c on c.id = p.category_id", nativeQuery = true)
    List<ProductProjection> findAllProduct();

    @Modifying
    @Query(value = "select p.id,\n" +
            "       c.category_name,\n" +
            "       p.name,\n" +
            "       p.quantity,\n" +
            "       p.price,\n" +
            "       p.img_url,\n" +
            "       c2.character_name,\n" +
            "       cv.value\n" +
            "from products p\n" +
            "         join category c on c.id = p.category_id\n" +
            "         join products_ch_values pcv on p.id = pcv.product_id\n" +
            "         inner join characters_ch_values ccv on pcv.char_value_id = ccv.id\n" +
            "         join character c2 on c2.id = ccv.character_id\n" +
            "         join character_value cv on cv.id = ccv.char_value_id where p.id= ?", nativeQuery = true)
    List<ProductProjection> findProductById(Integer id);
}