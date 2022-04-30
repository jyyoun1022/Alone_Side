package sideProject.demo.jaeyeal.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sideProject.demo.jaeyeal.dto.BoardDTO;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class BoardServiceTests {

    @Autowired
    private BoardService boardService;

    @Test
    @DisplayName("등록테스트")
    void testRegister(){
        //given
        final BoardDTO boardDTO = BoardDTO.builder()
                .title("RegisterTest")
                .content("RegisterTest")
                .view_count(7)
                .like_count(18)
                .status("T")
                .member_id("jyy")
                .build();

        //when
        final Long result = boardService.register(boardDTO);
        //then
        System.out.println(result);
        assertThat(result).isEqualTo(201);
    }
}
