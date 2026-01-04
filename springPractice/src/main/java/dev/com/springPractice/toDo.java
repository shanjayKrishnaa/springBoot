package dev.com.springPractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/toDo")
public class toDo {
    @GetMapping("/get")
    String getToDo(){
        return "toDo Get";
    }
    @GetMapping("/{id}")
    String toDoWithId(@PathVariable long id){
        return "toDo with id " + id;
    }
}
