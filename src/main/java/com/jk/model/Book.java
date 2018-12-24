/**
 * Copyright (C),金科教育
 * FileName: Book
 * Author:   刘宇冰
 * Date:     2018/12/21 19:47
 * History:
 */
package com.jk.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈book〉
 *
 * @author 刘宇冰
 * @create 2018/12/21
 * @since 1.0.0
 */
@Entity
@Table(name="s_book")
public class Book implements Serializable {

    private static final long serialVersionUID = -3363681305945128825L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String url;

    private String date;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", date='" + date + '\'' +
                ", type=" + type +
                '}';
    }
}
