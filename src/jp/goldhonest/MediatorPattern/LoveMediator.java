package jp.goldhonest.MediatorPattern;

/**
 * Created by 1256670 on 2015/07/02.
 * 16.1 Mediator パターンとは
 第16章では Mediator パターンを学びます。 Mediator とは、英語で「仲裁人、調停者」を意味する単語です。 Mediator パターンとは、多数のオブジェクトの間の調整を行いながら処理をすすめる必要が ある場合に利用すると威力を発揮するパターンです。

 例えば、車どおりの多い交差点で信号が壊れた時に、警官が交通整備をしないとどうなるでしょう？ それぞれの車が、めいめい判断し、行けると思ったら進む。こんな状態で、 信号の故障をうまく乗り切ることができるでしょうか？おそらく無理でしょう。 いくら皆が一生懸命周囲の状況を確認しても、全員が同じ認識にいたるはずがありません。 そこで、仲裁人である「交通巡査」の登場です。彼は、周囲の状況を見渡し、判断した上で、 「進め」や「止まれ」の指示を出します。全ての車は、交通巡査の指示通りに進んだり止まったりするわけです。

 Mediator パターンは、複数のオブジェクト間の調整をするために、 各オブジェクトからの問い合わせを受け、 適宜判断を行い指示を出す「仲裁人」の役割を果たすクラスを利用するパターンです。

 http://www.techscore.com/tech/DesignPattern/Mediator.html/
 */
public interface LoveMediator {
    void addColleague(Colleague colleague);
    int consultation(Colleague colleague, Colleague colleague2);
}
