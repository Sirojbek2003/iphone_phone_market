package uz.pdp.iphone_phone_market.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CardDto {

    private String bankName;

    private  String cardNumber;

    private Double balance;

    private String term;

    private Integer cardTypeId;
}
