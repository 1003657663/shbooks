package com.book.buy.dao;

import java.sql.SQLException;
import java.util.List;

import com.book.buy.vo.FeedBackVo;

public interface FeedBackDao {
        /**
         * 添加反馈信息
         * @param FeedBack
         * @throws SQLException
         */
		void addFeedBack(FeedBackVo FeedBack)throws SQLException;
	 
	 /**
	  * 删除反馈信息
	  * @param userId
	  * @throws SQLException
	  */
	 void deleteFeedBack(int userId)throws SQLException;
	 
	 /**
	  * 显示反馈信息
	  * @param userId
	  * @return
	  * @throws SQLException
	  */
	 List<FeedBackVo> showFeedBack()throws SQLException;
	 
	 /**
	  * 释放连接
	  */
	 void close();

	
}
