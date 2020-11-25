package com.jh.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jh.common.utils.PageUtils;
import com.jh.gulimail.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author JH
 * @email 457376245@qq.com
 * @date 2020-10-29 10:15:10
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

