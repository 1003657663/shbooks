package com.book.buy.dao;

import com.book.buy.vo.ManagerVo;

import java.sql.SQLException;

/**
 * Created by violet on 2015/11/4.
 */
public interface ManagerDao {
    /**
     * 添加管理员
     */
    void addManager(ManagerVo manager) throws SQLException;

    /**
     * 删除管理员
     */
    void deleteManager(int id) throws SQLException;

    /**
     * 通过用户名获得密码
     */
    ManagerVo getPwdByName(String username) throws SQLException;

    /**
     * 关闭数据库连接
     */
    void close();
}
