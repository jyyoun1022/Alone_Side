package sideProject.demo.jaeyeal.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sideProject.demo.jaeyeal.entity.Board;

import java.util.Optional;

@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;


    @Test
    @DisplayName("수정테스트")
    public void updateTest(){
        Optional<Board> result = boardRepository.findById(101L);

        if(result.isPresent()){
            Board board = result.get();

            board.changeTitle("Changed TItle");
            board.changeContent("changed contents");

            boardRepository.save(board);
        }
    }



}
