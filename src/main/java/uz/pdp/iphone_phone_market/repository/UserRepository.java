package uz.pdp.iphone_phone_market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.pdp.iphone_phone_market.entity.User;
import uz.pdp.iphone_phone_market.projection.UserProjection;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(nativeQuery = true, value = "select u.id,\n" +
            "       u.full_name    as fullName,\n" +
            "       u.phone_number as phoneNumber,\n" +
            "       u.password\n" +
            "from users u\n" +
            "         join card c on u.id = c.user_id\n" +
            "         join card_type ct on ct.id = c.card_type_id")
    List<UserProjection> getAllUsers();
}

