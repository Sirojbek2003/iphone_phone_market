package uz.pdp.iphone_phone_market.projection;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface ProductProjection {

    Integer getId();
    String getCategoryName();
    String getName();
    Integer getQuantity();
    String getPrice();
    String getImgUrl();
        List<Character> getCharacter_name();
        //List<CharacterValue> getCharacter_value();
    @Value("#{@characteristicRepository.getCharacteristicNameAndValueByProductId(target.id)}")
    List<CharacteristicProjection> getCharacters();

}