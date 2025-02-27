## プログラムの構成

```java
class クラス名 {
  public static void main(String[] args) {
    // 処理文
  }
}
Javaのプログラムはクラスの集まりです。
クラス名とソースプログラムのファイル名を合わせることが重要です。
クラスの内容は {} の間（ブロック）に書きます。
処理のまとまりはメソッドと呼ばれ、Javaは main メソッドから実行されます。
処理文は ; セミコロンで終わります。
System.out.println() は () 内のデータを表示します。

## わかりやすいプログラムを書く3つのポイント

### ① コメント: プログラム内のメモ書き

- `//コメント` 1行のコメント
- `/*コメント*/` 複数行のコメント

### ② フォーマット: プログラムの体裁

- ブロックの開始・終了や処理文毎に改行する
- タブや半角スペースで字下げ（インデント）する

### ③ 命名ルール: 名付けの慣習

- 1文字目:
  - クラス・インタフェース: 大文字
  - 変数・メソッド・パッケージ: 小文字
- 2つ目以降の単語は大文字から


## 変数

### ・変数はデータの入れ物

### ・変数名のルール
- 1文字目:
  - 英字(a~z, A~Z), `_`, `.` , `$`
- 2文字目以降は数字も可
- キーワードは使えない（`public`, `static`, `void` など）

### ・変数の使い方

#### ① 宣言する: 変数を作る
- データ型 変数名, 変数名, .....;
- 例: `int month, day;`

#### ② 代入する: 値を入れる
- `変数名 = 値;`
- 例: `age = 20;`

#### ③ 参照する: 値を見る
- ① + ② 初期化する
- 例: `int age = 20;`

```java
class Variable {
  public static void main(String[] args) {
    int month;
    month = 9;
    int day = 16;

    System.out.println("この勉強は、");
    System.out.println(month + "月" + day + "日にしました！");
  }
}


## データ型 (基本データ型)(参照型)

データ型は、データの種類であり、3000種類以上のデータ型があります。

### ① 基本データ型

#### 整数
- `byte`    8ビット
- `short`   16ビット
- `int`     32ビット
- `long`    64ビット

#### 小数
- `float`   32ビット (4バイト、単精度浮動小数点数)
- `double`  64ビット (8バイト、倍精度浮動小数点数)

#### 文字
- `char`    16ビット (1文字、Unicode)

#### 真偽値
- `boolean` true (真) / false (偽)

### ② 参照型
- 文字列 (`String`)
- 配列

数値はデフォルトで `int` と `double` 型です。  
`float` 型の小数には `f` または `F` を、`long` 型の整数には `l` または `L` を付ける必要があります。  
文字データは `''` で囲みます。

```java
class DataType {
  public static void main(String[] args) {
    int month = 12;
    int day = 29;
    float weight = 63.0f;
    double height = 168.5;
    char bloodType = 'A';

    String name = "蕪木";

    System.out.println("こんにちは" + name + "です");
    System.out.println("身長は" + height + "cm、体重は" + weight + "kg");
    System.out.println("誕生日は" + month + "月" + day + "日");
    System.out.println("血液型は" + bloodType + "型です");
    System.out.println("よろしくお願いします");
  }
}
③ 参照型 (文字列: String)
java
コピーする
String name = "蕪木";
S は大文字で、文字列は "" で囲みます。
この "蕪木" という文字列のデータは、メモリ上の別の領域に保存されます。
name 変数には、"蕪木" という文字列がメモリ上のどこに保存されているかというアドレス（住所）の値が格納されます。これを参照値（アドレス）と言います。
16バイトの0と1で表現できることがわかります。
文字列は、最初に作られるときに何文字になるか、必要なメモリがどれぐらいかが分からないため、プログラム実行時に必要なメモリを確保し、そのメモリのアドレス（参照値）を変数に入れます。これにより、メモリを効率よく使うことができます。

データ自体はメモリ上の別の場所に置かれ、そのアドレス（参照値）が変数に格納されるため、これを参照型と呼びます。

基本データ型と参照型の違い
基本データ型: 変数の中にデータそのものが入る
参照型: 変数の中にはデータの参照値（アドレス）が入る
※入るものが明確に異なります。


## 配列

### ・配列は同じデータ型の変数を複数まとめて管理するもの

- 配列を生成するには `new` を使います。生成時にデフォルト初期化が設定されます。
  - 整数や少数なら `0`
  - 文字なら空文字 (`''`)
  - 真偽値なら `false`

### ・配列の生成方法
```java
データ型[] 配列名 = new データ型[要素数];
int[] score = new int[3];  // new int[3]なので、メモリ上に32ビットの整数を入れる領域を3つ作成
score には、このデータがメモリ上のどこにあるかというアドレスの値（参照値）が格納されます。
添字は [] 内の数字で、0から始まります。
java
コピーする
score[0] = 80;  // 添字0
・配列の初期化
java
コピーする
データ型[] 配列名 = {値1, 値2, ...};
・配列の長さを取得
java
コピーする
配列名.length  // 配列の要素数を取得できます
・例: 配列の使用例
java
コピーする
class Array {
  public static void main(String[] args) {
    int[] score = new int[3];
    score[0] = 80;
    score[1] = 100;
    score[2] = 75;

    String[] name = {"蕪木", "佐藤", "田中"};

    System.out.println(name[0] + "さん:" + score[0] + "点");
    System.out.println(name[1] + "さん:" + score[1] + "点");
    System.out.println(name[2] + "さん:" + score[2] + "点");
    System.out.println("受験者数:" + score.length + "名");
  }
}
・多次元配列
配列の中に配列を作成することができます。
java
コピーする
int[][] allScore = new int[2][3];  // [行][列]
一つ目の行は最初の数値が [0] で、列に合わせて [0][0], [0][1], [0][2] となります。
allScore.length は 2、allScore[0].length は 3 です。
・多次元配列の初期化
java
コピーする
int[][] allScore = {{10, 20, 30}, {40, 50, 60}};
・コマンドラインからのデータ入力
java コマンド実行時に、プログラムにデータを渡すことができます。
bash
コピーする
> java CmdLine Hello Java
java
コピーする
class CmdLine {
  public static void main(String[] args) {
    // コマンドラインから渡されたデータを受け取るString型の配列 args
  }
}
java
コピーする
class CmdLine {
  public static void main(String[] args) {
    System.out.println("args[0] : " + args[0]);
    System.out.println("args[1] : " + args[1]);
    System.out.println("args.length : " + args.length);
  }
}
コマンドラインから入力されたデータは、args 配列に格納され、プログラムが開始します。


## 演習問題

### Q.1
**GreetingBug.javaをコンパイルするとエラーが表示されてしまいました。どこが間違えているでしょうか。**

```java
class GreetingBug {
  pubric static void main(String args){
    System,out.println("こんにちは。");
    System.out.println("一緒に頑張りましょう");
  }
}
間違い

A___ public のスペルミス
A___ 2行目 [] が足りない
A___ 3行目の , が . である
A___ 3行目の : が ; である
A___ 6行目の { が } である
Q.2
ShowData.javaにコードを追加して、変数の値を画面に表示するプログラムを完成させてください。 変数のデータ型や変数名、値は以下の通り。

int num = 10
double pi = 3.14
char blood = 'A'
boolean fun = true
String msg = "好きなメッセージ"
java
コピーする
class ShowData {
  public static void main(String[] args) {
    // 変数の宣言と値の代入
    int num = 10;
    double pi = 3.14;
    char blood = 'A';
    boolean fun = true;
    String msg = "努力";

    // 値の表示
    System.out.println(num);
    System.out.println(pi);
    System.out.println(blood);
    System.out.println(fun);
    System.out.println(msg);
  }
}
Q.3
ArrayBug.javaをコンパイルして実行するとエラーが表示されてしまいました。どこをどのように直せば良いでしょうか。

java
コピーする
class ArrayBug {
  public static void main(String[] args) {
    String[] name = new String[4];

    name[0] = "蕪木";
    name[1] = "木下";
    name[2] = "佐藤";
    name[3] = "鈴木";
    name[4] = "大橋";  // ここがエラー

    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    System.out.println(name[4]);
  }
}
間違い

配列の指定は4つなので、添字 0 から 3 までの範囲で指定しなければなりません。
name[4] は範囲外です。正しくは、name[3] までに修正する必要があります。
Q.4
ScoreArray.javaにコードを追加して、テストの点数を表示するプログラムを完成させてください。

点数 (int型) を4つ格納する配列 data には以下の値を代入します。

配列 data
添字 0: 90
添字 1: 80
添字 2: 100
添字 3: 90
java
コピーする
class ScoreArray {
  public static void main(String[] args) {
    // 配列の生成
    int[] data = new int[4];

    // 配列に値を代入
    data[0] = 90;
    data[1] = 80;
    data[2] = 100;
    data[3] = 90;

    // 値を表示
    System.out.println("1人目は" + data[0] + "点");
    System.out.println("2人目は" + data[1] + "点");
    System.out.println("3人目は" + data[2] + "点");
    System.out.println("4人目は" + data[3] + "点");
  }
}


## 演算子

### ① 算術演算子
- `7 / 2 -> 3`  
  あまりは切り捨てられます。
- `7 % 2 -> 1`  
  余りを求める演算子です。

### ② 代入・複合代入演算子
- `a += b -> aにbを加えてaに代入`  
  これは `a = a + b` と同じです。

### ③ インクリメント・デクリメント演算子
- `a++ -> aに1を加える`  
  これは `a = a + 1` または `a += 1` と同じです。

### ④ 関係演算子
- `a >= 0 -> aが0以上ならtrue`

### ⑤ 論理演算子
- `(a >= 0) && (b >= 0) -> aが0以上かつbが0以上ならtrue`

### Integer.parseInt(): 文字列型をint型に変換
- `int a = Integer.parseInt(args[0]);`

### コード例

```java
class Operator {
  public static void main(String[] args) {
    // コマンドラインから入力したデータ(文字列型)をint型に変換する
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    System.out.println("a = " + a + ", b = " + b);
    System.out.println("a + b = " + (a + b));  // 計算結果の表示
    System.out.println("a - b = " + (a - b));  // 計算結果の表示
    System.out.println("a * b = " + (a * b));  // 計算結果の表示
    System.out.println("a / b = " + (a / b));  // 計算結果の表示
    System.out.println("a % b = " + (a % b));  // 計算結果の表示
    System.out.println("a >= 0 : " + (a >= 0));  // aが0以上かどうか
    System.out.println("(a >= 0) && (b >= 0) : " + ((a >= 0) && (b >= 0)));  // aとbが0以上かどうか
  }
}