package uz.pdp.iphone_phone_market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.iphone_phone_market.entity.CardType;

public interface CardTypeRepository extends JpaRepository<CardType,Integer> {

    boolean existsByName(String name);
}
