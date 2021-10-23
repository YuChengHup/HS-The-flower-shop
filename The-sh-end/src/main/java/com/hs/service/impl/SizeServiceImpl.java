package com.hs.service.impl;

import com.hs.entity.Size;
import com.hs.service.SizeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Size)表服务实现类
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
@Service("sizeService")
public class SizeServiceImpl implements SizeService {
    @Resource
    private SizeDao sizeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sizId 主键
     * @return 实例对象
     */
    @Override
    public Size queryById(Integer sizId) {
        return this.sizeDao.queryById(sizId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Size> queryAllByLimit(int offset, int limit) {
        return this.sizeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param size 实例对象
     * @return 实例对象
     */
    @Override
    public Size insert(Size size) {
        this.sizeDao.insert(size);
        return size;
    }

    /**
     * 修改数据
     *
     * @param size 实例对象
     * @return 实例对象
     */
    @Override
    public Size update(Size size) {
        this.sizeDao.update(size);
        return this.queryById(size.getSizId());
    }

    /**
     * 通过主键删除数据
     *
     * @param sizId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sizId) {
        return this.sizeDao.deleteById(sizId) > 0;
    }
}