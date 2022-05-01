package sideProject.demo.jaeyeal.dto;

public class PageResultDTO {

    private int page;
    private int size;


}

////Slice interface spec
//int getNumber() : 현재 페이지
//int getSize() : 페이지 크기
//int getNumberOfElements() : 현재 페이지에 나올 데이터 수
//List<T> getContent() : 조회된 데이터
//boolean hasContent() : 조회된 데이터 존재 여부
//Sort getSort() : 정렬 정보
//boolean isFirst() : 현재 페이지가 첫 페이지 인지 여부
//boolean isLast() : 현재 페이지가 마지막 페이지 인지 여부
//boolean hasNext() :  다음 페이지 여부
//boolean hasPrevious() : 이전 페이지 여부
//Pageable getPageable() : 페이지 요청 정보
//Pageable nextPageable() : 다음 페이지 객체
//Pageable previouPageable() : 이전 페이지 객체
//
//PageRequest pageRequest = PageRequest.of(0,3,Sort.by("bno").descending());
//첫번쨰 인자 : offset(0부터시작)      두번째 인자 : limit          세번쨰 인자 : 정렬 정보


//무한 스크롤 구현 이론
// 컨텐츠의 끝부분을 만나게 되면, 다음 페이지 부분을 불러와서 더한다.;

