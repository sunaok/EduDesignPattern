package jp.goldhonest.FacadePattern;

/**
 * Created by 1256670 on 2015/07/01.
 */
public class Librarian {
    public String searchBook(String bookName) {
        //�{��T��
        BookList bookList = new BookList();
        String location = bookList.searchBook(bookName);
        //�{�̏ꏊ��null�ł͂Ȃ��i�������Ă���j�Ƃ�
        if (location != null) {
            //�ݏo�����`�F�b�N����
            LendingList lendingList = new LendingList();
            if (lendingList.check(bookName)) {
                //�ݏo���̂Ƃ�
                return "�ݏo���ł�";
            } else {
                //�ݏo���ł͂Ȃ��Ƃ�
                return location;
            }


        } else {
            return "���̖{�͏������Ă��܂���";
        }
    }
}
