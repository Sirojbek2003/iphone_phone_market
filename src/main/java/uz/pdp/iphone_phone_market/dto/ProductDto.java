package uz.pdp.iphone_phone_market.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductDto {
    private Integer id;
    private String name;
    private Double price;
    private Integer quantity;
    private String imgUrl;

    @OneToMany
    private List<CharacterValuesDto> characterAndValuesList;
}
