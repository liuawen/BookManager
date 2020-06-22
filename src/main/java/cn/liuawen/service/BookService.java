package cn.liuawen.service;


import cn.liuawen.dao.BookDAO;
import cn.liuawen.model.Book;
import cn.liuawen.model.enums.BookStatusEnum;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create : 2019-02-12
 */
@Service
public class BookService {

  @Autowired
  private BookDAO bookDAO;

  public List<Book> getAllBooks() {
    return bookDAO.selectAll();
  }

  public int addBooks(Book book) {
    return bookDAO.addBook(book);
  }

  public void deleteBooks(int id) {
    bookDAO.updateBookStatus(id, BookStatusEnum.DELETE.getValue());
  }

  public void recoverBooks(int id) {
    bookDAO.updateBookStatus(id, BookStatusEnum.NORMAL.getValue());
  }
}
