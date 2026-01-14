package dev.com.springPractice;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping
    String toDoReqParam(@RequestParam String id,@RequestParam String pass){
        return "The id is:"+id+"  The pass is:"+pass;
    }
}

