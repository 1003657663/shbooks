package com.book.buy.dao;

import com.book.buy.vo.LocationVo;

import java.sql.SQLException;

/**
 * Created by chao on 2015/10/28.
 * version=1.0
 */
public interface LocationDao {
    
    /**
     * 增加Location
     * @param locationVo
     * @throws SQLException
     */
    void addLocation(LocationVo locationVo) throws SQLException;
    
    /**
     * 得到Location
     * @param userID
     * @return
     * @throws SQLException
     */
    LocationVo getLocationByuserID(int userID) throws SQLException;

    /**
     * 更新Location
     *
     */
    void UpdateLocation(LocationVo locationVo) throws SQLException;

    void close();
}
