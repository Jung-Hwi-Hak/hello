package com.example.hello.controller;

import com.example.hello.dto.UserRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ApiController.java
 * Hello World Api 클래스
 *
 * @author 정휘학
 * @since 2023.02.24
 */
@RestController // 해당 class 는 REST API 처리하는 Controller
@RequestMapping("/api") // RequestMapping URI 를 지정해주는 Annotation
public class ApiController {

    /* GET API */
    @GetMapping(path="/hello") // http://localhost:8400/api/hello
    public String hello(){
        return "get Hello";
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET) // get, post, put, delete 가 다 동작.
    public String hi(){
        return "hi";
    }

    // http://localhost:8400/api/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName){
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    // http://localhost:8400/api/query-param?user=steve&email=steve@gmail.com&age=30
    /* Map 으로 받을땐 어떠한 api param 이 오는지 모를경우 */
    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String,String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
            System.out.println("\n");

            sb.append(key + " = " + value + "\n");
        });

        return sb.toString();
    }

    /* api param 종류를 알고 있을 경우에는 명시적으로 매개변수 param 작성 */
    @GetMapping("/query-param02")
    public String queryParam02(@RequestParam String name, @RequestParam String email, @RequestParam int age){

        return name +" "+ email +" "+ age;
    }

    @GetMapping("/query-param03")
    public String queryParam03(UserRequestDto userRequestDto){

        System.out.println(userRequestDto.getName());
        System.out.println(userRequestDto.getEmail());
        System.out.println(userRequestDto.getAge());

        return userRequestDto.toString();
    }
}
