package com.sample.bcnc.repository;

import com.sample.bcnc.entity.PriceEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class PriceRepositoryTest {

    @Autowired
    private PriceRepository priceRepository;

    @Test
    public void testFindPricesByParameters() {
        // Datos de prueba
        Date date = Date.valueOf("2020-06-14");
        Long productId = 35455L;
        Long brandId = 1L;

        // Ejecutar el método del repositorio
        List<PriceEntity> prices = priceRepository.findByStartDateAndProductIdAndBrandId(date, productId, brandId);

        // Verificar el resultado
        assertEquals(1, prices.size());
    }
}
