## Javaとは
1995年にサンマイクロシステムズによって公開されたプログラミング言語です。  
Javaのプログラムを作る時に必要な機能がパッケージされた「JDK(Development Kit)」というものがあります。

## Javaが得意なこと
- Webアプリケーションの開発
- Androidアプリの開発

## プログラミング言語トレンドランキング2位

## Javaの特徴

### コンパイラ言語
Javaはコンパイラ言語で、機械語に一括して変換してから実行するプログラミング言語です。そのため、処理が高速です。  
- ソースコード → 変換 → 機械語 (0100010010010111001100)

### オブジェクト指向言語
Javaはオブジェクト指向言語であり、オブジェクト指向開発という「データと処理」を1セットとしてプログラムを組み立てる手法に適しています。  
- カプセル化、継承、多態性などの概念が影響を与えています。

同じオブジェクト指向言語には、以下の言語があります：
- C++
- C#
- Kotlin

### OSを選ばない
Javaは、Windows、MacOS、Linuxなど、どのプラットフォームでも動作します。  
なぜなら、JavaはJVM（Java仮想マシン）上で動作するからです。

#### JVMとは？
Java Virtual Machine（Java仮想マシン）です。  
Javaプログラムは、以下の流れで実行されます：
- Java → (ソースコード) → コンパイラ → (バイナリコード) → JVM → (機械語) → 読み込み → Windows/MacOS/Linux  
JVMがパソコンに読み取れる機械語へ変換してから実行されるので、どのプラットフォームでも動作します。

### JVM言語
JVM上で動作する言語のことを指します。  
- Java
- Scala
- Kotlin

これらの言語は相互運用性があり、例えばKotlinからJavaで作られたコードを呼び出すことができます。


・環境構築
  プログラムを書いたり実行できたりする環境を自分のコンピュータに整えることをいう
  環境構築のためにJDK,VSCodeをインストール
JDK(Java Development Kit)とは
  プログラムを実行する時に必要な機能がパッケージされたもの
  OracleのサイトからJDKをダウンロード(https://www.oracle.com/jp/java/technologies/downloads/)


  ## プログラムで作れるもの
  - インターネットのサービス
  - 人工知能
  - スマホアプリ
  - ゲーム
  
  ## ３つの基本構造（制御構造・制御フロー）
  
  ### 順次進行
  → 処理A → 処理B → 処理C  
  プログラムが書かれている上から順に処理をしていくプログラム構造です。
  
  ### 条件分岐
  → 条件 → YES → 処理A  
  → NO → 処理B  
  特定の条件のときはAという処理、そうでない時にはBという処理をするプログラム構造です。
  
  ### 繰り返し（反復処理）
  → 条件 → YES → 処理A → 条件 → YES → 処理A → 条件 → YES → 処理A（繰り返し）  
  → NO → 終了  
  決まった回数や条件を満たすまで同じ処理を繰り返すプログラム構造です。
  
  ## Javaファイルの作成
  
  ### クラスの定義
  クラスを定義してプログラムを作っていくので、Javaの土台となる部分になります。  
  クラスを定義する際、最初に`class`と記述するのは「ルール」です。
  
  - `class`の次はどんな名前のクラスか（クラス名）を決めます。
    - ファイルとクラス名は同じにする必要があります。
    - クラス名の最初は大文字です。
    - クラス名の次は波括弧 `{}` です。
    - 波括弧 `{}` で括られた部分をブロックと呼び、その中に処理を記述します。
  
  ### メソッド（処理）
  メソッドの定義の例：
  ```java
  // public static void main(String[] args) {
  // }
  

  コンパイル方法と実行
  処理の終わりにはセミコロン「;」を書きます。
  コンパイルとは、Javaのプログラムをパソコンが読み取れる機械語に変換することです。
  コンパイル方法
  bash
  javac Greeting.java
  すると、同じディレクトリにGreeting.classというファイルが作成されます。
  
  ファイルの実行
  bash
  java Greeting
  実行結果
  nginx
  Good morning
  Good afternoon
  Good evening
  変数
  変数にデータを入れることを「代入」といい、取り出すことを「参照」といいます。
  変数を作ることを「変数を宣言する」と言います。
  変数を宣言する時は、入れるデータの種類を指定する必要があります。これが「データ型」です。
  
  変数の宣言
  整数のデータ型の変数を宣言する時には「int型」を使います。
  
  変数名のルール
  アルファベット: abc
  数字: 123
  アンダースコア: _
  ドルマーク: $
  変数名は数字から始めることはできません。また、_や$以外の記号を使うこともできません。
  
  予約語（すでに役割が決まっている単語）
  return
  class
  for
  while


  ### データ型
  変数に入れるデータの種類のことです。
  
  #### 整数 (byte, short, int, long)
  数値の範囲に違いがあります。
  - `byte`   -100 ～ 100
  - `short`   -3万 ～ +3万
  - `int`   -20億 ～ +20億
  - `long`   兆の次の単位「京」の桁以上
  
  `long`の場合、最後に小文字または大文字の「L」をつける必要があります。
  
  #### 少数 (float, double)
  扱える小数点以下の桁数に違いがあります。
  - `float`   longの時と同じように、終わりにアルファベット「F」をつけます。
  - `double`   `float`より多い（小数点を使う時は`double`を使うことが多い）
  
  #### 文字 (char, String)
  - `char`   文字１つ、シングルクォーテーション
  - `String`   文字２つ以上、ダブルクォーテーション  
    `String`は正確にはデータ型ではなく、`String`というクラスで、`S`は大文字です。
  
  #### ブール型 (Boolean型)
  `True` or `False`の2つのうち、どちらか1つを持つ型です。  
  `True`と`False`のことを、真と偽、はいといいえ、0と1とも言います。
  

  ### 配列
  配列は、複数のデータを格納することができるデータ型です。  
  例えるなら、変数は一つのデータしか入れない「箱」であるのに対して、配列は複数のデータを入れることができる「ロッカー」です。  
  
  - 一列の配列のことを**1次元配列**といい、2次元以上の配列は**多次元配列**と呼びます。
  - 箱の数を**要素数**と言います。
  - 配列のそれぞれの要素には、場所の情報が割り振られており、この住所には**インデックス番号**（添え字）というものが割り当てられています。
  
  ### 配列の宣言
  
  配列の宣言と代入は、別々に行う方法と、それらを同時に行う方法があります。
  
  #### 1. 宣言と代入を別々にする方法
  ```java
  データ型[] 配列変数名;
  配列変数名 = new データ型[要素数];
  配列を扱う変数のことを配列変数と呼び、その名前を配列変数名と言います。
  2. 配列の宣言と同時にデータを代入する方法
  java
  データ型[] 配列変数 = {データ1, データ2, ...};
  この方法では、配列の中身を同時に初期化することができます。


  ### if文
  ```java
  if (条件) {
      条件を満たした時の処理; // この行はインデントをひとつ右にずらして書く
  }
  波括弧は省略可能ですが、あった方がプログラムの可読性が上がります。
  if文は条件を満たさないと処理されずにプログラムが終了します。
  if~else文
  java
  if (条件) {
      条件を満たした時の処理;
  } else {
      条件を満たさない時の処理;
  }
  else文は、条件を満たさない時の処理を記述・実行することができます。
  else if文
  java
  if (条件A) {
      条件Aを満たした時の処理;
  } else if (条件B) {
      条件Bを満たした時の処理;
  } else { // AもBも満たさない時の処理
      条件を満たさない時の処理;
  }
  複数の条件を順番にチェックして処理を行うことができます。条件AもBも満たさない場合、elseブロックが実行されます。