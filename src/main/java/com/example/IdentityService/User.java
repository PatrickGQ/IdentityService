package com.example.IdentityService;

public class User {
    private Long id;
    private String ci;

    public User() {}

    public User(Long id, String ci) {
        this.id = id;
        this.ci = ci;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
}
