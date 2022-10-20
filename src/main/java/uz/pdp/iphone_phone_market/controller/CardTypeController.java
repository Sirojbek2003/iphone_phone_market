package uz.pdp.iphone_phone_market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.iphone_phone_market.entity.CardType;
import uz.pdp.iphone_phone_market.payload.Result;
import uz.pdp.iphone_phone_market.serice.CardTypeService;

import java.util.List;

@RestController
@RequestMapping("/CardType")
public class CardTypeController {
    @Autowired
    CardTypeService cardTypeService;

    @GetMapping
    public List<CardType> all(){
        return cardTypeService.all();
    }

    @GetMapping("/{id}")
    public CardType getId(@PathVariable Integer id){
        return cardTypeService.getId(id);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        return cardTypeService.delete(id);
    }

    @PostMapping
    public Result add(@RequestBody CardType cardType){
        return cardTypeService.add(cardType);
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Integer id, @RequestBody CardType cardType){
        return cardTypeService.update(id,cardType);
    }

}
