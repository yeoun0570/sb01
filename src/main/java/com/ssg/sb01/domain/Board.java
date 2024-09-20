package com.ssg.sb01.domain;

import jakarta.persistence.*;
import lombok.*;

//@Entity와 @Id는 엔티티 객체를 만들 때 필수
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board extends BaseEntity {
    @Id
    //strategy = 전략, mysql의 autoincrement를 이용해서 자동으로 생성하는 전략을 짜겠다
    //게시물은 데이터베이스에 추가될 때마다 생성되는 번호를 이용하므로
    // 키 생성전략(key generated strategy로 데이터베이스에서 알아서 결정하는 방식, mysql의 autoincrement
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;
    @Column(length = 500, nullable = false)
    private String title;
    @Column(length = 1000, nullable = false)
    private String content;
    @Column(length = 50, nullable = false)
    private String writer;

    public void change(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
