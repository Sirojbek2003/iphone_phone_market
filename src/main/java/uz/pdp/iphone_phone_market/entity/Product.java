package uz.pdp.iphone_phone_market.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.iphone_phone_market.model.Attachment;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double price;

    private Integer quantity;

    private String imgUrl;


    @OneToOne
    private Attachment mainImage;

    @OneToMany
    private List<Attachment> imageList;

}
