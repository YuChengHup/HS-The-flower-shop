package com.hs.service;

import com.hs.entity.Token;
import java.util.List;

/**
 * (Token)表服务接口
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
public interface TokenService {

    /**
     * 通过ID查询单条数据
     *
     * @param token 主键
     * @return 实例对象
     */
    Token queryById(String token);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Token> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param token 实例对象
     * @return 实例对象
     */
    Token insert(Token token);

    /**
     * 修改数据
     *
     * @param token 实例对象
     * @return 实例对象
     */
    Token update(Token token);

    /**
     * 通过主键删除数据
     *
     * @param token 主键
     * @return 是否成功
     */
    boolean deleteById(String token);

}