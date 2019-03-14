package com.hu.demo.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.hu.demo.entity.ReturnResult;
import com.hu.demo.utils.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Date: 2019/2/1 15:30
 * @Author: huwl
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("common/{module}")
public class CommonController {
    @RequestMapping("getDataList")
    public ReturnResult getDataList(@RequestParam Map<String, Object> params, @RequestParam(name = "pageNumber", defaultValue = "1") int pageNumber, @RequestParam(name = "pageSize", defaultValue = "10") int pageSize, @PathVariable String module) throws InvocationTargetException, IllegalAccessException {
        ReturnResult result = new ReturnResult();
        Page<?> page = new Page<>(pageNumber, pageSize);
        List<?> list = new LinkedList<>();
        try {
            Class<?> clazz = Class.forName("com.hu.demo.service." + StringUtils.uppercaseFirstChar(module) + "Service");
            Method method = clazz.getMethod("selectByPage", Page.class, Map.class);
            Object service = SpringContextUtil.getBean(clazz);
            list = (List<?>) method.invoke(service, page, params);
        } catch (ClassNotFoundException e) {
            log.error(e + "ClassNotFoundException");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        result.setCode("success");
        result.setData(list);
        result.setPages(page.getPages());
        result.setTotal(page.getTotal());
        result.setMsg("获取成功");
        return result;
    }
}
