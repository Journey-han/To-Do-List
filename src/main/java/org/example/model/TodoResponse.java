package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// 응답을 내려주기 위한 클래스
public class TodoResponse {
    private Long id;
    private String title;
    private Long order;
    private Boolean completed;
    private String url;

    // 생성자
    public TodoResponse(TodoModel todoModel) {
        this.id = todoModel.getId();
        this.title = todoModel.getTitle();
        this.order = todoModel.getOrder();
        this.completed = todoModel.getCompleted();

        this.url = "http://localhost:8080/" + this.id;
    }
}
