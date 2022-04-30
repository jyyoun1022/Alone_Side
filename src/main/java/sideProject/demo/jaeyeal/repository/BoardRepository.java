package sideProject.demo.jaeyeal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sideProject.demo.jaeyeal.entity.Board;

public interface BoardRepository extends JpaRepository<Board,Long> {
}
