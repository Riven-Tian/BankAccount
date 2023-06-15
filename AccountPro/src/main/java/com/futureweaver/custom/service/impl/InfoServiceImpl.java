package com.futureweaver.custom.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.futureweaver.custom.mapper.InfoMapper;
import com.futureweaver.custom.model.po.Info;
import com.futureweaver.custom.service.InfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tian
 */
@Slf4j
@Service
public class InfoServiceImpl extends ServiceImpl<InfoMapper, Info> implements InfoService {

    @Resource
    private InfoMapper infoMapper;


    @Override
    public Boolean save(Integer cardID, String type) {
        return null;
    }
}
