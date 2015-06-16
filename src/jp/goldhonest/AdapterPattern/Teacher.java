package jp.goldhonest.AdapterPattern;

/**
 * Created by 1256670 on 2015/06/15.
 * Adapterパターンは、インタフェースに互換性の無いクラス同士を組み合わせることを目的としたパターンです。
 例えば、これまで利用していたメソッドと同じ機能を、よりすぐれた形で提供するメソッドを持つクラスの存在を知ったとします。しかし、このすぐれたメソッドは、これまで利用していたメソッドとは異なるインタフェースを持つため、乗り換えるとなると多大な変更を余儀なくされる場合があります。こんなとき、この2つのメソッドのインタフェースの違いを吸収してやる Adapter を準備することで、少ない変更で新しいメソッドに乗り換えることができるのです。
 このような目的を果たすため Adapter パターンでは、2つの方法を与えています。一方は継承を利用した方法で、もう一方は委譲を利用したものです。
 サンプルケース1（継承を利用した Adapter パターン）
 http://www.techscore.com/tech/DesignPattern/Adapter/Adapter1.html/#dp2-2
 サンプルケース2（委譲を利用した Adapter パターン）
 http://www.techscore.com/tech/DesignPattern/Adapter/Adapter2.html/
 Adapterパターン まとめ
 http://www.techscore.com/tech/DesignPattern/Adapter/Adapter2.html/#dp2-4
 */
public class Teacher {
    public static void main(String[] args) {
//        Chairperson tr = new NewTaro();
//        tr.organizeClass();
        Chairperson hanako = new Hanako();
        hanako.organizeClass();

    }
}
