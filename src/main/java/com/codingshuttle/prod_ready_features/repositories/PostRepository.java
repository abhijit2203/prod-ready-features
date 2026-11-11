package com.codingshuttle.prod_ready_features.repositories;

import com.codingshuttle.prod_ready_features.entities.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity,Long> {
}
