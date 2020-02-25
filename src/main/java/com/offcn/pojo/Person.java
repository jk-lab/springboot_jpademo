package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person  {

    @Id //声明主键
    @GeneratedValue  //默认不赋值 自增
    private Long id;

    @Column(name = "name",nullable = true,length = 20)
    private  String nmae;

    @Column(name = "age",nullable = true,length = 4)
    private  Integer age;
}
