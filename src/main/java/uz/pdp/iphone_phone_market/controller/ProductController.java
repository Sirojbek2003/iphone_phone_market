package uz.pdp.iphone_phone_market.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.pdp.iphone_phone_market.dto.ProductDto;
import uz.pdp.iphone_phone_market.projection.ProductProjection;

import uz.pdp.iphone_phone_market.serice.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor

public class ProductController {

    private final ProductService productService;


    @GetMapping
    public List<ProductProjection> getAllProducts(){
        List<ProductProjection> products = productService.getAllProductsFromDb();
        return products;
    }

    @GetMapping("/{id}")
    public List<ProductProjection> getProductById(@PathVariable Integer id){
        List<ProductProjection> productById = productService.getProductById(id);
        return productById;
    }


    @PostMapping
    public void addProduct(ProductDto productDto){

    }



}
