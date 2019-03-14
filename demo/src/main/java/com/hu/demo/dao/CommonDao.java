package com.hu.demo.dao;

import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;
import java.util.Map;

/**
 * @Date: 2019/2/27 11:27
 * @Author: huwl
 * @Description:
 */
public interface CommonDao<T> {
    List<T> selectByPage(Page<T> page, Map<String,Object> params);
}
