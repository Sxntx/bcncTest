package com.sample.bcnc.controller;

import com.sample.bcnc.entity.PriceEntity;
import com.sample.bcnc.service.PriceService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PriceControllerTest {

    @Mock
    private PriceService priceService;

    @InjectMocks
    private PriceController priceController;

    @Test
    public void testGetPricesInfo() throws ParseException {
        // Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA)
        testScenario("2020-06-14 10:00:00", 35455L, 1L, 35.50);

        // Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA)
        testScenario("2020-06-14 16:00:00", 35455L, 1L, 25.45);

        // Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA)
        testScenario("2020-06-14 21:00:00", 35455L, 1L, 35.50);

        // Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1 (ZARA)
        testScenario("2020-06-15 10:00:00", 35455L, 1L, 30.50);

        // Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA)
        testScenario("2020-06-16 21:00:00", 35455L, 1L, 38.95);
    }

    private void testScenario(String applicationDateStr, Long productId, Long brandId, double expectedPrice)
            throws ParseException {
        // Configuración del servicio simulado
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date applicationDate = dateFormat.parse(applicationDateStr);

        Mockito.when(priceService.getPricesInfo(applicationDate, productId, brandId))
                .thenReturn(Arrays.asList(createMockPriceEntity(expectedPrice)));

        // Realizar la llamada al endpoint
        List<PriceEntity> result = priceController.getPricesInfo(applicationDateStr, productId, brandId);

        // Verificar el resultado esperado
        assertEquals(1, result.size());
        assertEquals(expectedPrice, result.get(0).getPrice()); // Ajusta según la estructura exacta de tu PriceEntity
    }

    private PriceEntity createMockPriceEntity(double price) {
        // Crea un objeto PriceEntity simulado para utilizar en los tests
        PriceEntity mockPriceEntity = new PriceEntity();
        mockPriceEntity.setPrice(price);
        return mockPriceEntity;
    }

}
