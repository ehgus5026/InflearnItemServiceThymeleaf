package hello.itemservice.domain.item;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    private Boolean open; // 판매 여부
    private List<String> regions; // 등록 지역(여러 개를 선택 가능해서 List)
    private ItemType itemType; // 상품 종류
    private String deliveryCode; // 배송 방식, 여러 개중 하나만 넣기 때문에 String(여러 개면 List)

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
