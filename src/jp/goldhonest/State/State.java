package jp.goldhonest.State;

/**
 * Created by 1256670 on 2015/07/21.
 *19.1 State パターンとは
 第19章では State パターンを学びます。State とは、英語で「状態」を意味する単語です。 オブジェクト指向設計では、モノをクラスとして表現することが多くあります。State パターンとは、 モノではなく、「状態」をクラスとして表現するパターンです。

 状態によって、動作のパターンが変わることがよくあります。 例えば、「機嫌のいい状態」「機嫌が悪い状態」の2つの状態があるお母さんにいくつか頼みごとをすることを考えます。 機嫌のいい状態のお母さんに「お小遣い頂戴」「おやつ頂戴」などのお願いをした場合、 「はいはい」といってお小遣いをくれたり、おやつを出してくれたりするでしょう。 しかし、機嫌の悪い状態のお母さんにこれらのお願いをしても聞き入れてくれないかもしれません。 お母さんは状態によって、振る舞いが変わるわけです。

 State パターンとは、このような、状態の変化に応じて振る舞いが変わるような場合に威力を発揮するパターンです。

 *
 */
interface State {
    String morningGreet();

    String getProtectionForCold();
}
