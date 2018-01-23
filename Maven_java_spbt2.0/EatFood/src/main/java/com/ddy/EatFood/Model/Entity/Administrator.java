package com.ddy.EatFood.Model.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Entity在hibernate中将会自动生成一个表单
@Entity
public class Administrator {
    public Administrator() {
    }

    @Id
    @GeneratedValue
    private int admin_id;

    private String account;

    private String password;

    private String username;

    private String telephone_number;

    private String power_control;

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public String getPower_control() {
        return power_control;
    }

    public void setPower_control(String power_control) {
        this.power_control = power_control;
    }
}
