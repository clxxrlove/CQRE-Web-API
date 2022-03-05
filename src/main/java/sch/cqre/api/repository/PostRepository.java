package sch.cqre.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import sch.cqre.api.domain.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Integer> {
	List<PostEntity> findByAuthorId(Integer author_id);
}