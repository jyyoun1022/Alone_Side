package sideProject.demo.jaeyeal.service;

import sideProject.demo.jaeyeal.dto.BoardDTO;
import sideProject.demo.jaeyeal.entity.Board;

public interface BoardService {

    Long register(BoardDTO dto);



    default BoardDTO entityToDto(Board entity){
        BoardDTO dto = BoardDTO.builder()
                .bno(entity.getBno())
                .title(entity.getTitle())
                .content(entity.getContent())
                .view_count(entity.getView_count())
                .like_count(entity.getLike_count())
                .member_id(entity.getMember_id())
                .regDate(entity.getRegDate())
                .modDate(entity.getModDate())
                .build();

        return dto;
    }

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
