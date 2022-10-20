package uz.pdp.iphone_phone_market.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity(name = "characters_ch_values")
public class CharacterCharValues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Character character;

    @ManyToOne
    private CharacterValue characterValue;
}
