package com.xinbitiangao.transportservice.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
public class User {
    @Id
    @NotEmpty(message = "用户名不能为空")
    @Length(min = 6, message = "用户名长度不能少于6位")
    private String username;

    @NotEmpty(message = "密码不能为空")
    @Length(min = 6, message = "密码长度不能少于6位")
    private String password;

    @NotEmpty(message = "真实姓名不能为空")
    private String pname;
    private String pcardid;

    @NotEmpty(message = "性别不能为空")
    private String psex;

    private String ptel;
    private String pregisterdate;
    private String role = "普通用户";
    private String email;
}
