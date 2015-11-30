package com.book.buy.dao;

import java.sql.SQLException;
import java.util.List;

import com.book.buy.vo.BookVo;

/**
*	图书Dao
*	@author Nvpiao
*	@time:2015年10月27日 上午12:39:38
*/
public interface BookDao{
	/**
	 * 增加二手图书
	 * @param book
	 * @throws SQLException
	 */
	public void addBook(BookVo book) throws SQLException;
	
	/**
	 * 删除二手图书
	 * @param name
	 * @throws SQLException
	 */
	public void deleteBookById(Integer id) throws SQLException;
	
	/**
	 * 修改二手图书信息
	 * @param book
	 * @throws SQLException
	 */
	public void updateBook(BookVo book) throws SQLException;
	
	/**
	 * 按照图书编号查找图书
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public BookVo findById(Integer id) throws SQLException;
	
	/**
	 * 按照书名和作者去查找图书(name和description相同)
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public BookVo findByNameAndUserIDAndAuthor(String name, String author) throws SQLException;
	
	/**
	 * 按照图书上架顺序进行排序
	 * @return
	 * @throws SQLException
	 */
	public List<BookVo> findLatestBook() throws SQLException;
	
	/**
	 * 按照图书名称查找所有图书
	 * @param name
	 * @return
	 * @throws SQLException
	 */
	public List<BookVo> findAllByName(String name) throws SQLException;
	
	/**
	 * 按照图书名称查找所有图书（分页）
	 * @param name
	 * @param start
	 * @param length
	 * @return
	 * @throws SQLException
	 */
	public List<BookVo> findAllByName(String name, Integer start, Integer length) throws SQLException;
	
	/**
	 * 按照图书名称和作者查找图书
	 * @param name
	 * @param author
	 * @return
	 */
	public List<BookVo> findAllByNameAndAuthor(String name, String author) throws SQLException;
	
	/**
	 * 按照图书名称和作者查找图书(分页)
	 * @param name
	 * @param author
	 * @param start
	 * @param length
	 * @return
	 * @throws SQLException
	 */
	public List<BookVo> findAllByNameAndAuthor(String name, String author, Integer start, Integer length) throws SQLException;
	
	/**
	 * 按照专业编号查询所有的图书
	 * @param majorID
	 * @return
	 * @throws SQLException
	 */
	public List<BookVo> findAllByMajorID(Integer majorID) throws SQLException;
	
	/**
	 * 按照专业编号查询所有的图书(分页)
	 * @param majorID
	 * @param start
	 * @param length
	 * @return
	 * @throws SQLException
	 */
	public List<BookVo> findAllByMajorID(Integer majorID, Integer start, Integer length) throws SQLException;

	/**
	 * 释放连接
	 * @param conn
	 */
	public void close();
}
