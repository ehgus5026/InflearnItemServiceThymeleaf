package hello.itemservice.domain.item;

import lombok.Getter;

@Getter
public enum ItemType {

    BOOK("도서"), FOOD("음식"), ETC("기타");

    private final String description;

    ItemType(String description) {  // 생성자가 있어야 각 속성에 description이 들어감
        this.description = description;
    }
}
