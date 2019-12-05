package com.cognizant.BDS.model;
import javax.persistence.*;
 
@Entity
@Table(name = "user_auth")
public class UserAuthToken implements java.io.Serializable {
    private Long id;
    private String selector;
    private String validator;
    private User user;
 
    public UserAuthToken() {
    }
 
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
 
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    public User getuser() {
        return user;
    }
     
    // other getters and setters are hidden for brevity
 
}