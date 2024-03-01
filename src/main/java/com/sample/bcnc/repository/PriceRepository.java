package com.sample.bcnc.repository;

import com.sample.bcnc.entity.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {

    List<PriceEntity> findByStartDateAndProductIdAndBrandId(Date startDate, Long productId, Long brandId);
}
