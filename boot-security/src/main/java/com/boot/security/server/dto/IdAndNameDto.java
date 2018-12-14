package com.boot.security.server.dto;

/**
 * Created By Seven.wk
 * Description: 放置id和name对
 * Created At 2018/09/28
 */
public class IdAndNameDto {

    private Object id;

    private Object name;

    public IdAndNameDto() {
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IdAndNameDto{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
