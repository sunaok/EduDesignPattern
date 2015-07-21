package jp.goldhonest.FacadePattern;

/**
 * Created by 1256670 on 2015/07/01.
 */
public class Visitor {
    public static void main(String[] args) {
        //昆虫図鑑はどこ？
        //いつどこのメソッドを使えばいいんだ？
        //↓結果
        //窓口の中村くんを作る
        Librarian nakamura = new Librarian();
        //中村くんに昆虫図鑑の場所を聞く
        String location = nakamura.searchBook("昆虫図鑑");
        if (location.equals("貸出中です")) {
            System.out.println("貸出中かよ");

        }else if (location.equals("その本は所蔵していません")) {
            System.out.println("なんだないのか");
        } else {
            System.out.println("さんくす");
        }
    }
}
