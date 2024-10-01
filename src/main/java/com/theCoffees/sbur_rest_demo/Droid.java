package com.theCoffees.sbur_rest_demo;

// 서드파티 컴포넌트(POJO) 생성 후 애플리케이션 환경에 통합
// POJO 정의
class Droid {
    private String id, description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
