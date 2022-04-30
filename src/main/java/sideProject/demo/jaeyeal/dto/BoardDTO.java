package sideProject.demo.jaeyeal.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BoardDTO {

    private Long bno;
    private String title;
    private String content;
    private long view_count;
    private long like_count;
    private String status;
    private String member_id;
    private LocalDateTime regDate,modDate;

}
