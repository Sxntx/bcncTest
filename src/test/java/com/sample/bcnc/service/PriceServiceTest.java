package com.sample.bcnc.service;

import com.sample.bcnc.entity.PriceEntity;
import com.sample.bcnc.repository.PriceRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class PriceServiceTest {

    @Mock
    private PriceRepository priceRepository;

    @InjectMocks
    private PriceService priceService;

    @Test
    public void testGetPricesByParameters() {

        Date applicationDate = new Date();
        Long productId = 1L;
        Long brandId = 1L;

        // Simular el comportamiento del repositorio
        Mockito.when(priceRepository.findByStartDateAndProductIdAndBrandId(any(), any(), any()))
                .thenReturn(Collections.singletonList(createMockPrice()));

        // Llamar al método del servicio
        List<PriceEntity> result = priceService.getPricesInfo(applicationDate, productId, brandId);

        // Verificar el resultado
        assertEquals(1, result.size());

    }

    private PriceEntity createMockPrice() {
        PriceEntity entity = new PriceEntity();
        entity.setBrandId(1L);
        entity.setCurrency("EUR");
        entity.setEndDate(new Date());
        entity.setPrice(1d);
        entity.setPriceList(1L);
        entity.setPriority(1L);
        entity.setProductId(1L);
        entity.setStartDate(new Date());
        return entity;

    }

}
