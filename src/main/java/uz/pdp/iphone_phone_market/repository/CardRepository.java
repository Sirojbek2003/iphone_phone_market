package uz.pdp.iphone_phone_market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.iphone_phone_market.entity.Card;

public interface CardRepository extends JpaRepository<Card,Integer> {

    boolean existsByCardNumber(String cardNumber);
}
