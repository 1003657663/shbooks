package com.book.buy.dao;

import java.sql.SQLException;
import java.util.List;

import com.book.buy.vo.WantVo;

public interface WantDao {
        /** 
         * 添加心愿单  
         */
		void addWant(WantVo want) throws SQLException;

	/** 
	 * 删除心愿单 
	 */
	void delWant(Integer userID, Integer bookID) throws SQLException;

	/** 
	 * 更新心愿单  
	 */
	void updateWant(WantVo want) throws SQLException;

	/** 
	 * 根据用户名和书名查询item 
	 */
	WantVo findByuseridandbookid(Integer userID, Integer bookID) throws SQLException;

	/** 
	 * 根据用户id查询所有心愿单item 
	 */
	List<WantVo> findAllwant(Integer userID) throws SQLException;
	
	/** 
	 * 根据书籍id查询所有用户 
	 */
	WantVo findBybookid(Integer bookID) throws SQLException;

	/** 
	 * 释放链接  
	 */
	void close() throws SQLException;
}
