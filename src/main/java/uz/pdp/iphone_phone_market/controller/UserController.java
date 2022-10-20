package uz.pdp.iphone_phone_market.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.pdp.iphone_phone_market.projection.UserProjection;
import uz.pdp.iphone_phone_market.serice.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor

public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserProjection> getAllusersFromDb(){
        List<UserProjection> allUsersFromDb = userService.getAllUsersFromDb();
        return allUsersFromDb;
    }

}
