package sch.cqre.api.model.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PostHashTag", schema = "main")
@IdClass(PostHashTagEntityPK.class)
public class PostHashTagEntity {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "post_id")
	private int postId;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "hashtag_id")
	private int hashtagId;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PostHashTagEntity that = (PostHashTagEntity)o;
		return postId == that.postId && hashtagId == that.hashtagId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(postId, hashtagId);
	}
}
