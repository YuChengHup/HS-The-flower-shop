package com.hs.service.impl;

import com.hs.entity.Logistic;
import com.hs.service.LogisticService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Logistic)表服务实现类
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
@Service("logisticService")
public class LogisticServiceImpl implements LogisticService {
    @Resource
    private LogisticDao logisticDao;

    /**
     * 通过ID查询单条数据
     *
     * @param logId 主键
     * @return 实例对象
     */
    @Override
    public Logistic queryById(String logId) {
        return this.logisticDao.queryById(logId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Logistic> queryAllByLimit(int offset, int limit) {
        return this.logisticDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param logistic 实例对象
     * @return 实例对象
     */
    @Override
    public Logistic insert(Logistic logistic) {
        this.logisticDao.insert(logistic);
        return logistic;
    }

    /**
     * 修改数据
     *
     * @param logistic 实例对象
     * @return 实例对象
     */
    @Override
    public Logistic update(Logistic logistic) {
        this.logisticDao.update(logistic);
        return this.queryById(logistic.getLogId());
    }

    /**
     * 通过主键删除数据
     *
     * @param logId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String logId) {
        return this.logisticDao.deleteById(logId) > 0;
    }
}