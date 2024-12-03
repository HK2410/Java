package com.todo.mapper;

import com.todo.dto.TodoDto;
import com.todo.entity.Todo;

public class TodoMapper {
   public static TodoDto mapToTodoDto(Todo todo) {
	   return new TodoDto(todo.getId(),todo.getTitle(),todo.getDescription(),
			   todo.isCompleted());
   }
   
   public static Todo mapToTodo(TodoDto todoDto) {
	   Todo todo = new Todo();
	   todo.setTitle(todoDto.getTitle());
	   todo.setDescription(todoDto.getDescription());
	   todo.setCompleted(todoDto.isCompleted());
	   return todo;
   }
}
