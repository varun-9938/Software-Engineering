package com.tbhs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tbhs.b84.model.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train, Integer>{

}
