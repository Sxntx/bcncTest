package com.sample.bcnc.service;

import com.sample.bcnc.entity.PriceEntity;
import com.sample.bcnc.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public List<PriceEntity> getPricesInfo(Date dateTime, Long brandId, Long productId) {
        return priceRepository.findByStartDateAndProductIdAndBrandId(dateTime, productId, brandId);
    }
}
