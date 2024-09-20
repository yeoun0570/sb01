package com.ssg.sb01.service;

import com.ssg.sb01.domain.Board;
import com.ssg.sb01.dto.BoardDTO;
import com.ssg.sb01.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class BoardServiceTests {
    @Autowired(required = false)
    private ModelMapper modelMapper;

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void 회원가입() {
        BoardServiceImpl boardService = new BoardServiceImpl(modelMapper, boardRepository);
        
        BoardDTO boardDTO = BoardDTO.builder()
                .title("title111")
                .content("content111")
                .writer("writer111")
                .build();

        boardService.register(boardDTO);
    }

    @Test
    public void modifyTest() {
        BoardServiceImpl boardService = new BoardServiceImpl(modelMapper, boardRepository);

        BoardDTO boardDTO = BoardDTO.builder()
                .bno(102L)
                .title("title222")
                .content("content222")
                .build();

        boardService.modify(boardDTO);
    }

    @Test
    public void removeTest() {
        BoardServiceImpl boardService = new BoardServiceImpl(modelMapper, boardRepository);
        boardService.remove(102L);
    }
}
