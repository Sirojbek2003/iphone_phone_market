package uz.pdp.iphone_phone_market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.pdp.iphone_phone_market.entity.Character;
import uz.pdp.iphone_phone_market.model.Attachment;
import uz.pdp.iphone_phone_market.projection.CharacteristicProjection;

import java.util.List;

public interface CharacteristicRepository extends JpaRepository<Character, Integer> {


    @Query(nativeQuery = true, value = "select ch.character_name as characterName, cv.value from character ch\n" +
            "join characters_ch_values ccv on ch.id = ccv.character_id\n" +
            "join character_value cv on cv.id = ccv.character_value_id\n" +
            "join products_ch_values pcv on ccv.id = pcv.char_value_id\n" +
            "where pcv.product_id = :productId group by ch.character_name, cv.value")
    List<CharacteristicProjection> getCharacteristicNameAndValueByProductId(Integer productId);
}
