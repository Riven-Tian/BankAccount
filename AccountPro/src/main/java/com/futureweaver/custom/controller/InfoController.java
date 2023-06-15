package com.futureweaver.custom.controller;

import com.futureweaver.custom.model.dto.CustomInfo;
import com.futureweaver.custom.service.InfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tian
 */
@Slf4j
@RestController
@RequestMapping("info")
public class InfoController {

    @Autowired
    private InfoService  infoService;

    @PostMapping("/add")
    public Boolean add(@RequestBody Integer cardID,String type){
        return infoService.save(cardID, type);

    }
}
