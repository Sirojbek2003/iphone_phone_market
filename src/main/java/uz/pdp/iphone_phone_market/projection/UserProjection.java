package uz.pdp.iphone_phone_market.projection;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface UserProjection {

    Integer getId();
    String getFullName();
    String getPassword();
    String getPhoneNumber();

    @Value("#{@cardsByUserRepository.getAllCards(target.id)}")
    List<UserCardProjection> getUserCards();
}
