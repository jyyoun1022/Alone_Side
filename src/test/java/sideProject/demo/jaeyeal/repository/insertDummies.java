package sideProject.demo.jaeyeal.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sideProject.demo.jaeyeal.entity.Board;

import java.util.stream.IntStream;

@SpringBootTest
public class insertDummies {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    @DisplayName("더미데이터 생성")
    public void insertDummiess(){
        IntStream.rangeClosed(1,100).forEach(i->{
            Board board = Board.builder()
                    .title("Dummies " + i)
                    .content("Dummiess " + i)
                    .view_count((int)(Math.random()*100)+1)
                    .like_count((int) (Math.random()*100)+1)
                    .status("T")
                    .member_id("USER" + (i % 10))
                    .build();

            boardRepository.save(board);
        });
    }
    @Test
    public void delete(){
        boardRepository.deleteAll();
    }

}
