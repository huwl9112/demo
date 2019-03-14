package com.hu.demo.service;

import com.hu.demo.entity.Category;
import com.baomidou.mybatisplus.service.IService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author allnas
 * @since 2019-02-27
 */
@Service
public interface CategoryService extends IService<Category>,CommonService<Category> {

}
