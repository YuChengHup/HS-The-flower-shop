package com.hs.service;

import com.hs.entity.Consumer;
import java.util.List;

/**
 * (Consumer)表服务接口
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
public interface ConsumerService {

    /**
     * 通过ID查询单条数据
     *
     * @param conId 主键
     * @return 实例对象
     */
    Consumer queryById(Integer conId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Consumer> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param consumer 实例对象
     * @return 实例对象
     */
    Consumer insert(Consumer consumer);

    /**
     * 修改数据
     *
     * @param consumer 实例对象
     * @return 实例对象
     */
    Consumer update(Consumer consumer);

    /**
     * 通过主键删除数据
     *
     * @param conId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer conId);

}