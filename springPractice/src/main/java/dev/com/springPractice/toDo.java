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
    @GetMapping("/login")
    String toDoReqParam(@RequestParam String id,@RequestParam String pass){
        return "The id is:"+id+"  The pass is:"+pass;
    }
    @GetMapping("/byId")
    String toDoWithDiffIdName(@RequestParam("toDoId") String id){
        return "the toDo id is :"+ id;
    }
    @PostMapping("/create")
    String createUser(@RequestBody String body){
        return body;
    }
}

