package com.hs.service;

import com.hs.entity.Commodity;
import java.util.List;

/**
 * (Commodity)表服务接口
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
public interface CommodityService {

    /**
     * 通过ID查询单条数据
     *
     * @param comId 主键
     * @return 实例对象
     */
    Commodity queryById(Integer comId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Commodity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param commodity 实例对象
     * @return 实例对象
     */
    Commodity insert(Commodity commodity);

    /**
     * 修改数据
     *
     * @param commodity 实例对象
     * @return 实例对象
     */
    Commodity update(Commodity commodity);

    /**
     * 通过主键删除数据
     *
     * @param comId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer comId);

}