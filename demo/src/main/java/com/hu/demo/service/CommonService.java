package com.hu.demo.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.hu.demo.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @Date: 2019/2/27 11:18
 * @Author: huwl
 * @Description:
 */
public interface CommonService<T> {
    List<T> selectByPage(Page<T> page, Map<String,Object> params);
}
