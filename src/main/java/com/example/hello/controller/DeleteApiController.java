package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class DeleteApiController {

//  http://localhost:8400/api/delete/steve?account=user100
    @DeleteMapping("/delete/{userId}")
    public int delete(@PathVariable(name="userId") String userId, @RequestParam String account){
        System.out.println(userId);
        System.out.println(account);

        return 200;
    }
}
