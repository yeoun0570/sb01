package com.ssg.sb01.repository;

import com.ssg.sb01.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {
    //JpaRepository 인터페이스를 상속할 때는 반드시 엔티티타입(Board)이랑 @Id타입(Long)을 지정해줘야한다.
}
