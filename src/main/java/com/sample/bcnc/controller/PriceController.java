package com.sample.bcnc.controller;


import com.sample.bcnc.entity.PriceEntity;
import com.sample.bcnc.service.PriceService;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/prices")
public class PriceController {

    PriceService service;

    @GetMapping("/calculate")
    List<PriceEntity> getPricesInfo(@NotNull @RequestParam("applicationDate") String applicationDate,
                                    @RequestParam("productId") Long productId,
                                    @RequestParam("brandId") Long brandId) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse(applicationDate);

        return service.getPricesInfo(date, productId, brandId);
    }

}
