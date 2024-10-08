package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FAST : 빠른 배송
 * NOMAL : 일반 배송
 * SLOW : 느린 배송
 */
@Data
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
public class DeliveryCode {

    private String code;
    private String displayName;

}
