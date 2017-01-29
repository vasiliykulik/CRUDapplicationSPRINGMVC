import com.skyblesoft.books.dao.BookDaoImpl;

/**
 * Created by Raketa on 29.01.2017.
 */
public class Runner {
  public static void main(String[] args) {
    BookDaoImpl bookDao = new BookDaoImpl();
    System.out.println(bookDao.listBooks());
  }
}
