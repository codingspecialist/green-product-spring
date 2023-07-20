package shop.mtcoding.mall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductDTO {
    private Integer id;
    private String name;
    private Integer price;
    private Integer qty;
    private String des;
}
