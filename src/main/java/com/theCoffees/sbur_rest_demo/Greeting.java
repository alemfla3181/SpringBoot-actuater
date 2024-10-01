package com.theCoffees.sbur_rest_demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/***
 * ConfigurationProperties 어노테이션 이용
 * Value 어노테이션에 비해 관련 속성을 정의하고 그룹화해서 도구로 검증 가능하고 타입 세이프한 방식
 * (IDE에서 타입 불일치나 사용하지 않는 속성으로 표시되는 하이라이트로 실수를 잡아내는데 큰 도움이 됨)
 */

@ConfigurationProperties(prefix = "greeting") // greeting 속성에 사용할 앞자리 부호 설정
class Greeting {
    private String name;
    private String coffee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }
}
