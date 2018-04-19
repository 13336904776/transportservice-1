package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class UserEntity {
    @Id
    private String username;
    private String password;
    private String pname;
    private String pcardid;
    private String psex;
    private String ptel;
    private String pregisterdate;
    private String role;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcardid() {
        return pcardid;
    }

    public void setPcardid(String pcardid) {
        this.pcardid = pcardid;
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex;
    }

    public String getPtel() {
        return ptel;
    }

    public void setPtel(String ptel) {
        this.ptel = ptel;
    }

    public String getPregisterdate() {
        return pregisterdate;
    }

    public void setPregisterdate(String pregisterdate) {
        this.pregisterdate = pregisterdate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(pname, that.pname) &&
                Objects.equals(pcardid, that.pcardid) &&
                Objects.equals(psex, that.psex) &&
                Objects.equals(ptel, that.ptel) &&
                Objects.equals(pregisterdate, that.pregisterdate) &&
                Objects.equals(role, that.role) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, password, pname, pcardid, psex, ptel, pregisterdate, role, email);
    }
}
