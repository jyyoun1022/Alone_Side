package sideProject.demo.jaeyeal.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import sideProject.demo.jaeyeal.dto.BoardDTO;
import sideProject.demo.jaeyeal.entity.Board;
import sideProject.demo.jaeyeal.repository.BoardRepository;

@Service
@Log4j2
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;

    @Override
    public Long register(BoardDTO dto) {
        Board board = dtoToEntity(dto);
         boardRepository.save(board);
        return board.getBno();
    }


}
