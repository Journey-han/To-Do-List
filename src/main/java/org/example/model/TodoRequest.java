package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 요청을 내리기 위한 클래스
public class TodoRequest {

    private String title;
    private Long order;
    private Boolean completed;

}
