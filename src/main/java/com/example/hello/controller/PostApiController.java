package com.example.hello.controller;

import com.example.hello.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post")
    public void post(@RequestBody Map<String,Object> requestData){

        requestData.forEach(((s, o) -> {
            System.out.println("key : " + s);
            System.out.println("value : " + o);
            System.out.println("\n");
        }));

    }

    @PostMapping("/post/dto")
    public String postDto(@RequestBody PostRequestDto postRequestDto){
        return postRequestDto.toString();
    }
}
