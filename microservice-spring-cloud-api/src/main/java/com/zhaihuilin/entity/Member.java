package com.zhaihuilin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by zhaihuilin on 2018/8/7 17:48.
 */
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Member  implements Serializable {

    @Id
    @GenericGenerator(name = "sys-uid",strategy = "com.zhaihuilin.utils.KeyGeneratorUtil",parameters = {
            @Parameter(name = "k",value = "MR")
    })
    @GeneratedValue(generator = "sys-uid")
     private  String  memberId;

     private  String  userName;

     private  String  address;

     private  Integer  age;

     private  String   db_socure;


    public Member(String userName, String address, Integer age, String db_socure) {
        this.userName = userName;
        this.address = address;
        this.age = age;
        this.db_socure = db_socure;
    }
}
