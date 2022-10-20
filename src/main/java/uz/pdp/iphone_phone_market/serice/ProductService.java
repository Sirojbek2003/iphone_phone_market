package uz.pdp.iphone_phone_market.serice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.iphone_phone_market.projection.ProductProjection;
import uz.pdp.iphone_phone_market.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductService {

    private final ProductRepository productRepo;

    public List<ProductProjection> getAllProductsFromDb() {
        List<ProductProjection> allProduct = productRepo.findAllProduct();
        return allProduct;
    }

    public List<ProductProjection> getProductById(Integer id) {
        List<ProductProjection> productById = productRepo.findProductById(id);
        return productById;
    }
}
