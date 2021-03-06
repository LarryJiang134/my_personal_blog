package com.larry.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by hangyanjiang on 2017/6/14.
 */

@Entity
public class Blog {

    @Id
    @GeneratedValue
    private Integer id;

    private String url;

    private String name;

    public Integer getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "blog")
    private List<Item> items;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
