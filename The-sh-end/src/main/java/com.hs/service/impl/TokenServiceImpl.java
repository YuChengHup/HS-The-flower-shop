package com.hs.service.impl;

import com.hs.entity.Token;
import com.hs.service.TokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Token)表服务实现类
 *
 * @author makejava
 * @since 2021-10-22 20:54:50
 */
@Service("tokenService")
public class TokenServiceImpl implements TokenService {
    @Resource
    private TokenDao tokenDao;

    /**
     * 通过ID查询单条数据
     *
     * @param token 主键
     * @return 实例对象
     */
    @Override
    public Token queryById(String token) {
        return this.tokenDao.queryById(token);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Token> queryAllByLimit(int offset, int limit) {
        return this.tokenDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param token 实例对象
     * @return 实例对象
     */
    @Override
    public Token insert(Token token) {
        this.tokenDao.insert(token);
        return token;
    }

    /**
     * 修改数据
     *
     * @param token 实例对象
     * @return 实例对象
     */
    @Override
    public Token update(Token token) {
        this.tokenDao.update(token);
        return this.queryById(token.getToken());
    }

    /**
     * 通过主键删除数据
     *
     * @param token 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String token) {
        return this.tokenDao.deleteById(token) > 0;
    }
}