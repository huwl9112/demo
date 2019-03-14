package com.hu.demo.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.hu.demo.entity.Category;
import com.hu.demo.dao.CategoryDao;
import com.hu.demo.service.CategoryService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author allnas
 * @since 2019-02-27
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, Category> implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> selectByPage(Page<Category> page, Map<String, Object> params) {
        return categoryDao.selectByPage(page,params);
    }
}
