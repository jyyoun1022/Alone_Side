package sideProject.demo.jaeyeal.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import sideProject.demo.jaeyeal.entity.Board;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    @DisplayName("페이징처리")
    void getList(){
        //given
        boardRepository.save(new Board(202L,"TestTitle","TestTitle",30,30,"T","TestUser"));
        boardRepository.save(new Board(203L,"TestTitle","TestTitle",20,20,"T","TestUser"));
        boardRepository.save(new Board(204L,"TestTitle","TestTitle",12,12,"T","TestUser"));
        boardRepository.save(new Board(205L,"TestTitle","TestTitle",89,30,"T","TestUser"));
        boardRepository.save(new Board(206L,"TestTitle","TestTitle",10,30,"T","TestUser"));

        //when

        PageRequest pageRe = PageRequest.of(0, 3, Sort.by("bno").descending());
        Page<Board> page = boardRepository.findAll(pageRe);


        //then

        List<Board> content = page.getContent();
        long total = page.getTotalElements();
        System.out.println("content = " + content);
        System.out.println("total = " + total);
        System.out.println("getTotalPages : "+ page.getTotalPages());
        System.out.println("isFirst ? : "+page.isFirst());
        System.out.println("Hasnext? : "+page.hasNext());


        assertEquals(3,content.size());//반환한 개수가 3개 인가?
        assertEquals(106,total);//총 요소의 개수가 106개인가?
        assertEquals(0,page.getNumber());//현재 페이지 번호가 0번인가?
        assertEquals(36,page.getTotalPages());// 총 요소가 106개라고 한다면 3개씩 나눴을 때의 총 페이지?
        assertTrue(page.isFirst());//첫번째 페이지 확인
        assertTrue(page.hasNext());//다음 페이지가 있는가?

    }

    @Test
    @DisplayName("Slice 사용법")
    void testSlice(){

        //given
        boardRepository.save(new Board(202L,"TestTitle","TestTitle",30,30,"T","TestUser"));
        boardRepository.save(new Board(203L,"TestTitle","TestTitle",20,20,"T","TestUser"));
        boardRepository.save(new Board(204L,"TestTitle","TestTitle",12,12,"T","TestUser"));
        boardRepository.save(new Board(205L,"TestTitle","TestTitle",89,30,"T","TestUser"));
        boardRepository.save(new Board(206L,"TestTitle","TestTitle",10,30,"T","TestUser"));

        //when
        PageRequest pageRequest = PageRequest.of(0, 3, Sort.by("bno").descending());

        Slice<Board> slice = boardRepository.findAll(pageRequest);


        //then

        List<Board> content = slice.getContent();

        System.out.println("리스트 출력 : "+content);

        System.out.println("slice.getNumber : "+slice.getNumber());
        System.out.println("slice.getNumberOfElementes : "+slice.getNumberOfElements());
        System.out.println("slice.isFirst : "+slice.isFirst());
        System.out.println("slice.hasNext : "+slice.hasNext());

        assertEquals(0,slice.getNumber());
        assertEquals(3,slice.getNumberOfElements());
        assertTrue(slice.isFirst());
        assertTrue(slice.hasNext());


    }



}
