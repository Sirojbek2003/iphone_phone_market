package uz.pdp.iphone_phone_market.serice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.iphone_phone_market.projection.UserProjection;
import uz.pdp.iphone_phone_market.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository userRepo;

    public List<UserProjection> getAllUsersFromDb() {
        List<UserProjection> allUsers = userRepo.getAllUsers();
        return allUsers;
    }

}