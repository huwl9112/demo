package com.hu.demo.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.hu.demo.entity.OperationLog;
import com.hu.demo.dao.OperationLogDao;
import com.hu.demo.service.OperationLogService;
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
public class OperationLogServiceImpl extends ServiceImpl<OperationLogDao, OperationLog> implements OperationLogService {
    @Autowired
private OperationLogDao operationLogDao;
    @Override
    public List<OperationLog> selectByPage(Page<OperationLog> page, Map<String, Object> params) {
        return operationLogDao.selectByPage(page,params);
    }
}
