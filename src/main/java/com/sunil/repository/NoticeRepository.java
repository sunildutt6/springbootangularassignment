package com.sunil.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sunil.entity.Notice;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {

	@Query(value = "from Notice n where CURDATE() BETWEEN noticBegDt AND noticEndDt")
	List<Notice> findAllActiveNotices();
}
