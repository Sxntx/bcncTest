package com.sample.bcnc.entity;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PriceEntityTest {

    @Test
    void testGettersAndSetters() {
        PriceEntity e = new PriceEntity();
        e.setCurrency("EUR");
        e.setEndDate(new Date());
        e.setPrice(2d);
        e.setStartDate(new Date());
        e.setBrandId(1L);
        e.setPriceList(1L);
        e.setPriority(1L);
        e.setProductId(1L);

        PriceEntity e2 = new PriceEntity();
        e2.setCurrency("EUR");
        e2.setEndDate(new Date());
        e2.setPrice(2d);
        e2.setStartDate(new Date());
        e2.setBrandId(1L);
        e2.setPriceList(1L);
        e2.setPriority(1L);
        e2.setProductId(1L);


        assertAll(
                () -> assertNotNull(e.getPrice()),
                () -> assertNotNull(e.getBrandId()),
                () -> assertNotNull(e.getCurrency()),
                () -> assertNotNull(e.getEndDate()),
                () -> assertNotNull(e.getPriceList()),
                () -> assertNotNull(e.getPriority()),
                () -> assertNotNull(e.getProductId()),
                () -> assertNotNull(e.getStartDate()),
                () -> assertNotNull(e.hashCode()),
                () -> assertNotNull(e.toString()),
                () -> assertEquals(e,e2)

        );
    }

}
