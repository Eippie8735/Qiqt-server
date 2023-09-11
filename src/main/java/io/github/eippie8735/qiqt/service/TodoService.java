package io.github.eippie8735.qiqt.service;

import io.github.eippie8735.qiqt.entity.ToDoEntity;
import io.github.eippie8735.qiqt.repository.ToDoRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 가공 해줌
public class TodoService {
    public TodoService(ToDoRepository repository) {
        this.repository = repository;
    }

    @Autowired // 스프링 기능  보안관련 문제가 생길 수 있음
    private final ToDoRepository repository;

    public ToDoEntity addTodo(String content){
        ToDoEntity entity = ToDoEntity.builder()
                .content(content)
                .success(false)
                .build();

        return repository.save(entity);
    }

    public List<ToDoEntity> todoList(){
        List<ToDoEntity> todos= repository.findAll(); // 저장했던 모든것을 받아옴
        return todos;
    }

    public boolean markTodo(int todoId,boolean isSuccess){

        if (!repository.existsById(todoId))
            return false;

        int success = repository.editTodoMark(todoId, isSuccess);
        return success == 0;

    }

}// 인스턴스화는 클래스만 가능
