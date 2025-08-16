package com.cfs.JPAP02.repo;

import com.cfs.JPAP02.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students,Long> {
}
