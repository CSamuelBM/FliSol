package com.netflix.repository;

import com.netflix.entity.StreamingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StreamingRepository extends JpaRepository<StreamingEntity, Long>, JpaSpecificationExecutor<StreamingEntity> {
    List<StreamingEntity> findTop50By();
}
