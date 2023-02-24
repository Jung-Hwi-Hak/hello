package com.example.hello.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

/**
 * PutRequestDto.java
 * Class 설명을 작성하세요.
 *
 * @author owner
 * @since 2023.02.24
 */
@JsonNaming(value= PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PutRequestDto {

    private String name;
    private String age;
    private List<CarDto> carList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<CarDto> getCarList() {
        return carList;
    }

    public void setCarList(List<CarDto> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "PutRequestDto{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", carList=" + carList +
                '}';
    }
}
