package com.futureweaver.custom.service;

import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.service.IService;
import com.futureweaver.custom.model.po.Info;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tian
 * @since 2023-06-15
 */
public interface InfoService extends IService<Info> {


    Boolean save(Integer cardID, String type);
}
