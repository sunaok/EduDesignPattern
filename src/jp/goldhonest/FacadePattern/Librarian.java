package jp.goldhonest.FacadePattern;

/**
 * Created by 1256670 on 2015/07/01.
 */
public class Librarian {
    public String searchBook(String bookName) {
        //本を探す
        BookList bookList = new BookList();
        String location = bookList.searchBook(bookName);
        //本の場所がnullではない（所蔵している）とき
        if (location != null) {
            //貸出中かチェックすｒ
            LendingList lendingList = new LendingList();
            if (lendingList.check(bookName)) {
                //貸出中のとき
                return "貸出中です";
            } else {
                //貸出中ではないとき
                return location;
            }


        } else {
            return "その本は所蔵していません";
        }
    }
}
