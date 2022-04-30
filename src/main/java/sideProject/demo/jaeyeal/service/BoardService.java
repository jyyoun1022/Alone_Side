package sideProject.demo.jaeyeal.service;

import sideProject.demo.jaeyeal.dto.BoardDTO;
import sideProject.demo.jaeyeal.entity.Board;

public interface BoardService {

    Long register(BoardDTO dto);



//    default BoardDTO entityToDto(Board entity){
//
//    }

    default Board dtoToEntity(BoardDTO dto){
        Board board = Board.builder()
                .bno(dto.getBno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .view_count(dto.getView_count())
                .like_count(dto.getLike_count())
                .status(dto.getStatus())
                .member_id(dto.getMember_id())
                .build();

        return board;
    }

}
