package com.book.buy.dao;

import java.sql.SQLException;
import java.util.List;

import com.book.buy.vo.OrderFormVo;

public interface OrderformDao 
{	
    /** 
     * 添加购物车 
     * 
     */
    void addOrderform(OrderFormVo orderform) throws SQLException;
    
    /** 
     * 删除购物车item  
     */
    void delOrderform(Integer userID, Integer bookID) throws SQLException;
    
    /** 
     * 更新购物车item数据  
     */
    void updateOrderform(OrderFormVo orderform) throws SQLException;
    
    /** 
     * 根据用户id和书籍id进行查询  
     */
    OrderFormVo findByuseridandbookid(Integer userID, Integer bookID) throws SQLException;
    
    /** 
     * 根据用户id查询所有item 
     */
    List<OrderFormVo> findAllitem(Integer userID) throws SQLException;
    
    /** 
     * 释放链接  
     */
    void close() throws SQLException;
}