package com.example.springmicroservicepractice.todo.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * packageName    : com.example.springmicroservicepractice.todo.domain
 * fileName       : ToDo
 * author         : mac
 * date           : 2023/09/06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/09/06        mac       최초 생성
 */
@Entity
@Getter
@Setter
public class ToDo {
    @Id
    @GeneratedValue(generator = "system-uuid") @GenericGenerator(name = "system-uuid", strategy = "uuid") private String id;
    private String description;
    private Timestamp created;
    private Timestamp modified;
    private boolean completed;
}
