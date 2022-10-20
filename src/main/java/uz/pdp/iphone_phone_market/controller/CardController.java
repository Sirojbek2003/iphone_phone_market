package uz.pdp.iphone_phone_market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.iphone_phone_market.dto.CardDto;
import uz.pdp.iphone_phone_market.entity.Card;
import uz.pdp.iphone_phone_market.payload.Result;
import uz.pdp.iphone_phone_market.serice.CardService;


import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {
    @Autowired
    CardService cardService;

    @GetMapping
    public List<Card> allC(){
        return cardService.all();
    }

    @GetMapping("/{id}")
    public Card getId(@PathVariable Integer id){
        return cardService.getId(id);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        return cardService.delete(id);
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody CardDto cardDto){
        return cardService.update(id,cardDto);
    }

}
